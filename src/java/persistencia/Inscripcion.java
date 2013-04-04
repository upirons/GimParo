/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author casa
 */
@Entity
@Table(name = "INSCRIPCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i"),
    @NamedQuery(name = "Inscripcion.findByCodigo", query = "SELECT i FROM Inscripcion i WHERE i.codigo = :codigo"),
    @NamedQuery(name = "Inscripcion.findByPrecio", query = "SELECT i FROM Inscripcion i WHERE i.precio = :precio"),
    @NamedQuery(name = "Inscripcion.findByFechacompra", query = "SELECT i FROM Inscripcion i WHERE i.fechacompra = :fechacompra"),
    @NamedQuery(name = "Inscripcion.findByFormapago", query = "SELECT i FROM Inscripcion i WHERE i.formapago = :formapago")})
public class Inscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHACOMPRA")
    @Temporal(TemporalType.DATE)
    private Date fechacompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FORMAPAGO")
    private String formapago;

    public Inscripcion() {
    }

    public Inscripcion(Integer codigo) {
        this.codigo = codigo;
    }

    public Inscripcion(Integer codigo, double precio, Date fechacompra, String formapago) {
        this.codigo = codigo;
        this.precio = precio;
        this.fechacompra = fechacompra;
        this.formapago = formapago;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Inscripcion[ codigo=" + codigo + " ]";
    }
    
}
