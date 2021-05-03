package InterfaceAndAbstract.Adapters;

import InterfaceAndAbstract.Abstract.CustomerCheckService;
import InterfaceAndAbstract.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean ChcekIfRealPerson(Customer customer) {
//        KpsPublicSoapClient client=new KpsPublicSoapClient();
//        return client.TcKimlikNoDogrula(customer.getNatiolanityId(),customer.getFirstName().toUpperCase(),
//                customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
return true;
    }
}
