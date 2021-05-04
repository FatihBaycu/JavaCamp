package InterfaceAndAbstract.Concrete;

import InterfaceAndAbstract.Abstract.CustomerCheckService;
import InterfaceAndAbstract.Abstract.CustomerService;
import InterfaceAndAbstract.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {


    @Override
    public boolean ChcekIfRealPerson(Customer customer) {

        if(customer.getLastName()=="Baycu"){
            return  true;
        }
        else return false;

    }
}
