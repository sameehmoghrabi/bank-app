package dev.moghrabi.sameeh.bankapp.controller;

import dev.moghrabi.sameeh.bankapp.constant.CommonConst;
import dev.moghrabi.sameeh.bankapp.model.Customer;
import dev.moghrabi.sameeh.bankapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/v1/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public String newCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return CommonConst.Feedback.NEW_CUSTOMER_CREATED;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Customer one(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Customer> all() {
        return customerService.getAllCustomers();
    }
}
