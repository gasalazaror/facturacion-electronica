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
public enum CodigoPorsentaje {

    @XmlEnumValue("0")
    IVA_0,
    @XmlEnumValue("2")
    IVA_12,
    @XmlEnumValue("3")
    IVA_14,
    @XmlEnumValue("6")
    NO_OBJETO_DE_IMPUESTO,
    @XmlEnumValue("7")
    EXENTO_DE_IVA
    
    
}
