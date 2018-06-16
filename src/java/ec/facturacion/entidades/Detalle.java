/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.facturacion.entidades;

import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
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
public class Detalle {
    
    @XmlElement
    private String codigoPrincipal;
    
    @XmlElement
    private String codigoAuxiliar;
    
    @XmlElement
    private String descripcion;
    
    @XmlElement
    private Double cantidad;
   
    @XmlElement
    private Double precioUnitario;
    
    @XmlElement
    private Double descuento;
    
    @NotNull(message="Precio total sin impuestos no puede ser nulo")
    @XmlElement
    private Double precioTotalSinImpuesto;
    
    @XmlElementWrapper(name = "detallesAdicionales")
    @XmlElement(name = "detAdicional")
    private List<DetallesAdicionales> detallesAdicionales;
    
    @XmlElementWrapper(name = "impuestos")
    @XmlElement(name = "impuesto")
    private List<TotalImpuesto> impuestos;

    public String getCodigoPrincipal() {
        return codigoPrincipal;
    }
    
    public static void main(String[] args) {
        Detalle detalle = new Detalle();
        detalle.setCantidad(123.98);
        
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validador = factory.getValidator();
        Set<ConstraintViolation<Detalle>> violations =validador.validate(detalle);
        
        violations.forEach((violation) -> {
            System.out.println(violation.getMessage());
        });
        
    }

 public void setCodigoPrincipal(String codigoPrincipal) {
           this.codigoPrincipal = codigoPrincipal;
    }

    public String getCodigoAuxiliar() {
        return codigoAuxiliar;
    }

    public void setCodigoAuxiliar(String codigoAuxiliar) {
        this.codigoAuxiliar = codigoAuxiliar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPrecioTotalSinImpuesto() {
        return precioTotalSinImpuesto;
    }

    public void setPrecioTotalSinImpuesto(Double precioTotalSinImpuesto) {
        this.precioTotalSinImpuesto = precioTotalSinImpuesto;
    }

    public List<DetallesAdicionales> getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public void setDetallesAdicionales(List<DetallesAdicionales> detallesAdicionales) {
        this.detallesAdicionales = detallesAdicionales;
    }

    public List<TotalImpuesto> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(List<TotalImpuesto> impuestos) {
        this.impuestos = impuestos;
        
        
    }
    
    
    
    
}
