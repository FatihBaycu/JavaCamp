package ECommerce.Core.Extensions.Concretes;

import ECommerce.Core.Entities.Concretes.User;

public class GoogleAuth {

    ValidationManager validationManager=new ValidationManager();

   public void login(User user){
            if (validationManager.loginValidation(user)){
                System.out.println("google ile giriş yapıldı.");
            }
            else{
                System.out.println("hatalı giriş");
            }
    }
   public void register(User user){
       if (validationManager.checkUser(user) && validationManager.sendEmailConfirmation(user) && validationManager.emailControl(user.getEmail())){
           System.out.println("google ile üye olundu");
       }
       else{
           System.out.println("Kullanıcı bilgileri kabul edilemedi.");
       }
    }
}
