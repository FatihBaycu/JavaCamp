package ECommerce.Core.Concretes;

import ECommerce.Core.Absracts.UserService;
import ECommerce.Core.DataAccess.Abstracts.UserDao;
import ECommerce.Core.DataAccess.Concretes.Hibernate.HUserDao;
import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Extensions.Abstracts.Regex;
import ECommerce.Core.Extensions.Concretes.EmailRegex;

import java.util.Random;

public class UserManager implements UserService {

    private UserDao userDao;
    double confirmationCode;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login(User user) {
        if (user.getFirstName()!=null && user.getPassword()!=null && checkUser(user)){
            System.out.println("Giriş yapıldı.");
        }else {
            System.out.println("Parola veya email hatalı.");
        }
    }

    boolean confirmate=false;
    @Override
    public void register(User user) {
        if (checkUser(user)){
             sendEmailConfirmation(user);
            if (confirmate==true)
                userDao.login(user);
        }

    }

    @Override
    public void add(User user) {
        if (checkUser(user)){
            sendEmailConfirmation(user);
            if (confirmate==true)
                userDao.login(user);
        }

    }

    @Override
    public void update(User user) {
        if (checkUser(user)){
            userDao.update(user);

        }

    }

    @Override
    public void delete(User user) {
        userDao.delete(user);

    }


    boolean checkUser(User user){

        Regex regex=new EmailRegex();

        if (regex.emailControl(user.getEmail()) && user.getPassword().length()>6 && user.getFirstName().length()>2 && user.getLastName().length()>2){
        return true;
        }else{
            System.out.println("Lütfen bilgilerinizi kontrol ediniz.");
            return false;
        }
    }


    void sendEmailConfirmation(User user){
        System.out.println("\nemail adresinize doğrulama kodu gönderildi.");
        confirmate=false;
        Random random=new Random();
        confirmationCode =random.nextInt(99999999);
        confirmateEmail();
    }

    void confirmateEmail(){
    confirmate=true;

        System.out.println("doğrulama kodunu giriniz:\n");
        if (confirmationCode==confirmationCode){
            System.out.println(confirmationCode+"\nemail adresiniz doğrulandı.\n");
        }
        else{
            System.out.println("Email doğrulanmadı.");
        }
    }


}
