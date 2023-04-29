package com.midsangam.utx.services;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.model.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {

    public String createCustomer(CustomerDto customerDto);
    public Customer readCustomerById(String customerId);

    boolean deleteCustomerById(String customerId);

    Customer updateCustomer(CustomerDto customerDto);
}
