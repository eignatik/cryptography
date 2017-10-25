package cryptoCore;

public class Cryptographer {
    private char[] secretKey;
    private boolean isForwardDirection;
    private String message;

    public Cryptographer(int secretKey) {
        this.secretKey = String.valueOf(secretKey).toCharArray();
        isForwardDirection = this.secretKey[0] % 2 == 0;
    }

    public Cryptographer crypt(String message) throws Exception {
        setMessage(operateMessage(message.toCharArray()));
        return this;
    }

    public Cryptographer decrypt(String message) throws Exception {
        isForwardDirection = !isForwardDirection;
        setMessage(operateMessage(message.toCharArray()));
        return this;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private String operateMessage(char[] message) throws Exception {
        boolean isMessageOperated = false;
        int index = 0;
        while (!isMessageOperated) {
            for (char k : secretKey) {
                message[index] = (char) (isForwardDirection? message[index++] + k : message[index++] - k);
            }
            isMessageOperated = index == message.length;
        }
        return String.valueOf(message);
    }
}
