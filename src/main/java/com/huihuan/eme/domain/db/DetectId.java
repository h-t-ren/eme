package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetectId generated by hbm2java
 */
@Embeddable
public class DetectId  implements java.io.Serializable {


     private Long idDetectStation;
     private Long idDetectFactor;

    public DetectId() {
    }

    public DetectId(Long idDetectStation, Long idDetectFactor) {
       this.idDetectStation = idDetectStation;
       this.idDetectFactor = idDetectFactor;
    }
   

    @Column(name="id_detect_station", nullable=false)
    public Long getIdDetectStation() {
        return this.idDetectStation;
    }
    
    public void setIdDetectStation(Long idDetectStation) {
        this.idDetectStation = idDetectStation;
    }

    @Column(name="id_detect_factor", nullable=false)
    public Long getIdDetectFactor() {
        return this.idDetectFactor;
    }
    
    public void setIdDetectFactor(Long idDetectFactor) {
        this.idDetectFactor = idDetectFactor;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetectId) ) return false;
		 DetectId castOther = ( DetectId ) other; 
         
		 return ( (this.getIdDetectStation()==castOther.getIdDetectStation()) || ( this.getIdDetectStation()!=null && castOther.getIdDetectStation()!=null && this.getIdDetectStation().equals(castOther.getIdDetectStation()) ) )
 && ( (this.getIdDetectFactor()==castOther.getIdDetectFactor()) || ( this.getIdDetectFactor()!=null && castOther.getIdDetectFactor()!=null && this.getIdDetectFactor().equals(castOther.getIdDetectFactor()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdDetectStation() == null ? 0 : this.getIdDetectStation().hashCode() );
         result = 37 * result + ( getIdDetectFactor() == null ? 0 : this.getIdDetectFactor().hashCode() );
         return result;
   }   


}


