package ECommerce.DataAccess.Concretes.Hibernate;

import ECommerce.DataAccess.Abstracts.ProductDao;
import ECommerce.Entities.Concretes.Product;

import java.util.List;

public class HProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernte ile Eklendi: "+product.getProductName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernte ile güncellendi: "+product.getProductName());

    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernte ile silindi: "+product.getProductName());

    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
