package com.example.ionic.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ionic.domain.Login;
import com.example.ionic.domain.LoginRepository;
import com.example.ionic.service.LoginService;



@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;
    private LoginService loginService;

    @GetMapping(value = "/find")
    public List<Login> findlist(){
        
        return loginRepository.findAll();

    }
   
    @PostMapping(value = "/add")
    public Login save(@RequestBody Login login){
        Login add = loginRepository.save(login);
        return add;
    }
    
  
    
}