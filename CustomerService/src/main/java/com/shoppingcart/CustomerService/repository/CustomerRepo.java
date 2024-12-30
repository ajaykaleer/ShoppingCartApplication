package com.shoppingcart.CustomerService.repository;

import com.shoppingcart.CustomerService.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {


}
