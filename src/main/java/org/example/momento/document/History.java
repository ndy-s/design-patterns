package org.example.momento.document;

import java.util.Stack;

public class History {
    private Stack<DocumentState> undoStack = new Stack<>();
    private Stack<DocumentState> redoStack = new Stack<>();

    public void saveState(DocumentState state) {
        undoStack.push(state);
        redoStack.clear();
    }

    public DocumentState undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(undoStack.pop());
            return undoStack.peek();
        }
        return null;
    }

    public DocumentState redo() {
        if (!redoStack.isEmpty()) {
            DocumentState redoState = redoStack.pop();
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}
