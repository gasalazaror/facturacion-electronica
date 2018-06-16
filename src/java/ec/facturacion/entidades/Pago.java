/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.FormaPago;
import ec.facturacion.catalogos.UnidadTiempo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pago {
    
    @XmlElement
    private FormaPago formaPago;
    
    @XmlElement
    private Double total;
    
    @XmlElement
    private int plazo;
    
    @XmlElement
    private UnidadTiempo unidadTiempo;

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public UnidadTiempo getUnidadTiempo() {
        return unidadTiempo;
    }

    public void setUnidadTiempo(UnidadTiempo unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
    }
    
    
    
    
}
