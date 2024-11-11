package gr.codehub.sb.repository;

import gr.codehub.sb.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer findCustomerById(long id);
    List<Customer> findAllCustomer();

    //CRUD
    //done -  get a customer
    //done -  get all customers
    //TODO update a customer
    //TODO delete a customer
    //TODO create a customer
}
