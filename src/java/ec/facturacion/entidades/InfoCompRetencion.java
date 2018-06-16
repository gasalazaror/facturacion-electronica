/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.ObligadoContabilidad;
import ec.facturacion.catalogos.TipoIdentificacionComprador;
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
public class InfoCompRetencion {
    
    @XmlElement
    private String fechaEmision;
    
    @XmlElement
    private String dirEstablecimiento;
    
    @XmlElement
    private String contribuyenteEspecial;
    
    @XmlElement
    private ObligadoContabilidad obligadoContabilidad;
    
    @XmlElement
    private TipoIdentificacionComprador TipoIdentificacionSujetoRetenido;
    
    @XmlElement
    private String razonSocialSujetoRetenido;
    
    @XmlElement
    private String identificacionSujetoRetenido;
    
    @XmlElement
    private String periodoFiscal;

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDirEstablecimiento() {
        return dirEstablecimiento;
    }

    public void setDirEstablecimiento(String dirEstablecimiento) {
        this.dirEstablecimiento = dirEstablecimiento;
    }

    public String getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(String contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public ObligadoContabilidad getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(ObligadoContabilidad obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public TipoIdentificacionComprador getTipoIdentificacionSujetoRetenido() {
        return TipoIdentificacionSujetoRetenido;
    }

    public void setTipoIdentificacionSujetoRetenido(TipoIdentificacionComprador TipoIdentificacionSujetoRetenido) {
        this.TipoIdentificacionSujetoRetenido = TipoIdentificacionSujetoRetenido;
    }

    public String getRazonSocialSujetoRetenido() {
        return razonSocialSujetoRetenido;
    }

    public void setRazonSocialSujetoRetenido(String razonSocialSujetoRetenido) {
        this.razonSocialSujetoRetenido = razonSocialSujetoRetenido;
    }

    public String getIdentificacionSujetoRetenido() {
        return identificacionSujetoRetenido;
    }

    public void setIdentificacionSujetoRetenido(String identificacionSujetoRetenido) {
        this.identificacionSujetoRetenido = identificacionSujetoRetenido;
    }

    public String getPeriodoFiscal() {
        return periodoFiscal;
    }

    public void setPeriodoFiscal(String periodoFiscal) {
        this.periodoFiscal = periodoFiscal;
    }
    
    
    
    
    
}
