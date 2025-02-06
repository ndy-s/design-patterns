package org.example.momento.editor;

import java.util.Stack;

// Caretaker
public class History {
    private Stack<EditorState> undoStack = new Stack<>();
    private Stack<EditorState> redoStack = new Stack<>();

    public void saveState(EditorState state) {
        undoStack.push(state);
        redoStack.clear();
    }

    public EditorState undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(undoStack.pop());
            return undoStack.peek();
        }
        return null;
    }

    public EditorState redo() {
        if (!redoStack.isEmpty()) {
            EditorState redoState = redoStack.pop();
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}
