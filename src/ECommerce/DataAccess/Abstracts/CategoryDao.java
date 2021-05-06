package ECommerce.DataAccess.Abstracts;

import ECommerce.Entities.Concretes.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete (Category category);
    Category getById(int id);
    List<Category> getAll();
}
