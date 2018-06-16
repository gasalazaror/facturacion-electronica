/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.Comprobante;
import ec.facturacion.catalogos.Version;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ComprobanteRetencion {
    
    @XmlElement
    private Comprobante id;
    
    @XmlElement
    private Version version;
    
    @XmlElement
    private InfoTributaria infoTributaria;
    
    @XmlElement
    private InfoCompRetencion infoCompRetencion;
    
    @XmlElementWrapper(name = "impuestos")
    @XmlElement(name = "impuesto")
    private List<ImpuestoRetencion> impuestos;
    
    @XmlElementWrapper(name = "infoAdicional")
    @XmlElement(name = "campoAdicional")
    private List<DetallesAdicionales> infoAdicional;

    public Comprobante getId() {
        return id;
    }

    public void setId(Comprobante id) {
        this.id = id;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public InfoTributaria getInfoTributaria() {
        return infoTributaria;
    }

    public void setInfoTributaria(InfoTributaria infoTributaria) {
        this.infoTributaria = infoTributaria;
    }

    public InfoCompRetencion getInfoCompRetencion() {
        return infoCompRetencion;
    }

    public void setInfoCompRetencion(InfoCompRetencion infoCompRetencion) {
        this.infoCompRetencion = infoCompRetencion;
    }

    public List<ImpuestoRetencion> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(List<ImpuestoRetencion> impuestos) {
        this.impuestos = impuestos;
    }

    public List<DetallesAdicionales> getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(List<DetallesAdicionales> infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
    
    
    
}
