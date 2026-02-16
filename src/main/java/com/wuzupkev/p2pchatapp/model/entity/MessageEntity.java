package com.wuzupkev.p2pchatapp.model.entity;

import java.time.LocalDateTime;

public class MessageEntity {
    private int idMessage ;
    private int senderId;
    private int conversationId;
    private String encryptedMesage;
    private String initializationVector;
    private LocalDateTime createdAt;

    public MessageEntity(int idMessage, int senderId, String encryptedMesage, int conversationId, String initializationVector, LocalDateTime createdAt) {
        this.idMessage = idMessage;
        this.senderId = senderId;
        this.encryptedMesage = encryptedMesage;
        this.conversationId = conversationId;
        this.initializationVector = initializationVector;
        this.createdAt = createdAt;
    }
    public MessageEntity( int senderId, String encryptedMesage, int conversationId, String initializationVector, LocalDateTime createdAt) {
        this.senderId = senderId;
        this.encryptedMesage = encryptedMesage;
        this.conversationId = conversationId;
        this.initializationVector = initializationVector;
        this.createdAt = createdAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "MessageEntity{" +
                "idMessage=" + idMessage +
                ", senderId=" + senderId +
                ", conversationId=" + conversationId +
                ", encryptedMesage='" + encryptedMesage + '\'' +
                ", initializationVector='" + initializationVector + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
