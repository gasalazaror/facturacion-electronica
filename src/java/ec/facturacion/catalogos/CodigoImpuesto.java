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
public enum CodigoImpuesto {
  
    @XmlEnumValue("2")
    IVA,
    @XmlEnumValue("3")
    ICE,
    @XmlEnumValue("5")
    IRBPNR;
    
    
}
