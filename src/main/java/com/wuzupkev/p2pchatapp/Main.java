package com.wuzupkev.p2pchatapp;
import com.wuzupkev.p2pchatapp.config.DbConnection;
import com.wuzupkev.p2pchatapp.model.service.UserService;
import com.wuzupkev.p2pchatapp.util.CryptoService;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws GeneralSecurityException {
        DbConnection dbConnection= new DbConnection();
        UserService userService= new UserService(dbConnection);

        CryptoService service = new CryptoService();
        KeyPair keyPair = service.generateKeyPair();

        byte[] encryptedMessage = service.encrypt(keyPair.getPublic(), "Hola");

        System.out.println(Base64.getEncoder().encodeToString(encryptedMessage));

        System.out.println(service.decrypt(keyPair.getPrivate(), encryptedMessage));

    }

}
