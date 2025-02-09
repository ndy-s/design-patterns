package org.example.strategy.image_storage;

public interface Compressor {
    // byte[] compress(byte[] image);
    void compress(String fileName);
}
