package org.example.strategy.chat_client;

public class StrategyApp {
    public static void main(String[] args) {
        ChatClient client = new ChatClient(new AesEncryption());
        client.send("Hello World");
    }
}
