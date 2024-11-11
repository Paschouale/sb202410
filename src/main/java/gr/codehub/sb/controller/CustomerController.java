package gr.codehub.sb.controller;

import gr.codehub.sb.domain.Customer;
import gr.codehub.sb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("{customerId}")
    public Customer findCustomerById(@PathVariable long customerId){
        Customer response = customerService.findCustomerById(customerId);
        return response;
    }

    @GetMapping("/all")
    public List<Customer> findAllCustomers(){
        List<Customer> customers = customerService.findAllCustomers();
        return customers;
    }

    @GetMapping("/search")
    public List<Customer> findCustomerRange(@RequestParam Long from, @RequestParam(required = false) Long to){
        List<Customer> customers = customerService.findCustomerRange(from, to);
        return customers;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("{customerid}")
    public boolean deleteCustomer(@PathVariable long customerid){
        return customerService.deleteCustomerById(customerid);
    }

    @PutMapping("{customerid}")
    public boolean updateCustomer(@PathVariable long customerid, @RequestBody Customer customer){
        return customerService.updateCustomerById(customerid, customer);
    }
}
