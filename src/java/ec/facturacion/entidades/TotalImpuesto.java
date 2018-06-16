/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.CodigoImpuesto;
import ec.facturacion.catalogos.CodigoPorsentaje;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TotalImpuesto implements Serializable {

    @XmlElement
    private CodigoImpuesto codigo;
    
    @XmlElement
    private CodigoPorsentaje codigoPorsentaje;
    
    @XmlElement
    private CodigoPorsentaje codigoRetencion;
    
    @XmlElement
    private Double baseImponible;
    
    @XmlElement
    private Double valor;
    
    @XmlElement
    private Double descuentoAdicional;
    
    @XmlElement
    private Double tarifa;

    public CodigoImpuesto getCodigo() {
        return codigo;
    }

    public void setCodigo(CodigoImpuesto codigo) {
        this.codigo = codigo;
    }

    public CodigoPorsentaje getCodigoPorsentaje() {
        return codigoPorsentaje;
    }

    public void setCodigoPorsentaje(CodigoPorsentaje codigoPorsentaje) {
        this.codigoPorsentaje = codigoPorsentaje;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDescuentoAdicional() {
        return descuentoAdicional;
    }

    public void setDescuentoAdicional(Double descuentoAdicional) {
        this.descuentoAdicional = descuentoAdicional;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
    
    
    
    

}
