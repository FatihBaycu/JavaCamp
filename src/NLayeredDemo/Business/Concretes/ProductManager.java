package NLayeredDemo.Business.Concretes;

import NLayeredDemo.Business.Abstracts.ProductService;
import NLayeredDemo.Core.LoggerService;
import NLayeredDemo.DataAccess.Abstracts.ProductDao;
import NLayeredDemo.DataAccess.Concretes.HibernateProductDao;
import NLayeredDemo.Entities.Concretes.Product;
import NLayeredDemo.JLogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductDao, ProductService {

    private  ProductDao productDao;

   private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("bu kategoride ürün kabul edilmiyor.");
            return;
        }
        productDao.add(product);
        loggerService.logToSystem(product.getName());

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product getByid(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
