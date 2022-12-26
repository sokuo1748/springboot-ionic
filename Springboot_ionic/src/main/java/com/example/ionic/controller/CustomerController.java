package com.example.ionic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ionic.domain.Customer;
import com.example.ionic.domain.CustomerRepository;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/findAll")
    public List<Customer> findAllList(){
        return customerRepository.findAll();
    }
    @PostMapping(value = "/add")
    public Customer save(@RequestBody Customer customer){
        Customer add = customerRepository.save(customer);
        return add;
    }
    @DeleteMapping(value = "/dele/{id}")
    public String dele(@PathVariable Long id){
       customerRepository.deleteById(id);
       return "dele id :" + id;
    }
}
