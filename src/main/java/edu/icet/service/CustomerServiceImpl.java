package edu.icet.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;
    private final ObjectMapper mapper;

    @Override
    public Customer addCustomer(Customer customer) {
//        new ObjectMapper().convertValue(customer,Customer.class);

        return mapper.convertValue(
                repository.save(mapper.convertValue(customer, CustomerEntity.class)),Customer.class
        );

    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return mapper.convertValue(
                repository.save(mapper.convertValue(customer, CustomerEntity.class)),Customer.class
        );
    }

    @Override
    public Boolean deleteCustomer(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Customer searchCustomerById(Integer id) {
      return mapper.convertValue(repository.findById(id),Customer.class);
    }

    @Override
    public List<Customer> getAll() {
      List<CustomerEntity> entities=repository.findAll();
      List<Customer> customerList=new ArrayList<>();

      entities.forEach(customerEntity -> customerList.add(
              mapper.convertValue(customerEntity, Customer.class
              )
      ));
      return customerList;
    }
}
