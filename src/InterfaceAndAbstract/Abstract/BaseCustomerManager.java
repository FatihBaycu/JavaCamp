package InterfaceAndAbstract.Abstract;

import InterfaceAndAbstract.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public void Add(Customer customer) {
        System.out.println("Saved to db "+customer.getFirstName());
    }

    @Override
    public void Update(Customer customer) {

    }

    @Override
    public void Delete(Customer customer) {

    }
}
