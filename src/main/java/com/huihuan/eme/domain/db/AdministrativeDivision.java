package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AdministrativeDivision generated by hbm2java
 */
@Entity
@Table(name="administrative_division"
    ,catalog="eme"
)
public class AdministrativeDivision  implements java.io.Serializable {


     private Long id;
     private String division;
     private Set<Epb> epbs = new HashSet<Epb>(0);
     private Set<Company> companies = new HashSet<Company>(0);
     private Set<DetectStation> detectStations = new HashSet<DetectStation>(0);

    public AdministrativeDivision() {
    }

	
    public AdministrativeDivision(String division) {
        this.division = division;
    }
    public AdministrativeDivision(String division, Set<Epb> epbs, Set<Company> companies, Set<DetectStation> detectStations) {
       this.division = division;
       this.epbs = epbs;
       this.companies = companies;
       this.detectStations = detectStations;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="division", nullable=false, length=64)
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="administrativeDivision")
    public Set<Epb> getEpbs() {
        return this.epbs;
    }
    
    public void setEpbs(Set<Epb> epbs) {
        this.epbs = epbs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="administrativeDivision")
    public Set<Company> getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="administrativeDivision")
    public Set<DetectStation> getDetectStations() {
        return this.detectStations;
    }
    
    public void setDetectStations(Set<DetectStation> detectStations) {
        this.detectStations = detectStations;
    }




}

