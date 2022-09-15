// определение числа чётные или нечетные

public class Task08 {
    public static boolean cherEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    public static boolean cherOddNumbers(int a, int b, int c) {
        return a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
    }

    public static void main(String[] args) {
        int a = Task02.inputPositivNumber();
        int b = Task02.inputPositivNumber();
        int c = Task02.inputPositivNumber();

        boolean result = cherEvenNumbers(a, b, c);

        String msg = result ? "Yes, all numbers are even." : "No, some numbers are not even";

        System.out.println(msg);

        result = cherOddNumbers(a, b, c);

        msg = result ? "Yes, all numbers are odd." : "No, some numbers are not odd";

        System.out.println(msg);
    }
}
