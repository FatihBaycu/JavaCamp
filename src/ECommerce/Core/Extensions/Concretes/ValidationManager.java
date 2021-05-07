package ECommerce.Core.Extensions.Concretes;

import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Extensions.Abstracts.Validation;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager implements Validation {

    double confirmationCode;

        public boolean emailControl(String email) {
            Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);

            Matcher matcher=pattern.matcher(email);
            if (matcher.find()==true){
                System.out.println("Geçerli email adresi");
                return true;
            }
            else System.out.println("Geçersiz email adresi");
            return false;
        }


        public boolean checkUser(User user) {
        if (emailControl(user.getEmail()) && user.getPassword().length() > 6 && user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
            return true;
        } else {
            System.out.println("Lütfen bilgilerinizi kontrol ediniz.");
            return false;
        }
    }

    public boolean sendEmailConfirmation(User user) {
        System.out.println("\nemail adresinize doğrulama kodu gönderildi.");
        Random random = new Random();
        confirmationCode = random.nextInt(99999999);
        confirmateEmail();
        return true;
    }

    public boolean confirmateEmail() {

        System.out.println("doğrulama kodunu giriniz:\n");
        if (confirmationCode == confirmationCode) {
            System.out.println(confirmationCode + "\nemail adresiniz doğrulandı.\n");
        return true;
        } else {
            System.out.println("Email doğrulanmadı.");
            return false;
        }
    }

    public boolean loginValidation(User user){
            if (user.getEmail()!=null && user.getPassword()!=null)
            {
                return  true;
            }
            else{
                return false;
            }
    }



}
