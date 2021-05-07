package ECommerce.ConsoleUI;

import ECommerce.Core.Absracts.AuthService;
import ECommerce.Core.Absracts.UserService;
import ECommerce.Core.Concretes.AuthManager;
import ECommerce.Core.Concretes.UserManager;
import ECommerce.Core.DataAccess.Concretes.Hibernate.HUserDao;
import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Extensions.Concretes.GoogleAuth;
import ECommerce.Core.Extensions.Concretes.GoogleAuthManagerAdapter;

public class Main {
    public static void main(String[] args) {

        UserService userService=new UserManager(new HUserDao());
        User user=new User();


        AuthService authManager=new GoogleAuthManagerAdapter();

        user.setUserId(1);
        user.setEmail("fatih@baycu.com");
        user.setFirstName("Fatih");
        user.setLastName("Baycu");
        user.setPassword("12398746");
        authManager.register(user);
        authManager.login(user);


        }

    }

