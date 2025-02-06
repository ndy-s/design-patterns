package org.example.momento.editor;

public class MomentoApp {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        // User types text
        editor.type("Hello ");
        history.saveState(editor.save());

        editor.type("World!");
        history.saveState(editor.save());

        System.out.println("Current Content: " + editor.getContent());

        // User presses Undo (Ctrl + Z)
        editor.restore(history.undo());
        System.out.println("After Undo: " + editor.getContent());

        // User presses Redo (Ctrl + Y)
        editor.restore(history.redo());
        System.out.println("After Redo: " + editor.getContent());
    }
}
