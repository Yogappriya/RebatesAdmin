package com.rebatesadmin.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbladmin")
public class User {

    @Column(name = "admin_name")
    private String userName;

    @Column(name = "admin_pwd")
    private String password;

    @Column(name = "activeflag")
    private Boolean active;

    @Id
    @GeneratedValue
    @Column(name = "admin_guid")
    private String admin_guid;

    @Column(name = "createddatetime")
    private String createddatetime;

    @Column(name = "createddatetimeutc")
    private String createddatetimeutc;

    @Column(name = "updateddatetime")
    private String updateddatetime;

    @Column(name = "updateddatetimeutc")
    private String updateddatetimeutc;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getActive() {
        return active;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
