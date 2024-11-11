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
        customers.add(new Customer(3L, "Yiota Plati", "plati@hotmail.com",
                new Date(121, 2, 4)));
        customers.add(new Customer(4L, "Thomas Karavasilis", "tkarav@hotmail.com",
                new Date(123, 7, 25)));
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

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> copyCustomerList = new ArrayList<>(customers);
        return copyCustomerList;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public boolean deleteCustomerById(long id) {
        Customer customer = findCustomerById(id);
        if (customer == null) return false;
        customers.remove(customer);
        return true;
    }

    @Override
    public boolean updateCustomerById(long id, Customer customer) {
        Customer customerFromList = findCustomerById(id);
        if (customerFromList == null) return false;
        customerFromList.setEmail(customer.getEmail());
        customerFromList.setName(customer.getName());
        customerFromList.setRegistrationDate(customer.getRegistrationDate());
        return true;
    }
}
