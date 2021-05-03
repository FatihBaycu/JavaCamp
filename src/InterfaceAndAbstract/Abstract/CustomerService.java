package InterfaceAndAbstract.Abstract;

import InterfaceAndAbstract.Entities.Customer;

public interface CustomerService {

    public  void Add(Customer customer);

    public void Update(Customer customer);

    public void Delete(Customer customer);
}
