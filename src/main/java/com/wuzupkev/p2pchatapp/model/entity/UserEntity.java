package com.wuzupkev.p2pchatapp.model.entity;

public class UserEntity {
    private int idUser;
    private String username;
    private String publicKey;
    private String password;

    public UserEntity( String username, String publicKey, String password) {
        this.username = username;
        this.publicKey = publicKey;
        this.password = password;
    }

    public UserEntity(int idUser, String username, String publicKey, String password) {
        this.idUser = idUser;
        this.username = username;
        this.publicKey = publicKey;
        this.password = password;
    }

    public UserEntity() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
