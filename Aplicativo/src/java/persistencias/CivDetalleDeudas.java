package persistencias;
// Generated 17/04/2018 10:23:00 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CivDetalleDeudas generated by hbm2java
 */
public class CivDetalleDeudas  implements java.io.Serializable {


     private BigDecimal detdeuId;
     private CivConceptos civConceptos;
     private CivDeudas civDeudas;
     private String detdeuReferencia;
     private Date detdeuFecha;
     private BigDecimal detdeuEstado;
     private BigDecimal detdeuValor;

    public CivDetalleDeudas() {
    }

	
    public CivDetalleDeudas(BigDecimal detdeuId, CivConceptos civConceptos, CivDeudas civDeudas, Date detdeuFecha, BigDecimal detdeuEstado, BigDecimal detdeuValor) {
        this.detdeuId = detdeuId;
        this.civConceptos = civConceptos;
        this.civDeudas = civDeudas;
        this.detdeuFecha = detdeuFecha;
        this.detdeuEstado = detdeuEstado;
        this.detdeuValor = detdeuValor;
    }
    public CivDetalleDeudas(BigDecimal detdeuId, CivConceptos civConceptos, CivDeudas civDeudas, String detdeuReferencia, Date detdeuFecha, BigDecimal detdeuEstado, BigDecimal detdeuValor) {
       this.detdeuId = detdeuId;
       this.civConceptos = civConceptos;
       this.civDeudas = civDeudas;
       this.detdeuReferencia = detdeuReferencia;
       this.detdeuFecha = detdeuFecha;
       this.detdeuEstado = detdeuEstado;
       this.detdeuValor = detdeuValor;
    }
   
    public BigDecimal getDetdeuId() {
        return this.detdeuId;
    }
    
    public void setDetdeuId(BigDecimal detdeuId) {
        this.detdeuId = detdeuId;
    }
    public CivConceptos getCivConceptos() {
        return this.civConceptos;
    }
    
    public void setCivConceptos(CivConceptos civConceptos) {
        this.civConceptos = civConceptos;
    }
    public CivDeudas getCivDeudas() {
        return this.civDeudas;
    }
    
    public void setCivDeudas(CivDeudas civDeudas) {
        this.civDeudas = civDeudas;
    }
    public String getDetdeuReferencia() {
        return this.detdeuReferencia;
    }
    
    public void setDetdeuReferencia(String detdeuReferencia) {
        this.detdeuReferencia = detdeuReferencia;
    }
    public Date getDetdeuFecha() {
        return this.detdeuFecha;
    }
    
    public void setDetdeuFecha(Date detdeuFecha) {
        this.detdeuFecha = detdeuFecha;
    }
    public BigDecimal getDetdeuEstado() {
        return this.detdeuEstado;
    }
    
    public void setDetdeuEstado(BigDecimal detdeuEstado) {
        this.detdeuEstado = detdeuEstado;
    }
    public BigDecimal getDetdeuValor() {
        return this.detdeuValor;
    }
    
    public void setDetdeuValor(BigDecimal detdeuValor) {
        this.detdeuValor = detdeuValor;
    }




}


