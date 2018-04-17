package persistencias;
// Generated 17/04/2018 10:23:00 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CivTipodatopersona generated by hbm2java
 */
public class CivTipodatopersona  implements java.io.Serializable {


     private BigDecimal tipdatperId;
     private String tipdatperDescripcion;
     private BigDecimal tipdatperEstado;
     private Date tipdatperFechainical;
     private Date tipdatperFechafinal;
     private Set civDatospersonas = new HashSet(0);

    public CivTipodatopersona() {
    }

	
    public CivTipodatopersona(BigDecimal tipdatperId) {
        this.tipdatperId = tipdatperId;
    }
    public CivTipodatopersona(BigDecimal tipdatperId, String tipdatperDescripcion, BigDecimal tipdatperEstado, Date tipdatperFechainical, Date tipdatperFechafinal, Set civDatospersonas) {
       this.tipdatperId = tipdatperId;
       this.tipdatperDescripcion = tipdatperDescripcion;
       this.tipdatperEstado = tipdatperEstado;
       this.tipdatperFechainical = tipdatperFechainical;
       this.tipdatperFechafinal = tipdatperFechafinal;
       this.civDatospersonas = civDatospersonas;
    }
   
    public BigDecimal getTipdatperId() {
        return this.tipdatperId;
    }
    
    public void setTipdatperId(BigDecimal tipdatperId) {
        this.tipdatperId = tipdatperId;
    }
    public String getTipdatperDescripcion() {
        return this.tipdatperDescripcion;
    }
    
    public void setTipdatperDescripcion(String tipdatperDescripcion) {
        this.tipdatperDescripcion = tipdatperDescripcion;
    }
    public BigDecimal getTipdatperEstado() {
        return this.tipdatperEstado;
    }
    
    public void setTipdatperEstado(BigDecimal tipdatperEstado) {
        this.tipdatperEstado = tipdatperEstado;
    }
    public Date getTipdatperFechainical() {
        return this.tipdatperFechainical;
    }
    
    public void setTipdatperFechainical(Date tipdatperFechainical) {
        this.tipdatperFechainical = tipdatperFechainical;
    }
    public Date getTipdatperFechafinal() {
        return this.tipdatperFechafinal;
    }
    
    public void setTipdatperFechafinal(Date tipdatperFechafinal) {
        this.tipdatperFechafinal = tipdatperFechafinal;
    }
    public Set getCivDatospersonas() {
        return this.civDatospersonas;
    }
    
    public void setCivDatospersonas(Set civDatospersonas) {
        this.civDatospersonas = civDatospersonas;
    }




}


