package com.midsangam.utx.services;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.model.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {

    public boolean createCustomer(CustomerDto customerDto);
    public Customer readCustomerById(int customerId);

    boolean deleteCustomerById(int customerId);

    Customer updateCustomer(CustomerDto customerDto);

    Customer login(CustomerDto customerDto);
}
