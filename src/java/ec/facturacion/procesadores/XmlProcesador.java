/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.procesadores;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.facturacion.catalogos.Ambiente;
import ec.facturacion.catalogos.CodigoImpuesto;
import ec.facturacion.catalogos.CodigoPorsentaje;
import ec.facturacion.catalogos.Comprobante;
import ec.facturacion.entidades.Factura;
import ec.facturacion.catalogos.FormaPago;
import ec.facturacion.catalogos.Moneda;
import ec.facturacion.catalogos.ObligadoContabilidad;
import ec.facturacion.catalogos.TipoEmision;
import ec.facturacion.catalogos.TipoIdentificacionComprador;
import ec.facturacion.catalogos.UnidadTiempo;
import ec.facturacion.catalogos.Version;
import ec.facturacion.entidades.Detalle;
import ec.facturacion.entidades.DetallesAdicionales;
import ec.facturacion.entidades.InfoFactura;
import ec.facturacion.entidades.InfoTributaria;
import ec.facturacion.entidades.Pago;
import ec.facturacion.entidades.TotalImpuesto;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 *
 * @author Gabriel
 */
public class XmlProcesador {

    public static ByteArrayOutputStream convertirObjetoAXml(Class xmlClass, Object object)
            throws IOException, JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(xmlClass);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        jaxbMarshaller.marshal(object, baos);
        return baos;

    }
    
    public static void main(String[] args) throws IOException, JAXBException {
        TotalImpuesto totalImpuesto = new TotalImpuesto();
        totalImpuesto.setCodigo(CodigoImpuesto.IVA);
        totalImpuesto.setCodigoPorsentaje(CodigoPorsentaje.IVA_0);
        totalImpuesto.setBaseImponible(25.50);
        totalImpuesto.setValor(35.55);
        
        InfoFactura infoFactura = new InfoFactura();
        infoFactura.setFechaEmision("12/45/78");
        infoFactura.setDirEstablecimiento("Quito sur");
        infoFactura.setObligadoContabilidad(ObligadoContabilidad.SI);
        infoFactura.setTipoIdentificacionComprador(TipoIdentificacionComprador.CEDULA);
        infoFactura.setGuiaRemision("001-001-00000001");
        infoFactura.setRazonSocialComprador("Gabriel Salazar Ortiz");
        infoFactura.setIdentificacionComprador("1723713556");
        infoFactura.setDireccionComprador("Quito Norte");
        infoFactura.setTotalSinImpuestos(25.50);
        infoFactura.setTotalDescuento(0.0);
        
        List<TotalImpuesto> listaImpuestos = new ArrayList<>();
        listaImpuestos.add(totalImpuesto);
        
        infoFactura.setTotalConImpuestos(listaImpuestos);
        infoFactura.setPropina(0.25);
        infoFactura.setImporteTotal(100.00);
        infoFactura.setMoneda(Moneda.DOLAR);
        
        Pago pago = new Pago();
        pago.setFormaPago(FormaPago.TARJETA_PREPAGO);
        pago.setPlazo(25);
        pago.setTotal(50.02);
        pago.setUnidadTiempo(UnidadTiempo.DIAS);
        
        List<Pago> pagos = new ArrayList<>();
        
        pagos.add(pago);
        
        infoFactura.setPagos(pagos);
        infoFactura.setValorRetIva(15.54);
        infoFactura.setValorRetRenta(15.46);
        
        Detalle detalle = new Detalle();
        detalle.setCantidad(25.5);
        detalle.setCodigoAuxiliar("12");
        detalle.setCodigoPrincipal("25");
        detalle.setDescripcion("Cosa bonita");
        detalle.setDescuento(0.0);
        detalle.setPrecioTotalSinImpuesto(50.65);
        detalle.setPrecioUnitario(25.15);
        
        List<Detalle> detallee = new ArrayList<>();
        detallee.add(detalle);
        
        DetallesAdicionales adicionales = new DetallesAdicionales();
        adicionales.setNombre("Direccion");
        adicionales.setValor("Maldito");
        
        List<DetallesAdicionales> listadetalles = new ArrayList<>();
        listadetalles.add(adicionales);
        
        detalle.setDetallesAdicionales(listadetalles);
        detalle.setImpuestos(listaImpuestos);
        
        InfoTributaria infoTributaria = new InfoTributaria();
        infoTributaria.setAmbiente(Ambiente.PRUEBAS);
        infoTributaria.setTipoEmision(TipoEmision.EMISION_NORMAL);
        infoTributaria.setRazonSocial("Cineto Telecomunicaciones S.A.");
        infoTributaria.setRuc("1723713556-001");
        infoTributaria.setDirMatriz("La Pinta y Rábida");
        
        
        Factura factura = new Factura();
        factura.setInfoAdicional(listadetalles);
        factura.setDetalles(detallee);
        factura.setId(Comprobante.FACTURA);
        factura.setInfoFactura(infoFactura);
        factura.setInfoTributaria(infoTributaria);
        factura.setVersion(Version.VERSION_1_0_0);
        
        //System.out.println(XmlProcesador.convertirObjetoAXml(InfoFactura.class, infoFactura));
       // System.out.println(XmlProcesador.convertirObjetoAXml(Detalle.class, detalle));
       
      System.out.println(XmlProcesador.convertirObjetoAXml(Factura.class, factura));
       
//       final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
//        final String representacionBonita = prettyGson.toJson(factura);
//        System.out.println(""+representacionBonita);
    }

}
