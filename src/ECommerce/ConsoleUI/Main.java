package ECommerce.ConsoleUI;

import ECommerce.Business.Abstracts.CustomerService;
import ECommerce.Business.Concretes.CustomerManager;
import ECommerce.Core.Absracts.UserService;
import ECommerce.Core.Concretes.UserManager;
import ECommerce.Core.DataAccess.Concretes.Hibernate.HUserDao;
import ECommerce.Core.Entities.Concretes.User;
import ECommerce.Core.Extensions.Abstracts.Regex;
import ECommerce.Core.Extensions.Concretes.EmailRegex;
import ECommerce.DataAccess.Concretes.Hibernate.HCustomerDao;
import ECommerce.Entities.Concretes.Customer;

public class Main {
    public static void main(String[] args) {

        UserService userService=new UserManager(new HUserDao());
        User user=new User();

        user.setUserId(1);
        user.setEmail("fatih@baycu.com");
        user.setFirstName("Fatih");
        user.setLastName("Baycu");
        user.setPassword("12398746");
        userService.register(user);
        userService.login(user);

        }

    }

