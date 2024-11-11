package gr.codehub.sb.service;

import gr.codehub.sb.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(long id);
    List<Customer> findAllCustomers();
    List<Customer> findCustomerRange(Long from, Long to);
}
