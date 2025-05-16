public class DecimalToBinary {
    public static String DecimaltoBinary(int decimal, String result) {
        if (decimal == 0) {
            return result;
        }
        result = decimal % 2 + result;
        return DecimaltoBinary(decimal / 2, result);
    }

    public static void main(String[] args) {
        String Binary = DecimaltoBinary(5, "");
        System.out.println(Binary);
    }
}