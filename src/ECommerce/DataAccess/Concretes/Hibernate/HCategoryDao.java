package ECommerce.DataAccess.Concretes.Hibernate;

import ECommerce.DataAccess.Abstracts.CategoryDao;
import ECommerce.Entities.Concretes.Category;

import java.util.List;

public class HCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernte ile Eklendi: "+category.getCategoryName());

    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernte ile Güncellendi: "+category.getCategoryName());

    }

    @Override
    public void delete(Category category) {

           System.out.println("Hibernte ile Silindi: "+category.getCategoryName());
}

    @Override
    public Category getById(int id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
