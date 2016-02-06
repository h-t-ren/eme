package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,catalog="eme"
)
public class Users  implements java.io.Serializable {


     private String username;
     private Epb epb;
     private String password;
     private String mobile;
     private String realName;
     private Long userType;
     private String token;
     private Boolean enabled;
     private Set<Company> companiesForCreator = new HashSet<Company>(0);
     private Set<Epb> epbs = new HashSet<Epb>(0);
     private Set<PersistentLogins> persistentLoginses = new HashSet<PersistentLogins>(0);
     private Set<Company> companiesForAuditor = new HashSet<Company>(0);
     private Set<EmergencyMaterial> emergencyMaterialsForAuditor = new HashSet<EmergencyMaterial>(0);
     private Set<GroupMembers> groupMemberses = new HashSet<GroupMembers>(0);
     private Set<EmergencyMaterial> emergencyMaterialsForCreator = new HashSet<EmergencyMaterial>(0);

    public Users() {
    }

	
    public Users(String username, Long userType) {
        this.username = username;
        this.userType = userType;
    }
    public Users(String username, Epb epb, String password, String mobile, String realName, Long userType, String token, Boolean enabled, Set<Company> companiesForCreator, Set<Epb> epbs, Set<PersistentLogins> persistentLoginses, Set<Company> companiesForAuditor, Set<EmergencyMaterial> emergencyMaterialsForAuditor, Set<GroupMembers> groupMemberses, Set<EmergencyMaterial> emergencyMaterialsForCreator) {
       this.username = username;
       this.epb = epb;
       this.password = password;
       this.mobile = mobile;
       this.realName = realName;
       this.userType = userType;
       this.token = token;
       this.enabled = enabled;
       this.companiesForCreator = companiesForCreator;
       this.epbs = epbs;
       this.persistentLoginses = persistentLoginses;
       this.companiesForAuditor = companiesForAuditor;
       this.emergencyMaterialsForAuditor = emergencyMaterialsForAuditor;
       this.groupMemberses = groupMemberses;
       this.emergencyMaterialsForCreator = emergencyMaterialsForCreator;
    }
   
     @Id 
    
    @Column(name="username", unique=true, nullable=false, length=64)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_epb")
    public Epb getEpb() {
        return this.epb;
    }
    
    public void setEpb(Epb epb) {
        this.epb = epb;
    }
    
    @Column(name="password", length=128)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="mobile", length=64)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Column(name="real_name", length=20)
    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    @Column(name="user_type", nullable=false)
    public Long getUserType() {
        return this.userType;
    }
    
    public void setUserType(Long userType) {
        this.userType = userType;
    }
    
    @Column(name="token", length=128)
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    @Column(name="enabled")
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usersByCreator")
    public Set<Company> getCompaniesForCreator() {
        return this.companiesForCreator;
    }
    
    public void setCompaniesForCreator(Set<Company> companiesForCreator) {
        this.companiesForCreator = companiesForCreator;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="users")
    public Set<Epb> getEpbs() {
        return this.epbs;
    }
    
    public void setEpbs(Set<Epb> epbs) {
        this.epbs = epbs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="users")
    public Set<PersistentLogins> getPersistentLoginses() {
        return this.persistentLoginses;
    }
    
    public void setPersistentLoginses(Set<PersistentLogins> persistentLoginses) {
        this.persistentLoginses = persistentLoginses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usersByAuditor")
    public Set<Company> getCompaniesForAuditor() {
        return this.companiesForAuditor;
    }
    
    public void setCompaniesForAuditor(Set<Company> companiesForAuditor) {
        this.companiesForAuditor = companiesForAuditor;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usersByAuditor")
    public Set<EmergencyMaterial> getEmergencyMaterialsForAuditor() {
        return this.emergencyMaterialsForAuditor;
    }
    
    public void setEmergencyMaterialsForAuditor(Set<EmergencyMaterial> emergencyMaterialsForAuditor) {
        this.emergencyMaterialsForAuditor = emergencyMaterialsForAuditor;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="users")
    public Set<GroupMembers> getGroupMemberses() {
        return this.groupMemberses;
    }
    
    public void setGroupMemberses(Set<GroupMembers> groupMemberses) {
        this.groupMemberses = groupMemberses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usersByCreator")
    public Set<EmergencyMaterial> getEmergencyMaterialsForCreator() {
        return this.emergencyMaterialsForCreator;
    }
    
    public void setEmergencyMaterialsForCreator(Set<EmergencyMaterial> emergencyMaterialsForCreator) {
        this.emergencyMaterialsForCreator = emergencyMaterialsForCreator;
    }




}


