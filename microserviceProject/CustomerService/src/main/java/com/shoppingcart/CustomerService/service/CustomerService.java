package com.shoppingcart.CustomerService.service;

import com.shoppingcart.CustomerService.entity.Customer;
import com.shoppingcart.CustomerService.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public Customer registerCustomer(Customer customer) {
        customer.setCustomerName(customer.getCustomerName());
        customer.setEmail(customer.getEmail());
        customer.setAddress(customer.getAddress());
        return customerRepo.save(customer);
    }


    public Customer getCustomerById(Integer id) {
        Optional<Customer> customer = customerRepo.findById(id);
        return customer.orElse(null);

    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Optional<Customer> existingCustomerOptional = customerRepo.findById(Math.toIntExact(id));
        if (existingCustomerOptional.isPresent()) {
            Customer existingCustomer = existingCustomerOptional.get();
            existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            existingCustomer.setAddress(updatedCustomer.getAddress());
            return customerRepo.save(existingCustomer);

    }

        return updatedCustomer;
    }
    public boolean deleteCustomer(int id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            customerRepo.deleteById(id);
            return true; // Return true if deletion was successful
        }
        return false;

    }
    }

