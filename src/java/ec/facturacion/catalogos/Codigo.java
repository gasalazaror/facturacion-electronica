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
public enum Codigo {

    @XmlEnumValue("9")
    RETENCION_10,
    
    @XmlEnumValue("10")
    RETENCION_20,
    
    @XmlEnumValue("1")
    RETENCION_30,
    
    @XmlEnumValue("11")
    RETENCION_50,
    
    @XmlEnumValue("2")
    RETENCION_70,
    
    @XmlEnumValue("3")
    RETENCION_100

}
