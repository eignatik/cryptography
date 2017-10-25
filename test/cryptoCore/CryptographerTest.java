package cryptoCore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CryptographerTest {

    @Test
    public void ifDecryptWorks() throws Exception {
        String message = "Hello world!";
        int key = 2135;
        String result = new Cryptographer(key).crypt(message).getMessage();
        result = new Cryptographer(key).decrypt(result).getMessage();
        Assertions.assertTrue(message.equals(result));
    }
}
