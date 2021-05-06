package ECommerce.Core.Concretes;

import ECommerce.Core.Absracts.UserService;
import ECommerce.Core.DataAccess.Abstracts.UserDao;
import ECommerce.Core.DataAccess.Concretes.Hibernate.HUserDao;
import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Extensions.Abstracts.Regex;
import ECommerce.Core.Extensions.Concretes.EmailRegex;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public void login(User user) {




    }

    @Override
    public void register(User user) {
        if (checkUser(user)){
            userDao.login(user);

        }

    }

    @Override
    public void add(User user) {
        if (checkUser(user)){
            userDao.add(user);

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
}
