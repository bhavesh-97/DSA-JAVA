public class SumNaturalNumber {
    public static int SumofNaturalNumber(int number) {
        if (number <= 1) {
            return number;
        }
        return number + SumofNaturalNumber(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(SumofNaturalNumber(5));
    }
}
