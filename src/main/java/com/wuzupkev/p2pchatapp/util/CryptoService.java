package com.wuzupkev.p2pchatapp.util;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class CryptoService {

    public KeyPair generateKeyPair() throws GeneralSecurityException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        return generator.generateKeyPair();
    }

    public byte[] encrypt(PublicKey publicKey, String message)
            throws GeneralSecurityException {

        Cipher cipher = Cipher.getInstance("RSA");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(message.getBytes());
    }

    public String decrypt(PrivateKey privateKey, byte[] encryptedMessage)
            throws GeneralSecurityException {

        Cipher cipher = Cipher.getInstance("RSA");

        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decryptedBytes = cipher.doFinal(encryptedMessage);

        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}