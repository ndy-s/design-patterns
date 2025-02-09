package org.example.iterator.product_collection;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private ProductCollection collection;
        private int index;

        ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public String current() {
            return collection.products.get(index).toString();
        }

        @Override
        public void next() {
            index++;
        }
    }

}