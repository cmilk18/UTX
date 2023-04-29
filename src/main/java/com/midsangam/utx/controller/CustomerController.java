package com.midsangam.utx.controller;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.model.Customer;
import com.midsangam.utx.services.CustomerService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String create(@RequestBody CustomerDto customerDto){
        customerService.createCustomer(customerDto);
        return "Customer Created!";
    }

    @GetMapping("{customerId}")
    public Customer read(@PathVariable String customerId){
        Customer customer = customerService.readCustomerById(customerId);
        return customer;
    }

    @PutMapping
    public Customer update(@RequestBody CustomerDto customerDto){
        Customer customer = customerService.updateCustomer(customerDto);
        return customer;
    }

    @DeleteMapping("{customerId}")
    public String delete(@PathVariable String customerId){
        customerService.deleteCustomerById(customerId);
        return "Deleted!";
    }
}
