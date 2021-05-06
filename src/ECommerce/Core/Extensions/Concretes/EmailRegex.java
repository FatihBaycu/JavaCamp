package ECommerce.Core.Extensions.Concretes;

import ECommerce.Core.Extensions.Abstracts.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex  implements Regex {

    Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    @Override
    public boolean emailControl(String email) {
     Matcher matcher=pattern.matcher(email);
     if (matcher.find()==true){
         System.out.println("Geçerli email adresi");
         return true;
     }
     else System.out.println("Geçersiz email adresi");
     return false;
    }
}
