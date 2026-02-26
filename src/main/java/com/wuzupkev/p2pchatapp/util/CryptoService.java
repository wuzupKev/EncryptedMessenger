package com.wuzupkev.p2pchatapp.util;

import javax.crypto.Cipher;
import java.security.*;

public class CryptoService {

    public KeyPair generateKeyPair() throws GeneralSecurityException {

        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);

        return generator.generateKeyPair();
    }

    public byte[] encrypt(PublicKey publicKey, String message)
            throws GeneralSecurityException {

        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(message.getBytes());
    }

    public byte[] decrypt(PrivateKey privateKey, byte[] encryptedMessage)
            throws GeneralSecurityException {

        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        return cipher.doFinal(encryptedMessage);
    }
}