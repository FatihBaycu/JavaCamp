package NLayeredDemo.ConsoleUI;

import NLayeredDemo.Business.Abstracts.ProductService;
import NLayeredDemo.Business.Concretes.ProductManager;
import NLayeredDemo.Core.LoggerManager;
import NLayeredDemo.DataAccess.Concretes.AbcProductDemo;
import NLayeredDemo.DataAccess.Concretes.HibernateProductDao;
import NLayeredDemo.Entities.Concretes.Product;
import NLayeredDemo.JLogger.JLoggerManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ToDo: Spring Ioc ile çözülecek.
        ProductService productService= new ProductManager(new AbcProductDemo(),new LoggerManager());

        Product product=new Product(1,2,"Ball",12,12);

        productService.add(product);

    }
}
