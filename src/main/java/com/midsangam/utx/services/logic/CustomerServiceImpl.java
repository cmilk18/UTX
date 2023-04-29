package com.midsangam.utx.services.logic;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.model.Customer;
import com.midsangam.utx.repository.CustomerRepository;
import com.midsangam.utx.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String createCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto);
        customerRepository.save(customer);
        return "DONE";
    }

    @Override
    public Customer readCustomerById(String customerId) {
        Customer customer = customerRepository.findById(customerId).get();
        return customer;
    }

    @Override
    public boolean deleteCustomerById(String customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }

    @Override
    public Customer updateCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto);
        Customer customer1 = customerRepository.save(customer);
        return customer1;
    }
}
