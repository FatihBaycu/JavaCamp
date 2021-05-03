package InterfaceAndAbstract.Concrete;

import InterfaceAndAbstract.Abstract.BaseCustomerManager;
import InterfaceAndAbstract.Abstract.CustomerCheckService;
import InterfaceAndAbstract.Abstract.CustomerService;
import InterfaceAndAbstract.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this._customerCheckService = customerCheckService;
    }


    @Override
    public void Add(Customer customer) {
        if(_customerCheckService.ChcekIfRealPerson(customer)){
            super.Add(customer);
        }
        else{
            System.out.println("Exception message");
        }
    }



}
