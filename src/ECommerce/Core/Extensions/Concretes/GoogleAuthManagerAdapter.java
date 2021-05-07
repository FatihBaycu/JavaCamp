package ECommerce.Core.Extensions.Concretes;

import ECommerce.Core.Absracts.AuthService;
import ECommerce.Core.Entities.Concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {

    GoogleAuth googleAuth=new GoogleAuth();

    @Override
    public void login(User user) {
        googleAuth.login(user);
    }

    @Override
    public void register(User user) {
        googleAuth.register(user);
    }
}
