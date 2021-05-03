package InterfaceAndAbstract.Adapters;

import InterfaceAndAbstract.Abstract.CustomerCheckService;
import InterfaceAndAbstract.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean ChcekIfRealPerson(Customer customer) {

        //        KpsPublicSoapClient client=new KpsPublicSoapClient();
//        return client.TcKimlikNoDogrula(customer.getNatiolanityId(),customer.getFirstName().toUpperCase(),
//                customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());


        //MERNİS SİSTEMİNİN ÇALIŞMASI İÇİN "MAVEN" YAPIDA BİR PROJE OLMASI GEREKİYOR ANCAK ÖYLE WEB SERVİCE KULLANABİLİRİZ.
        //BU PROJE STANDART CONSOLE APP JAVA OLDUĞU İÇİN BURADA ÇALIŞMADI FAKAT KODLAR BİREBİR AYNI....


        return true;
    }
}
