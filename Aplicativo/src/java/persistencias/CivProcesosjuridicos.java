package persistencias;
// Generated 10/04/2018 09:29:28 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CivProcesosjuridicos generated by hbm2java
 */
public class CivProcesosjuridicos  implements java.io.Serializable {


     private BigDecimal projuId;
     private CivUsuarios civUsuarios;
     private String projuNombre;
     private BigDecimal projuEstado;
     private Date projuFechainicial;
     private Date projuFechafinal;
     private BigDecimal divId;
     private Set civDeudases = new HashSet(0);
     private Set civDetalleProcesojuridicos = new HashSet(0);

    public CivProcesosjuridicos() {
    }

	
    public CivProcesosjuridicos(BigDecimal projuId, String projuNombre) {
        this.projuId = projuId;
        this.projuNombre = projuNombre;
    }
    public CivProcesosjuridicos(BigDecimal projuId, CivUsuarios civUsuarios, String projuNombre, BigDecimal projuEstado, Date projuFechainicial, Date projuFechafinal, BigDecimal divId, Set civDeudases, Set civDetalleProcesojuridicos) {
       this.projuId = projuId;
       this.civUsuarios = civUsuarios;
       this.projuNombre = projuNombre;
       this.projuEstado = projuEstado;
       this.projuFechainicial = projuFechainicial;
       this.projuFechafinal = projuFechafinal;
       this.divId = divId;
       this.civDeudases = civDeudases;
       this.civDetalleProcesojuridicos = civDetalleProcesojuridicos;
    }
   
    public BigDecimal getProjuId() {
        return this.projuId;
    }
    
    public void setProjuId(BigDecimal projuId) {
        this.projuId = projuId;
    }
    public CivUsuarios getCivUsuarios() {
        return this.civUsuarios;
    }
    
    public void setCivUsuarios(CivUsuarios civUsuarios) {
        this.civUsuarios = civUsuarios;
    }
    public String getProjuNombre() {
        return this.projuNombre;
    }
    
    public void setProjuNombre(String projuNombre) {
        this.projuNombre = projuNombre;
    }
    public BigDecimal getProjuEstado() {
        return this.projuEstado;
    }
    
    public void setProjuEstado(BigDecimal projuEstado) {
        this.projuEstado = projuEstado;
    }
    public Date getProjuFechainicial() {
        return this.projuFechainicial;
    }
    
    public void setProjuFechainicial(Date projuFechainicial) {
        this.projuFechainicial = projuFechainicial;
    }
    public Date getProjuFechafinal() {
        return this.projuFechafinal;
    }
    
    public void setProjuFechafinal(Date projuFechafinal) {
        this.projuFechafinal = projuFechafinal;
    }
    public BigDecimal getDivId() {
        return this.divId;
    }
    
    public void setDivId(BigDecimal divId) {
        this.divId = divId;
    }
    public Set getCivDeudases() {
        return this.civDeudases;
    }
    
    public void setCivDeudases(Set civDeudases) {
        this.civDeudases = civDeudases;
    }
    public Set getCivDetalleProcesojuridicos() {
        return this.civDetalleProcesojuridicos;
    }
    
    public void setCivDetalleProcesojuridicos(Set civDetalleProcesojuridicos) {
        this.civDetalleProcesojuridicos = civDetalleProcesojuridicos;
    }




}


