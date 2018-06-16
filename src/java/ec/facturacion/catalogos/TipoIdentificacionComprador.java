/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.catalogos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 *
 * @author Gabriel
 */
@XmlEnum
public enum TipoIdentificacionComprador {
    
    @XmlEnumValue("04")
    RUC, 
    
    @XmlEnumValue("05")
    CEDULA, 
    
    @XmlEnumValue("06")
    PASAPORTE,
    
    @XmlEnumValue("07")
    VENTA_A_CONSUMIDOR_FINAL, 
    
    @XmlEnumValue("08")
    IDENTIFICACION_DEL_EXTERIOR, 
    
    @XmlEnumValue("09")
    PLACA
    
    
    
 

    
}
