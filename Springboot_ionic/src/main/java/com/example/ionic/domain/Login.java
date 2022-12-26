package com.example.ionic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
    @Id
    // 主鍵由數據庫自動維護(AUTO_INCREMENT)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "user")
    private String user;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    @Column(name = "password")
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassWord(String password) {
        this.password = password;
    }

    public Login() {}
    
    public Login(String user, String password){
        this.user = user;
        this.password = password;
        
    }
    

}
