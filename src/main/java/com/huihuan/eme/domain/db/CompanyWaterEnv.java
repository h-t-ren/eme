package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CompanyWaterEnv generated by hbm2java
 */
@Entity
@Table(name="company_water_env"
    ,catalog="eme"
)
public class CompanyWaterEnv  implements java.io.Serializable {


     private Long idCompany;
     private Company company;
     private Long distance;
     private String location;

    public CompanyWaterEnv() {
    }

	
    public CompanyWaterEnv(Long idCompany, Company company, Long distance) {
        this.idCompany = idCompany;
        this.company = company;
        this.distance = distance;
    }
    public CompanyWaterEnv(Long idCompany, Company company, Long distance, String location) {
       this.idCompany = idCompany;
       this.company = company;
       this.distance = distance;
       this.location = location;
    }
   
     @Id 
    
    @Column(name="id_company", unique=true, nullable=false)
    public Long getIdCompany() {
        return this.idCompany;
    }
    
    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_company", unique=true, nullable=false, insertable=false, updatable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @Column(name="distance", nullable=false)
    public Long getDistance() {
        return this.distance;
    }
    
    public void setDistance(Long distance) {
        this.distance = distance;
    }
    
    @Column(name="location", length=20)
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }




}


