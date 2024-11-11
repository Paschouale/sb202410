package gr.codehub.sb.repository;

import gr.codehub.sb.domain.Customer;

public interface CustomerRepository {

    Customer findCustomerById(long id);
}
