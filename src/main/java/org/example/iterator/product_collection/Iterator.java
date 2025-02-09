package org.example.iterator.product_collection;

public interface Iterator<T> {
    public boolean hasNext();
    public T current();
    public void next();
}
