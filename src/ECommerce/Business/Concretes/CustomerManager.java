package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.CustomerService;
import ECommerce.DataAccess.Abstracts.CustomerDao;
import ECommerce.Entities.Concretes.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        customerDao.add(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);

    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);

    }

    @Override
    public Customer getById(int id) {
        return customerDao.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }
}
