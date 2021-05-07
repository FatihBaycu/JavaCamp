package ECommerce.Business.Concretes;

import ECommerce.Business.Abstracts.ProductService;
import ECommerce.DataAccess.Abstracts.ProductDao;
import ECommerce.Entities.Concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {


    private ProductDao productDao;


    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        productDao.add(product);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }

    @Override
    public Product getById(int id) {
        return productDao.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
