/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.persistencia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.facturacion.catalogos.Ambiente;
import ec.facturacion.entidades.Detalle;
import ec.facturacion.entidades.Factura;

/**
 *
 * @author Gabriel
 */
public class AmbienteDao {

    public static Ambiente[] obtenerTipoAmbiente() {
        return Ambiente.values();
    }

    public static void main(String[] args) {

        final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        final String representacionBonita = prettyGson.toJson(AmbienteDao.obtenerTipoAmbiente());

        final String json = "{\n"
                + "  \"id\": \"comprobante\",\n"
                + "  \"version\": \"VERSION_1_0_0\",\n"
                + "  \"infoTributaria\": {\n"
                + "    \"ambiente\": \"PRUEBAS\",\n"
                + "    \"tipoEmision\": \"EMISION_NORMAL\",\n"
                + "    \"secuencial\": 0\n"
                + "  },\n"
                + "  \"infoFactura\": {\n"
                + "    \"fechaEmision\": \"12/45/78\",\n"
                + "    \"dirEstablecimiento\": \"Quito sur\",\n"
                + "    \"obligadoContabilidad\": \"SI\",\n"
                + "    \"tipoIdentificacionComprador\": \"CEDULA\",\n"
                + "    \"guiaRemision\": \"001-001-00000001\",\n"
                + "    \"razonSocialComprador\": \"Gabriel Salazar Ortiz\",\n"
                + "    \"identificacionComprador\": \"1723713556\",\n"
                + "    \"direccionComprador\": \"Quito Norte\",\n"
                + "    \"totalSinImpuestos\": 25.5,\n"
                + "    \"totalDescuento\": 0.0,\n"
                + "    \"totalConImpuestos\": [\n"
                + "      {\n"
                + "        \"codigo\": \"IVA\",\n"
                + "        \"codigoPorsentaje\": \"IVA_0\",\n"
                + "        \"baseImponible\": 25.5,\n"
                + "        \"valor\": 35.55\n"
                + "      }\n"
                + "    ],\n"
                + "    \"propina\": 0.25,\n"
                + "    \"importeTotal\": 100.0,\n"
                + "    \"moneda\": \"DOLAR\",\n"
                + "    \"pagos\": [\n"
                + "      {\n"
                + "        \"formaPago\": \"TARJETA_PREPAGO\",\n"
                + "        \"total\": 50.02,\n"
                + "        \"plazo\": 25,\n"
                + "        \"unidadTiempo\": \"DIAS\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"valorRetIva\": 15.54,\n"
                + "    \"valorRetRenta\": 15.46\n"
                + "  },\n"
                + "  \"detalles\": [\n"
                + "    {\n"
                + "      \"codigoPrincipal\": \"25\",\n"
                + "      \"codigoAuxiliar\": \"12\",\n"
                + "      \"descripcion\": \"Cosa bonita\",\n"
                + "      \"cantidad\": 25.5,\n"
                + "      \"precioUnitario\": 25.15,\n"
                + "      \"descuento\": 0.0,\n"
                + "      \"precioTotalSinImpuesto\": 50.65,\n"
                + "      \"detallesAdicionales\": [\n"
                + "        {\n"
                + "          \"nombre\": \"Direccion\",\n"
                + "          \"valor\": \"Maldito\"\n"
                + "        }\n"
                + "      ],\n"
                + "      \"impuestos\": [\n"
                + "        {\n"
                + "          \"codigo\": \"IVA\",\n"
                + "          \"codigoPorsentaje\": \"IVA_0\",\n"
                + "          \"baseImponible\": 25.5,\n"
                + "          \"valor\": 35.55\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  ],\n"
                + "  \"infoAdicional\": [\n"
                + "    {\n"
                + "      \"nombre\": \"Direccion\",\n"
                + "      \"valor\": \"Maldito\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        final Gson gson = new Gson();
        final Factura factura = gson.fromJson(json, Factura.class);

        System.out.println( factura.getInfoFactura().getObligadoContabilidad().toString());
    }
}
