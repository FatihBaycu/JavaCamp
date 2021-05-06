package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.CategoryService;
import ECommerce.DataAccess.Abstracts.CategoryDao;
import ECommerce.Entities.Concretes.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void add(Category category) {
        categoryDao.add(category);
    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);

    }

    @Override
    public void delete(Category category) {
        categoryDao.delete(category);

    }

    @Override
    public Category getById(int id) {
        return categoryDao.getById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
