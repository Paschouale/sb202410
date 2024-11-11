package gr.codehub.sb.service;

import gr.codehub.sb.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(long id);
    List<Customer> findAllCustomers();
    List<Customer> findCustomerRange(Long from, Long to);
    Customer saveCustomer(Customer customer);
    boolean deleteCustomerById(long id);
    boolean updateCustomerById(long id, Customer customer);
}
