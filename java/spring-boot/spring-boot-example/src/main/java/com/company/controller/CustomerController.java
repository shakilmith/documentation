package com.company.controller;

import com.company.model.Customer;
import com.company.repository.CustomerRepository;
import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;


    //mapping for retrieving all customers
    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //mapping for retrieving each customer record by id
    @GetMapping("/api/customers/{id}")
    public Customer getCustomerById(@PathVariable("id") int id){
        return customerService.getCustomerById(id);
    }

    //mapping for saving new customer records
    @PostMapping("/api/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    //mapping for updating existing customer record
    @PutMapping("/api/customers/{id}")
    public Customer updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer){
        return customerService.updateCustomer(id, customer);
    }

    //method for deleting existing customer based on id
    @DeleteMapping("/api/customers/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.deleteCustomer(id);
    }
}
