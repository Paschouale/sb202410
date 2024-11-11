package gr.codehub.sb.repository;

import gr.codehub.sb.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer findCustomerById(long id);
    List<Customer> findAllCustomer();
    Customer saveCustomer(Customer customer);
    boolean deleteCustomerById(long id);
    boolean updateCustomerById(long id, Customer customer);

    //CRUD
    //done -  get a customer
    //done -  get all customers
    //done -  update a customer
    //done -  delete a customer
    //done -  create a customer
}
