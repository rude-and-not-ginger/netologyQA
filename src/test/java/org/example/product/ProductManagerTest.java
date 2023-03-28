package org.example.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductManager manager = new ProductManager();
    ProductRepository repository = new ProductRepository();

    Product first = new Book(1,"A21", 20, "Haksley");
    Product second = new Book(2,"Two", 10, "Oldos");
    Product third = new Book(3,"Three", 15, "A21");
    Product fourth = new Book(4,"Four", 25, "Beter");
    Product fifth = new Smartphone(5, "Redmi" , 30, "Xiaomi");
    Product sixth= new Smartphone(6, "XS" , 40, "Iphone");
    Product seventh = new Smartphone(7, "Xperia" , 35, "Sony");
    Product eight = new Smartphone(8, "A21" , 130, "Samsung");

    @Test
    public void shouldAddProducts() {

        manager.add(first);
        manager.add(second);
        manager.add(eight);

        Product[] actual = manager.getAll();

        Product[] expected = new Product[] {eight, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnSearchedProduct() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);

        String text = "A21";
        Product[] actual = manager.searchBy(text);
        Product[] expected = {eight, first};

        assertArrayEquals(expected, actual);
    }


}