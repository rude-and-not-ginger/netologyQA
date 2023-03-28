package org.example.product;

public class ProductRepository {
    Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        int index = tmp.length - 1;
        tmp[index] = product;
        products = tmp;
    }
      public Product[] getAll() {
          Product[] result = new Product[products.length];
          for (int i = 0; i < result.length; i++) {
              int index = products.length - i - 1;
              result[i] = products[index];
          }
          return result;

      }
      public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product: products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }

        }
        products = tmp;
    }
}
