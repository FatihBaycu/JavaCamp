package ECommerce.Core.Absracts;

import ECommerce.Core.Entities.Concretes.User;

public interface UserService {

    void add(User user);
    void update(User user);
    void delete(User user);

}
