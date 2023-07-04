public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        char[] sChar = s.toCharArray();
        if (palindromCheck(sChar)) {
            System.out.println("палиндром");
        } else {
            System.out.println("нифига");
        }
    }

    public static boolean palindromCheck(char[] sChar) {
        if (sChar.length % 2 == 0) {
            for (int i = 0; i < sChar.length / 2 - 1; i++) {
                if (sChar[i] != sChar[sChar.length - i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < (sChar.length - 1) / 2 - 1; i++) {
                if (sChar[i] != sChar[sChar.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

