package com.wuzupkev.p2pchatapp.model.entity;

import java.time.LocalDateTime;

public class ConversationEntity {
    private int idCoversation;
    private int user1Id;
    private int user2Id;
    private LocalDateTime createdAt;

    public ConversationEntity(int idCoversation, int user1Id, int user2Id, LocalDateTime createdAt) {
        this.idCoversation = idCoversation;
        this.user1Id = user1Id;
        this.user2Id = user2Id;
        this.createdAt = createdAt;
    }
    public ConversationEntity(int user1Id, int user2Id, LocalDateTime createdAt) {
        this.user1Id = user1Id;
        this.user2Id = user2Id;
        this.createdAt = createdAt;
    }

    public ConversationEntity() {
    }

    public int getIdCoversation() {
        return idCoversation;
    }

    public void setIdCoversation(int idCoversation) {
        this.idCoversation = idCoversation;
    }

    public int getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(int user1Id) {
        this.user1Id = user1Id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(int user2Id) {
        this.user2Id = user2Id;
    }

    @Override
    public String toString() {
        return "ConversationEntity{" +
                "idCoversation=" + idCoversation +
                ", user1Id=" + user1Id +
                ", user2Id=" + user2Id +
                ", createdAt=" + createdAt +
                '}';
    }
}
