package com.company.service;

import com.company.exception.EntityNotFoundException;
import com.company.model.Customer;
import com.company.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    //method for getting all the customers
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    //method for getting customer by id
    public Customer getCustomerById(int id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found with id "+id));
    }

    //method for creating new customer records
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //method for updating customer (other approaches available too)
    public Customer updateCustomer(int id, Customer customer){

        Customer entity = customerRepository.findById(id)
                        .orElseThrow(()-> new RuntimeException("Entity not found with id "+id));

        entity.setFirstName(customer.getFirstName());
        entity.setLastName(customer.getLastName());
        entity.setEmail(customer.getEmail());
        entity.setPhone(customer.getPhone());
        entity.setAddress(customer.getAddress());

        return entity;
    }

    //method for deleting entity based on id
    public void deleteCustomer(int id){
         Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id "+id));

         //delete the customer if exists
         customerRepository.delete(customer);

        /*
         * Or write like this for simplicity: without using orElseThrow
         * customerRepository.deleteById(id);
         */
    }
}
