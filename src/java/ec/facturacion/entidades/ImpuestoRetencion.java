/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.Codigo;
import ec.facturacion.catalogos.CodigoImpuesto;
import ec.facturacion.catalogos.CodigoPorsentaje;
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
public class ImpuestoRetencion {
    
    @XmlElement
    private Codigo codigo;
    
    @XmlElement
    private ImpuestoRetencion codigoRetencion;
    
    @XmlElement
    private Double baseImponible;
    
    @XmlElement
    private Double porcentajeRetener;
    
    @XmlElement
    private Double valorRetenido;
    
    @XmlElement
    private int codDocSustento;
    
    @XmlElement
    private int numDocSustento;

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public ImpuestoRetencion getCodigoRetencion() {
        return codigoRetencion;
    }

    public void setCodigoRetencion(ImpuestoRetencion codigoRetencion) {
        this.codigoRetencion = codigoRetencion;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getPorcentajeRetener() {
        return porcentajeRetener;
    }

    public void setPorcentajeRetener(Double porcentajeRetener) {
        this.porcentajeRetener = porcentajeRetener;
    }

    public Double getValorRetenido() {
        return valorRetenido;
    }

    public void setValorRetenido(Double valorRetenido) {
        this.valorRetenido = valorRetenido;
    }

    public int getCodDocSustento() {
        return codDocSustento;
    }

    public void setCodDocSustento(int codDocSustento) {
        this.codDocSustento = codDocSustento;
    }

    public int getNumDocSustento() {
        return numDocSustento;
    }

    public void setNumDocSustento(int numDocSustento) {
        this.numDocSustento = numDocSustento;
    }
    
    
    
    
    
}
