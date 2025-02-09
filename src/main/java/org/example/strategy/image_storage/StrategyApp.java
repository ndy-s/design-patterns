package org.example.strategy.image_storage;

public class StrategyApp {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("photo", new JpegComporessor(), new BlackAndWhiteFilter());
        imageStorage.store("photo", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
