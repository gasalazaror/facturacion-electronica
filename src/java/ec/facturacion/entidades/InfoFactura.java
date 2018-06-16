/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import ec.facturacion.catalogos.Moneda;
import ec.facturacion.catalogos.ObligadoContabilidad;
import ec.facturacion.catalogos.TipoIdentificacionComprador;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFactura {

    @XmlElement
    private String fechaEmision;

    @XmlElement
    private String dirEstablecimiento;

    @XmlElement
    private String contribuyenteEspecial;

    @XmlElement
    private ObligadoContabilidad obligadoContabilidad;

    @XmlElement
    private TipoIdentificacionComprador tipoIdentificacionComprador;

    @XmlElement
    private String guiaRemision;

    @XmlElement
    private String razonSocialComprador;

    @XmlElement
    private String identificacionComprador;

    @XmlElement
    private String direccionComprador;

    @XmlElement
    private Double totalSinImpuestos;

    @XmlElement
    private Double totalDescuento;

    @XmlElementWrapper(name = "totalConImpuestos")
    @XmlElement(name = "totalImpuesto")
    private List<TotalImpuesto> totalConImpuestos;
    
    @XmlElement
    private Double propina;
    
    @XmlElement
    private Double importeTotal;
    
    @XmlElement
    private Moneda moneda;
    
    @XmlElementWrapper(name = "pagos")
    @XmlElement(name = "pago")
    private List<Pago> pagos;
    
    @XmlElement
    private Double valorRetIva;
    
    @XmlElement
    private Double valorRetRenta;
    

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

    public TipoIdentificacionComprador getTipoIdentificacionComprador() {
        return tipoIdentificacionComprador;
    }

    public void setTipoIdentificacionComprador(TipoIdentificacionComprador tipoIdentificacionComprador) {
        this.tipoIdentificacionComprador = tipoIdentificacionComprador;
    }

    public String getGuiaRemision() {
        return guiaRemision;
    }

    public void setGuiaRemision(String guiaRemision) {
        this.guiaRemision = guiaRemision;
    }

    public String getRazonSocialComprador() {
        return razonSocialComprador;
    }

    public void setRazonSocialComprador(String razonSocialComprador) {
        this.razonSocialComprador = razonSocialComprador;
    }

    public String getIdentificacionComprador() {
        return identificacionComprador;
    }

    public void setIdentificacionComprador(String identificacionComprador) {
        this.identificacionComprador = identificacionComprador;
    }

    public String getDireccionComprador() {
        return direccionComprador;
    }

    public void setDireccionComprador(String direccionComprador) {
        this.direccionComprador = direccionComprador;
    }

    public Double getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    public void setTotalSinImpuestos(Double totalSinImpuestos) {
        this.totalSinImpuestos = totalSinImpuestos;
    }

    public Double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(Double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public List<TotalImpuesto> getTotalConImpuestos() {
        return totalConImpuestos;
    }

    public void setTotalConImpuestos(List<TotalImpuesto> totalConImpuestos) {
        this.totalConImpuestos = totalConImpuestos;
    }

    public Double getPropina() {
        return propina;
    }

    public void setPropina(Double propina) {
        this.propina = propina;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public Double getValorRetIva() {
        return valorRetIva;
    }

    public void setValorRetIva(Double valorRetIva) {
        this.valorRetIva = valorRetIva;
    }

    public Double getValorRetRenta() {
        return valorRetRenta;
    }

    public void setValorRetRenta(Double valorRetRenta) {
        this.valorRetRenta = valorRetRenta;
    }
    
    
    
    
    
    
    
    
    
    

}
