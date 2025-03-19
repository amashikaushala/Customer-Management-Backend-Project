package edu.icet.controller;


import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {


    private final CustomerService service;

    @GetMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer){
  service.addCustomer(customer);
    }
}
