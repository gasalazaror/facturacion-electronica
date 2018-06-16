/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.Ambiente;
import ec.facturacion.catalogos.TipoEmision;
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
public class InfoTributaria {
    
    @XmlElement
    private Ambiente ambiente;
    
    @XmlElement
    private TipoEmision tipoEmision;
    
    @XmlElement
    private String razonSocial;
    
    @XmlElement
    private String nombreComercial;
    
    @XmlElement
    private String ruc;
    
    @XmlElement
    private String claveAcceso;
    
    @XmlElement
    private String codDoc;
    
    @XmlElement
    private String estab;
    
    @XmlElement
    private String ptoEmi;
    
    @XmlElement
    private int secuencial;
    
    @XmlElement
    private String dirMatriz;

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public TipoEmision getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(TipoEmision tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getEstab() {
        return estab;
    }

    public void setEstab(String estab) {
        this.estab = estab;
    }

    public String getPtoEmi() {
        return ptoEmi;
    }

    public void setPtoEmi(String ptoEmi) {
        this.ptoEmi = ptoEmi;
    }

    public int getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(int secuencial) {
        this.secuencial = secuencial;
    }

    public String getDirMatriz() {
        return dirMatriz;
    }

    public void setDirMatriz(String dirMatriz) {
        this.dirMatriz = dirMatriz;
    }
    
    
    
}
