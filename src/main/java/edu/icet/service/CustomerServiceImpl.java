package edu.icet.service;

import edu.icet.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Integer id) {
        return null;
    }

    @Override
    public Customer searchCustomerById(Integer integer) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }
}
