package gr.codehub.sb.service;

import gr.codehub.sb.domain.Customer;
import gr.codehub.sb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;


    public Customer findCustomerById(long id){
        if (id >= 1_000_000){ // Για να καταλαβαίνουμε τα πόσα μηδενικά έχει 1000000
            return null;
        }
        Customer response = customerRepository.findCustomerById(id);
        return response;
    }
}
