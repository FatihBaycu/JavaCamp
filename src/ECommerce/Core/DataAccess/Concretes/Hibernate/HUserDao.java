package ECommerce.Core.DataAccess.Concretes.Hibernate;

import ECommerce.Core.DataAccess.Abstracts.UserDao;
import ECommerce.Core.Entities.Concretes.User;

import java.util.List;

public class HUserDao implements UserDao {


    @Override
    public void login(User user) {
        System.out.println("Hibernte ile giriş yapıldı: "+user.getFirstName());

    }

    @Override
    public void register(User user) {
        System.out.println("Hibernte ile kayıt olundu: "+user.getFirstName());

    }

    @Override
    public void add(User user) {
        System.out.println("Hibernte ile Eklendi: "+user.getFirstName());

    }

    @Override
    public void update(User user) {
        System.out.println("Hibernte ile Güncellendi: "+user.getFirstName());

    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernte ile Silindi: "+user.getFirstName());

    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
