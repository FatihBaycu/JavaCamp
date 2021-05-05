package InterfaceAndAbstract.Adapters;

import InterfaceAndAbstract.Abstract.CustomerCheckService;
import InterfaceAndAbstract.Entities.Customer;
import InterfaceAndAbstract.Mernis.HWCKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean ChcekIfRealPerson(Customer customer) {

        HWCKPSPublicSoap client=new HWCKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNatiolanityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getDateOfBirth().getYear()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }


        return true;
    }
}
