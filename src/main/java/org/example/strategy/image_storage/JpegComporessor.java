package org.example.strategy.image_storage;

public class JpegComporessor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
