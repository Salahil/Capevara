package com.project.pangolinux;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypt {

	public static String chave = "chaveDe16Bytes"; // nome 1001% genérico!
	
	public static String criptografar(String senha, String chave) {
        try {
            // Ajuste a chave para ter exatamente 16 bytes (128 bits)
            byte[] chaveAjustada = new byte[16];
            System.arraycopy(chave.getBytes(), 0, chaveAjustada, 0, Math.min(chave.getBytes().length, 16));
            
            SecretKeySpec chaveSecreta = new SecretKeySpec(chaveAjustada, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, chaveSecreta);
            byte[] textoCriptografado = cipher.doFinal(senha.getBytes());
            return Base64.getEncoder().encodeToString(textoCriptografado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String descriptografar(String senhaCriptografada, String chave) {
        try {
            // Ajuste a chave para ter exatamente 16 bytes (128 bits)
            byte[] chaveAjustada = new byte[16];
            System.arraycopy(chave.getBytes(), 0, chaveAjustada, 0, Math.min(chave.getBytes().length, 16));
            
            SecretKeySpec chaveSecreta = new SecretKeySpec(chaveAjustada, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, chaveSecreta);
            byte[] textoDescriptografado = cipher.doFinal(Base64.getDecoder().decode(senhaCriptografada));
            return new String(textoDescriptografado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
