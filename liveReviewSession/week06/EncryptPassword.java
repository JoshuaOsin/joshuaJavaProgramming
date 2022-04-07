package week06;

public class EncryptPassword {
    public static void main(String[] args) {
        String password = "Cydeo";
        char encryptChar = 'x';
        String encryptedPassword = "";
        int l = password.length();

        for (int i = 0; i < l ; i++) {

            encryptedPassword += ""+ password.charAt(i) +encryptChar;

        }
        System.out.println("password = " + password);
        System.out.println("encryptedPassword = " + encryptedPassword);
    }
}
/*
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */