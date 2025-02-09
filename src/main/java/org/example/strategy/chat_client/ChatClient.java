package org.example.strategy.chat_client;

public class ChatClient {
    private Encryption encryption;

    public ChatClient(Encryption encryption) {
        this.encryption = encryption;
    }

    public void send(String message) {
        encryption.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
