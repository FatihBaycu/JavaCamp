package InterfaceAndAbstract;

import InterfaceAndAbstract.Abstract.BaseCustomerManager;
import InterfaceAndAbstract.Adapters.MernisServiceAdapter;
import InterfaceAndAbstract.Concrete.CustomerCheckManager;
import InterfaceAndAbstract.Concrete.NeroCustomerManager;
import InterfaceAndAbstract.Concrete.StarbucksCustomerManager;
import InterfaceAndAbstract.Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


       BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());

       baseCustomerManager.Add(new Customer(1,"fatih","baycu", new Date( 2021,01,01),"12345678910"));

    }
}
