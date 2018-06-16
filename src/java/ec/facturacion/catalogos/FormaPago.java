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
public enum FormaPago {
    
    @XmlEnumValue("01")
    SIN_UTILIZACION_DEL_SISTEMA_FINANCIERO,
    
    @XmlEnumValue("15")
    COMPENSACIÓN_DE_DEUDAS,
    
    @XmlEnumValue("16")
    TARJETA_DE_DEBITO,
    
    @XmlEnumValue("17")
    DINERO_ELECTRONICO,
    
    @XmlEnumValue("18")
    TARJETA_PREPAGO,
    
    @XmlEnumValue("19")
    TARJETA_DE_CREDITO,
    
    @XmlEnumValue("20")
    OTROS_CON_UTILIZACION_DEL_SISTEMA_FINANCIERO,
    
    @XmlEnumValue("21")
    ENDOSO_DE_TÍTULOS ,
}
