package org.example.momento.editor;

// Originator
public class Editor {
    private String content = "";

    public void type(String words) {
        content += words;
    }

    public String getContent() {
        return content;
    }

    public EditorState save() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        if (state != null) {
            content = state.getContent();
        }
    }
}
