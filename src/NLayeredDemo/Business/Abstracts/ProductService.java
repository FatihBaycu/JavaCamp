package NLayeredDemo.Business.Abstracts;

import NLayeredDemo.Entities.Concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
