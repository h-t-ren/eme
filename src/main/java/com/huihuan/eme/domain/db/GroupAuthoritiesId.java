package com.huihuan.eme.domain.db;
// Generated 2016-1-5 22:02:43 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupAuthoritiesId generated by hbm2java
 */
@Embeddable
public class GroupAuthoritiesId  implements java.io.Serializable {


     private Long groupId;
     private String authority;

    public GroupAuthoritiesId() {
    }

    public GroupAuthoritiesId(Long groupId, String authority) {
       this.groupId = groupId;
       this.authority = authority;
    }
   

    @Column(name="group_id", nullable=false)
    public Long getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Column(name="authority", nullable=false, length=50)
    public String getAuthority() {
        return this.authority;
    }
    
    public void setAuthority(String authority) {
        this.authority = authority;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GroupAuthoritiesId) ) return false;
		 GroupAuthoritiesId castOther = ( GroupAuthoritiesId ) other; 
         
		 return ( (this.getGroupId()==castOther.getGroupId()) || ( this.getGroupId()!=null && castOther.getGroupId()!=null && this.getGroupId().equals(castOther.getGroupId()) ) )
 && ( (this.getAuthority()==castOther.getAuthority()) || ( this.getAuthority()!=null && castOther.getAuthority()!=null && this.getAuthority().equals(castOther.getAuthority()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getGroupId() == null ? 0 : this.getGroupId().hashCode() );
         result = 37 * result + ( getAuthority() == null ? 0 : this.getAuthority().hashCode() );
         return result;
   }   


}

