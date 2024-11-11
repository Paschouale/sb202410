package gr.codehub.sb.repository;

import gr.codehub.sb.domain.Customer;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerRepositoryImpl implements CustomerRepository{

    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1L, "Dimitrios Paschalis", "paschouale@hotmail.com",
                new Date(120, 0, 1)));
        customers.add(new Customer(2L, "Dimitrios Zachos", "dzachos@hotmail.com",
                new Date(122, 4, 15)));
        customers.add(new Customer(1_000_003L, "Theodora Vasiladioti", "tvasil@hotmail.com",
                new Date(124, 10, 10)));
    }

    public Customer findCustomerById(long id){
        for (Customer customer : customers){
            if (customer.getId() == id){
                return customer;
            }
        }
        return  null;
    }
}
