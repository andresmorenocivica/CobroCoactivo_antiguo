package persistencias;
// Generated 10/04/2018 09:29:28 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CivPlantillas generated by hbm2java
 */
public class CivPlantillas  implements java.io.Serializable {


     private BigDecimal planId;
     private String planUri;
     private Date planFecha;
     private BigDecimal planTipo;

    public CivPlantillas() {
    }

	
    public CivPlantillas(BigDecimal planId) {
        this.planId = planId;
    }
    public CivPlantillas(BigDecimal planId, String planUri, Date planFecha, BigDecimal planTipo) {
       this.planId = planId;
       this.planUri = planUri;
       this.planFecha = planFecha;
       this.planTipo = planTipo;
    }
   
    public BigDecimal getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(BigDecimal planId) {
        this.planId = planId;
    }
    public String getPlanUri() {
        return this.planUri;
    }
    
    public void setPlanUri(String planUri) {
        this.planUri = planUri;
    }
    public Date getPlanFecha() {
        return this.planFecha;
    }
    
    public void setPlanFecha(Date planFecha) {
        this.planFecha = planFecha;
    }
    public BigDecimal getPlanTipo() {
        return this.planTipo;
    }
    
    public void setPlanTipo(BigDecimal planTipo) {
        this.planTipo = planTipo;
    }




}


