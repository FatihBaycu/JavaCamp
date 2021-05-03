package InterfaceAndAbstract;

import InterfaceAndAbstract.Abstract.BaseCustomerManager;
import InterfaceAndAbstract.Concrete.CustomerCheckManager;
import InterfaceAndAbstract.Concrete.NeroCustomerManager;
import InterfaceAndAbstract.Concrete.StarbucksCustomerManager;
import InterfaceAndAbstract.Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


       BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager.Add(new Customer(1,"Fatih","Baycu", new Date( 2012,12,12),"12345689"));

    }
}
