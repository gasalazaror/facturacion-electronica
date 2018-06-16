/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.Comprobante;
import ec.facturacion.catalogos.Version;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {

    @XmlAttribute
    private Comprobante id;

    @XmlAttribute
    private Version version;

    private InfoTributaria infoTributaria;

    private InfoFactura infoFactura;

    @XmlElementWrapper(name = "detalles")
    @XmlElement(name = "detalle")
    private List<Detalle> detalles;
    
    @XmlElementWrapper(name = "infoAdicional")
    @XmlElement(name = "campoAdicional")
    private List<DetallesAdicionales> infoAdicional;

    public Comprobante getId() {
        return id;
    }

    public void setId(Comprobante id) {
        this.id = id;
    }
    
    

   

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public InfoTributaria getInfoTributaria() {
        return infoTributaria;
    }

    public void setInfoTributaria(InfoTributaria infoTributaria) {
        this.infoTributaria = infoTributaria;
    }

    public InfoFactura getInfoFactura() {
        return infoFactura;
    }

    public void setInfoFactura(InfoFactura infoFactura) {
        this.infoFactura = infoFactura;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public List<DetallesAdicionales> getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(List<DetallesAdicionales> infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
    
    

}
