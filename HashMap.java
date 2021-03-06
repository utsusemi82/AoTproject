import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        HashMap map = new HashMap();
        while (!input.isEmpty()) {
            System.out.print("Enter Marley sentence: ");
            input = sc.nextLine();
            System.out.println('\n' + map.convert(input));
        }
        RSA rsa = new RSA();
        try{
            System.out.print("Enter Paradis sentence: ");
            input = sc.nextLine();
            System.out.println("Performing RSA encryption");
            String encryptedMessage = rsa.encrypt(input);
            String decryptedMessage = rsa.decrypt(encryptedMessage);

            System.err.println("Encrypted:\n"+encryptedMessage);
            System.err.println("Decrypted:\n"+decryptedMessage);
        }catch (Exception ingored){}
    }

    private static char[] dict = { 'j', 'c', 't', 'a', 'k', 'z', 's', 'i', 'w', 'x', 'o', 'n', 'g', 'b', 'f', 'h', 'l',
            'd', 'e', 'y', 'm', 'v', 'u', 'p', 'q', 'r' };

    public static String convert(String input) {
        return convert(input, 0);
    }
    
    public static String convert(String sourceString, int shiftValue) {
        String input = "";
        for (char c : sourceString.toCharArray()) 
        input += (char) (c + shiftValue);
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                int j;
                for (j = i; input.charAt(j) != ')'; j++)
                    ;
                for (int k = j - 1; k > i; k--) {
                    if (input.charAt(k) == '$')
                        output += ' ';
                    else if (input.charAt(k) == '^')
                        continue;
                    else {
                        output += input.charAt(k) >= 'a' && input.charAt(k) <= 'z' ? dict[input.charAt(k) - 'a']
                                : input.charAt(k);
                        if (input.charAt(k - 1) == '^')
                            output = output.substring(0, output.length() - 1)
                                    + (char) (output.charAt(output.length() - 1) - 'a' + 'A');
                    }
                }
                i = j;
            } else if (input.charAt(i) == '$')
                output += ' ';
            else if (input.charAt(i) == '^')
                continue;
            else {
                output += input.charAt(i) >= 'a' && input.charAt(i) <= 'z' ? dict[input.charAt(i) - 'a']
                        : input.charAt(i);
                if (i > 0 && input.charAt(i - 1) == '^')
                    output = output.substring(0, output.length() - 1)
                            + (char) (dict[input.charAt(i) - 'a'] - 'a' + 'A');
            }
        }

        return output;
    }
}
