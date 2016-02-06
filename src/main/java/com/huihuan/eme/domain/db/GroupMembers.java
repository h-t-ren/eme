package com.huihuan.eme.domain.db;
// Generated 2016-2-6 13:14:08 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GroupMembers generated by hbm2java
 */
@Entity
@Table(name="group_members"
    ,catalog="eme"
)
public class GroupMembers  implements java.io.Serializable {


     private Long id;
     private Users users;
     private Groups groups;

    public GroupMembers() {
    }

    public GroupMembers(Users users, Groups groups) {
       this.users = users;
       this.groups = groups;
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
    @JoinColumn(name="username", nullable=false)
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="group_id", nullable=false)
    public Groups getGroups() {
        return this.groups;
    }
    
    public void setGroups(Groups groups) {
        this.groups = groups;
    }




}


