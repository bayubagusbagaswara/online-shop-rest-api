package com.bayu.securitytests;

import org.junit.jupiter.api.Test;

import java.security.*;
import java.util.Base64;

public class JwtRsaTests {

    @Test
    public void testJWTWithRsa() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
        keyGenerator.initialize(2048); // bisa 1024

        KeyPair kp = keyGenerator.genKeyPair();
        PublicKey publicKey = (PublicKey) kp.getPublic();
        PrivateKey privateKey = (PrivateKey) kp.getPrivate();

        String encodedPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        String encodedPrivateKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());
        System.out.println("Public Key:");
        System.out.println(convertToPublicKey(encodedPublicKey));
        System.out.println("Private Key");
        System.out.println(convertToPublicKey(encodedPrivateKey));
    }

//    @SuppressWarnings("deprecation")
//    public String generateJwtToken(PrivateKey privateKey) {
//        String token = Jwts.builder().setSubject("adam")
//                .setExpiration(new Date(2018, 1, 1))
//                .setIssuer("info@wstutorial.com")
//                .claim("groups", new String[] { "user", "admin" })
//                // RS256 with privateKey
//                .signWith(SignatureAlgorithm.RS256, privateKey).compact();
//        return token;
//    }
//
//    //Print structure of JWT
//    public void printStructure(String token, PublicKey publicKey) {
//        Jws
//
//                parseClaimsJws = Jwts.parser().setSigningKey(publicKey)
//                .parseClaimsJws(token);
//
//        System.out.println("Header     : " + parseClaimsJws.getHeader());
//        System.out.println("Body       : " + parseClaimsJws.getBody());
//        System.out.println("Signature  : " + parseClaimsJws.getSignature());
//    }


    // Add BEGIN and END comments
    private String convertToPublicKey(String key){
        StringBuilder result = new StringBuilder();
        result.append("-----BEGIN PUBLIC KEY-----\n");
        result.append(key);
        result.append("\n-----END PUBLIC KEY-----");
        return result.toString();
    }

    // generate key pair

//    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
//keyPairGenerator.initialize(1024);
//    KeyPair keyPair = keyPairGenerator.genKeyPair();
//
//    // extract the encoded private key, this is an unencrypted PKCS#8 private key
//    byte[] encodedprivkey = keyPair.getPrivate().getEncoded();
//
//    // We must use a PasswordBasedEncryption algorithm in order to encrypt the private key, you may use any common algorithm supported by openssl, you can check them in the openssl documentation http://www.openssl.org/docs/apps/pkcs8.html
//    String MYPBEALG = "PBEWithSHA1AndDESede";
//    String password = "pleaseChangeit!";
//
//    int count = 20;// hash iteration count
//    SecureRandom random = new SecureRandom();
//    byte[] salt = new byte[8];
//random.nextBytes(salt);
//
//    // Create PBE parameter set
//    PBEParameterSpec pbeParamSpec = new PBEParameterSpec(salt, count);
//    PBEKeySpec pbeKeySpec = new PBEKeySpec(password.toCharArray());
//    SecretKeyFactory keyFac = SecretKeyFactory.getInstance(MYPBEALG);
//    SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);
//
//    Cipher pbeCipher = Cipher.getInstance(MYPBEALG);
//
//// Initialize PBE Cipher with key and parameters
//pbeCipher.init(Cipher.ENCRYPT_MODE, pbeKey, pbeParamSpec);
//
//    // Encrypt the encoded Private Key with the PBE key
//    byte[] ciphertext = pbeCipher.doFinal(encodedprivkey);
//
//    // Now construct  PKCS #8 EncryptedPrivateKeyInfo object
//    AlgorithmParameters algparms = AlgorithmParameters.getInstance(MYPBEALG);
//algparms.init(pbeParamSpec);
//    EncryptedPrivateKeyInfo encinfo = new EncryptedPrivateKeyInfo(algparms, ciphertext);
//
//    // and here we have it! a DER encoded PKCS#8 encrypted key!
//    byte[] encryptedPkcs8 = encinfo.getEncoded();
}
