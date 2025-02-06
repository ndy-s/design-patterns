package org.example.momento.document;

public class MomentoApp {
    public static void main(String[] args) {
        Document doc = new Document();
        History history = new History();

        // Initial content
        doc.setContent("Hello");
        doc.setFontName("Arial");
        doc.setFontSize(12);
        history.saveState(doc.save()); // Save state #1

        // Change 1
        doc.setContent("Hello, World!");
        doc.setFontName("Times New Roman");
        doc.setFontSize(14);
        history.saveState(doc.save()); // Save state #2

        // Change 2
        doc.setContent("Hello, Universe!");
        doc.setFontSize(16);
        history.saveState(doc.save()); // Save state #3

        // Print current state
        System.out.println("Current Document: " + doc);

        // Undo last change
        doc.restore(history.undo());
        System.out.println("After Undo 1: " + doc);

        // Undo second change
        doc.restore(history.undo());
        System.out.println("After Undo 2: " + doc);
    }
}
