package ECommerce.Core.Absracts;

import ECommerce.Core.Entities.Concretes.User;

public interface AuthService {

    void login(User user);
    void register(User user);
}
