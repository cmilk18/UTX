package com.midsangam.utx.controller;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.Dto.CustomerLoginDto;
import com.midsangam.utx.model.Customer;
import com.midsangam.utx.services.CustomerService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RequestMapping("customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String create(@RequestBody CustomerDto customerDto){
        if(!customerService.createCustomer(customerDto))
            return "Create Fail";
        return "Create Success";
    }

    @GetMapping("{customerId}")
    public Customer read(@PathVariable int customerId){
        Customer customer = customerService.readCustomerById(customerId);
        return customer;
    }

    @PutMapping
    public Customer update(@RequestBody CustomerDto customerDto){
        Customer customer = customerService.updateCustomer(customerDto);
        return customer;
    }

    @DeleteMapping("{customerId}")
    public String delete(@PathVariable int customerId){
        customerService.deleteCustomerById(customerId);
        return "Deleted!";
    }

    @PostMapping("/login")
    public String login(@RequestBody CustomerLoginDto customerLoginDto, HttpSession session){
        Customer customer = customerService.login(customerLoginDto);

        if(customer == null)
            return "로그인 실패";

        session.setAttribute("loginId", customer.getId());
        session.setAttribute("loginEmail", customer.getEmail());
        return "로그인 성공";
    }
}
