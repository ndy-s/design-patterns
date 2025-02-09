package org.example.iterator.browse_history;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
