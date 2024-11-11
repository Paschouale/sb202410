package gr.codehub.sb.service;

import gr.codehub.sb.domain.Customer;

public interface CustomerService {

    Customer findCustomerById(long id);
}
