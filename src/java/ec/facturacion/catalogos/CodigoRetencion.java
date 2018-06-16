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
public enum CodigoRetencion {
    
    @XmlEnumValue("1")
    SUB_TOTAL_IVA,
    
    @XmlEnumValue("2")
    SUB_TOTAL_CERO,
    
    @XmlEnumValue("3")
    SUB_TOTAL_NO_OBJETO_IVA,
    
    @XmlEnumValue("4")
    SUB_TOTAL,
    
    @XmlEnumValue("5")
    TOTAL_DESCUENTO,
    
    @XmlEnumValue("6")
    VALOR_ICE,
    
    @XmlEnumValue("7")
    VALOR_IRBPNR,
    
    @XmlEnumValue("8")
    VALOR_IVA_PORCENTAJE,
    
    @XmlEnumValue("9")
    PROPINA,
    
    @XmlEnumValue("10")
    VALOR_TOTAL
    
}
