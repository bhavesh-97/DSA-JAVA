public class Palindrome {
    public static boolean IsPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return IsPalindrome(input.substring(1, input.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome("Bhavesh"));
    }
}