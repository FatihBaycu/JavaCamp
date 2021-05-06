package ECommerce.Business.Abstracts;

import ECommerce.Entities.Concretes.Category;
import ECommerce.Entities.Concretes.Product;

import java.util.List;

public interface CategoryService {
    void add(Category category);
    void update(Category category);
    void delete (Category category);
    Category getById(int id);
    List<Category> getAll();
}
