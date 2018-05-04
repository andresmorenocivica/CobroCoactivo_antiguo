package persistencias;
// Generated 4/05/2018 09:28:55 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CivEstadomovimiento generated by hbm2java
 */
public class CivEstadomovimiento  implements java.io.Serializable {


     private BigDecimal estmoviId;
     private String estmoviDescripcion;
     private Date column1;
     private Date estmoviFechafinal;
     private CivMovimientos civMovimientos;

    public CivEstadomovimiento() {
    }

	
    public CivEstadomovimiento(BigDecimal estmoviId) {
        this.estmoviId = estmoviId;
    }
    public CivEstadomovimiento(BigDecimal estmoviId, String estmoviDescripcion, Date column1, Date estmoviFechafinal, CivMovimientos civMovimientos) {
       this.estmoviId = estmoviId;
       this.estmoviDescripcion = estmoviDescripcion;
       this.column1 = column1;
       this.estmoviFechafinal = estmoviFechafinal;
       this.civMovimientos = civMovimientos;
    }
   
    public BigDecimal getEstmoviId() {
        return this.estmoviId;
    }
    
    public void setEstmoviId(BigDecimal estmoviId) {
        this.estmoviId = estmoviId;
    }
    public String getEstmoviDescripcion() {
        return this.estmoviDescripcion;
    }
    
    public void setEstmoviDescripcion(String estmoviDescripcion) {
        this.estmoviDescripcion = estmoviDescripcion;
    }
    public Date getColumn1() {
        return this.column1;
    }
    
    public void setColumn1(Date column1) {
        this.column1 = column1;
    }
    public Date getEstmoviFechafinal() {
        return this.estmoviFechafinal;
    }
    
    public void setEstmoviFechafinal(Date estmoviFechafinal) {
        this.estmoviFechafinal = estmoviFechafinal;
    }
    public CivMovimientos getCivMovimientos() {
        return this.civMovimientos;
    }
    
    public void setCivMovimientos(CivMovimientos civMovimientos) {
        this.civMovimientos = civMovimientos;
    }




}

