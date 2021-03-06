package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Epb generated by hbm2java
 */
@Entity
@Table(name="epb"
    ,catalog="eme"
)
public class Epb  implements java.io.Serializable {


     private Long id;
     private AdministrativeDivision administrativeDivision;
     private Users users;
     private Epb epb;
     private String epbName;
     private Date creationDate;
     private Float lat;
     private Float lng;
     private String address;
     private Set<DetectStation> detectStations = new HashSet<DetectStation>(0);
     private Set<Epb> epbs = new HashSet<Epb>(0);
     private Set<EmergencyResponsePlan> emergencyResponsePlans = new HashSet<EmergencyResponsePlan>(0);
     private Set<Users> userses = new HashSet<Users>(0);

    public Epb() {
    }

	
    public Epb(String epbName) {
        this.epbName = epbName;
    }
    public Epb(AdministrativeDivision administrativeDivision, Users users, Epb epb, String epbName, Date creationDate, Float lat, Float lng, String address, Set<DetectStation> detectStations, Set<Epb> epbs, Set<EmergencyResponsePlan> emergencyResponsePlans, Set<Users> userses) {
       this.administrativeDivision = administrativeDivision;
       this.users = users;
       this.epb = epb;
       this.epbName = epbName;
       this.creationDate = creationDate;
       this.lat = lat;
       this.lng = lng;
       this.address = address;
       this.detectStations = detectStations;
       this.epbs = epbs;
       this.emergencyResponsePlans = emergencyResponsePlans;
       this.userses = userses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_division")
    public AdministrativeDivision getAdministrativeDivision() {
        return this.administrativeDivision;
    }
    
    public void setAdministrativeDivision(AdministrativeDivision administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="creator")
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="superior")
    public Epb getEpb() {
        return this.epb;
    }
    
    public void setEpb(Epb epb) {
        this.epb = epb;
    }
    
    @Column(name="epb_name", nullable=false, length=64)
    public String getEpbName() {
        return this.epbName;
    }
    
    public void setEpbName(String epbName) {
        this.epbName = epbName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="creation_date", length=10)
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    @Column(name="lat", precision=12, scale=0)
    public Float getLat() {
        return this.lat;
    }
    
    public void setLat(Float lat) {
        this.lat = lat;
    }
    
    @Column(name="lng", precision=12, scale=0)
    public Float getLng() {
        return this.lng;
    }
    
    public void setLng(Float lng) {
        this.lng = lng;
    }
    
    @Column(name="address", length=128)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="epb")
    public Set<DetectStation> getDetectStations() {
        return this.detectStations;
    }
    
    public void setDetectStations(Set<DetectStation> detectStations) {
        this.detectStations = detectStations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="epb")
    public Set<Epb> getEpbs() {
        return this.epbs;
    }
    
    public void setEpbs(Set<Epb> epbs) {
        this.epbs = epbs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="epb")
    public Set<EmergencyResponsePlan> getEmergencyResponsePlans() {
        return this.emergencyResponsePlans;
    }
    
    public void setEmergencyResponsePlans(Set<EmergencyResponsePlan> emergencyResponsePlans) {
        this.emergencyResponsePlans = emergencyResponsePlans;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="epb")
    public Set<Users> getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set<Users> userses) {
        this.userses = userses;
    }




}


