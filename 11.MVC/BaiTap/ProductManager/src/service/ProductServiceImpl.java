package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Xa Phong","5$","Xa Phong Tre Em","Trung Quoc"));
        products.put(2,new Product(2,"Bot Giat","9$","Bot Giat Huu Co","Thai Lan"));
        products.put(3,new Product(3,"Ban Chai","2$","Bai Chai Tre Em","Indo"));
        products.put(4,new Product(4,"Thuoc Nhuom","8$","Thuoc Nhuom Toc Bac","Viet Nam"));
        products.put(5,new Product(5,"Kem Danh Rang","2$","Kem Mui Trai Cay","Han Quoc"));
        products.put(6,new Product(6,"Thuoc Tay","4$","Thuoc Tay Toilet","Nhat ban"));
        products.put(7,new Product(7,"Cay Lau Nha","9$","Cay Lau Nha Nhua Cao Cap","Philippin"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
