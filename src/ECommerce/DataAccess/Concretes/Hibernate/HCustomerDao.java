package ECommerce.DataAccess.Concretes.Hibernate;

import ECommerce.DataAccess.Abstracts.CustomerDao;
import ECommerce.Entities.Concretes.Customer;

import java.util.List;

public class HCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Hibernte ile Eklendi: "+customer.getFirstName());

    }

    @Override
    public void update(Customer customer) {
        System.out.println("Hibernte ile Güncellendi: "+customer.getFirstName());

    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Hibernte ile Silindi: "+customer.getFirstName());

    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
