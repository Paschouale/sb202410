package gr.codehub.sb.service;

import gr.codehub.sb.domain.Customer;
import gr.codehub.sb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    public Customer findCustomerById(long id){
        Customer customer = customerRepository.findCustomerById(id);
        if (customer == null) return null;
        if (customer.isHidden()){
            return null;
        }
        return customer;
    }

    public List<Customer> findAllCustomers(){
        List<Customer> customersFromDatabase = customerRepository.findAllCustomer();
        List<Customer> customersToShow = new ArrayList<>();
        for (Customer c : customersFromDatabase){
            if (!c.isHidden()){
                customersToShow.add(c);
            }
        }
        return customersToShow;
    }

    @Override
    public List<Customer> findCustomerRange(Long from, Long to) {
        List<Customer> allCustomers = findAllCustomers();
        List<Customer> customersToShow = new ArrayList<>();
        if (from == null){
            from = 0L;
        }
        if (to == null) to = Long.MAX_VALUE;
        for (Customer c : allCustomers){
            if (c.getId() >= from && c.getId() <= to){
                customersToShow.add(c);
            }
        }
        return customersToShow;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.saveCustomer(customer);
    }

    @Override
    public boolean deleteCustomerById(long id) {
        return customerRepository.deleteCustomerById(id);
    }

    @Override
    public boolean updateCustomerById(long id, Customer customer) {
        return customerRepository.updateCustomerById(id, customer);
    }

}
