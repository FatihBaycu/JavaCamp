package NLayeredDemo.DataAccess.Abstracts;

import NLayeredDemo.Entities.Concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product getByid(int id);
    List<Product> getAll();

}
