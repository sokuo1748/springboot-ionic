package com.example.ionic.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    @Column(name = "name")
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Column(name = "phone")
    private String phone;
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public Customer(){};
    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

}
