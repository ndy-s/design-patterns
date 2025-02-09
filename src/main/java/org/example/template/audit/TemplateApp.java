package org.example.template.audit;

public class TemplateApp {
    public static void main(String[] args) {
        var task = new TransferMoney();
        task.doExecute();
    }
}
