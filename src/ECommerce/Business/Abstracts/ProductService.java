package ECommerce.Business.Abstracts;

import ECommerce.Entities.Concretes.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);
    void update(Product product);
    void delete (Product product);
    Product getById(int id);
    List<Product> getAll();

}
