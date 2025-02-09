package org.example.iterator.product_collection;

public class IteratorApp {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1, "Pen"));
        collection.add(new Product(2, "Pencil"));
        collection.add(new Product(3, "Eraser"));

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
