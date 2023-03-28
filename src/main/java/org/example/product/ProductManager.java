package org.example.product;

public class ProductManager {
    protected Product[] products = new Product[0];
    ProductRepository repository = new ProductRepository();
    public void add(Product product) {
        repository.add(product);
    }
    public Product[] getAll() {
        Product[] result = repository.getAll();
        return result;
    }
    public Product[] searchBy(String text) {
        Product[] result = new Product[0];

        for (Product product: repository.getAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length+1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
            tmp[tmp.length - 1] = product;
            result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        return product.getName().contains(search);
    }
}

