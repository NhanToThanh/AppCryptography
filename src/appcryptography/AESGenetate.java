package appcryptography;

import java.io.File;
import java.io.FileOutputStream;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESGenetate {
     static File direc = new File("");
    private static String fileName = direc.getAbsolutePath();
    
    
    public static void saveKey(final int KEY_SIZE) {
        FileOutputStream fot = null;
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            keyGen.init(KEY_SIZE, sr);
            SecretKey secretKey = keyGen.generateKey();
            byte[] secretKeyByte = secretKey.getEncoded();
            
            
                FileOutputStream fos = new FileOutputStream(fileName + "\\key_AES.txt");
                fos.write(secretKeyByte);
                fos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
