package ECommerce.Core.DataAccess.Abstracts;

import ECommerce.Core.Entities.Concretes.User;

import java.util.List;

public interface UserDao {


    void login(User user);

    void register(User user);


    void add(User user);

    void update(User user);

    void delete(User user);

    User getById(int id);

    List<User> getAll();
}