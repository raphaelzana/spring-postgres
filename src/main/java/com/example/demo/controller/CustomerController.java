package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers(){
        return repository.findAll();
    }

    @PostMapping("/customers")
    public Customer postCustomer(@RequestBody Customer customer){
        return repository.save(customer);
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PutMapping("/customers/{id}")
    public Customer putCustomer(@PathVariable String id, @RequestBody Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable("id") Long id){
        repository.deleteById(id);
        return "Deleted";
    }
    
}
