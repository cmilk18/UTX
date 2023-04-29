package com.midsangam.utx.services.logic;

import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.Dto.CustomerLoginDto;
import com.midsangam.utx.model.Customer;
import com.midsangam.utx.repository.CustomerRepository;
import com.midsangam.utx.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean createCustomer(CustomerDto customerDto) {
        Optional<Customer> customerOptional = customerRepository.findByEmail(customerDto.getEmail());

        if(customerOptional.isPresent())
            return false;

        Customer customer = new Customer(customerDto);
        customerRepository.save(customer);
        return true;
    }

    @Override
    public Customer readCustomerById(int customerId) {
        Customer customer = customerRepository.findById(customerId).get();
        return customer;
    }

    @Override
    public boolean deleteCustomerById(int customerId) {
        customerRepository.deleteById(customerId);
        return true;
    }

    @Override
    public Customer updateCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto);
        Customer customer1 = customerRepository.save(customer);
        return customer1;
    }

    @Override
    public Customer login(CustomerLoginDto customerLoginDto) {
        Optional<Customer> customerOptional = customerRepository.findByEmail(customerLoginDto.getEmail());

        // Login 실패
        if(!customerOptional.isPresent())
            return null;

        Customer customer = customerOptional.get();
        if(customer.getPassword().equals(customerLoginDto.getPassword())){
            // 로그인 성공
            return customer;
        } else{
            // 로그인 실패
            return null;
        }


    }
}
