package com.wuzupkev.p2pchatapp.model.entity;

import java.time.LocalDateTime;

public class MessageEntity {
    private int idMessage ;
    private int senderId;
    private int conversationId;
    private String encryptedMesage;
    private String initializationVector;
    private LocalDateTime sentat;

    public MessageEntity(int idMessage, int senderId, String encryptedMesage, int conversationId, String initializationVector, LocalDateTime sentat) {
        this.idMessage = idMessage;
        this.senderId = senderId;
        this.encryptedMesage = encryptedMesage;
        this.conversationId = conversationId;
        this.initializationVector = initializationVector;
        this.sentat = sentat;
    }
    public MessageEntity( int senderId, String encryptedMesage, int conversationId, String initializationVector, LocalDateTime sentat) {
        this.senderId = senderId;
        this.encryptedMesage = encryptedMesage;
        this.conversationId = conversationId;
        this.initializationVector = initializationVector;
        this.sentat = sentat;
    }


    public MessageEntity() {
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    }

    public String getEncryptedMesage() {
        return encryptedMesage;
    }

    public void setEncryptedMesage(String encryptedMesage) {
        this.encryptedMesage = encryptedMesage;
    }

    public String getInitializationVector() {
        return initializationVector;
    }

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    public LocalDateTime getSentat() {
        return sentat;
    }

    public void setSentat(LocalDateTime sentat) {
        this.sentat = sentat;
    }


    @Override
    public String toString() {
        return "MessageEntity{" +
                "idMessage=" + idMessage +
                ", senderId=" + senderId +
                ", conversationId=" + conversationId +
                ", encryptedMesage='" + encryptedMesage + '\'' +
                ", initializationVector='" + initializationVector + '\'' +
                ", createdAt=" + sentat +
                '}';
    }
}
