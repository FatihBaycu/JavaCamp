package ECommerce.Business.Abstracts;

import ECommerce.Entities.Concretes.Category;
import ECommerce.Entities.Concretes.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);
    void update(Customer customer);
    void delete (Customer customer);
    Customer getById(int id);
    List<Customer > getAll();


}
