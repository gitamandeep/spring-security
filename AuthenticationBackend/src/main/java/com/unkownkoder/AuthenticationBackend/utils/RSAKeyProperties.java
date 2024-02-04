package com.unkownkoder.AuthenticationBackend.utils;

import lombok.*;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Getter
@Setter
@Data
@AllArgsConstructor
@Component
public class RSAKeyProperties {

    private RSAPublicKey publicKey;
    private RSAPrivateKey privateKey;

public RSAKeyProperties(){
    KeyPair pair =  KeyGeneratorUtility.generateRsaKey();
    this.publicKey = (RSAPublicKey) pair.getPublic();
    this.privateKey = (RSAPrivateKey) pair.getPrivate();
}



}
