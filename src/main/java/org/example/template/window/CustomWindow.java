package org.example.template.window;

public class CustomWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Running some custom code before closing window");
    }

    @Override
    protected void afterClose() {
        System.out.println("Running some custom code after closing window");
    }
}
