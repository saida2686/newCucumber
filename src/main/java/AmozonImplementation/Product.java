package AmozonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
   private int price;



    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, Integer price) {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public List<String>getProductList(){
        List<String>productList =new ArrayList<>();
        productList.add("APPLE MacBook Pro");
        productList.add("Apple Mac Book Air ");
        productList.add("Apple Iphone 12 ");
        return productList;

    }
}
