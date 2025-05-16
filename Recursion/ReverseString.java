class ReverseString {
    public static String RevStr(String input) {
        if (input == "") {
            return "";
        }
        return RevStr(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(RevStr("Bhavesh"));
    }
}