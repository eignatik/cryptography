# cryptography

Use Cryptographer class to use crypt and decrypt tools. Based on Hronsfeld crypting.

1. Create new Cryptographer instance with secret key
2. Crypt any String by using Cryptographer#crypt(String) method
3. Decrypt any String by using Cryptographer#decrypt(String) method
4. Call Cryptographer#getMessage() to get crypted or encrypted message

Cryptographer can work as a builder with sequintaly calling its methods.
Example:

Crypting and encripting string
``` java
String result = new Cryptographer(5432).crypt("Hello World!").getMessage(); // returns crypted message
result = new Cryptographer(5432).decrypt(result).getMessage(); // returns Hello World string encrypted by key 5432
```

## How to crypt decrypt?
Set crypt key that represent numbers that will be overlayed on the message and move each character accoring to number in key. First number also defines forward of crypting.
Decrypting works the same way - set key and call decrypt message. Direction of crypting will be got from your key automaticaly. If you use the same key you crypted then you will get correctly encrypted message
