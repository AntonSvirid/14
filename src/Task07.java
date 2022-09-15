// определение числа как палиндлром (123321) или нет

public class Task07 {

    public static boolean checkPalindrome(int number) {

        // защита от дурака
        if (number <= 0) {
            return false;
        }

        int copy = number;
        int num = 0;

        while (copy > 9) {          //т к не знаем количество операций  - while
            num += copy % 10;
            num *= 10;
            copy /= 10;
        }

        num += copy;

        return num == number;
    }


    public static void main(String[] args) {
        int number = Task02.inputPositivNumber();

        boolean result = checkPalindrome(number);

        String msg = result ? "Yes, number is palindrome"
                : "No, number is not palindrome";

        System.out.println(msg);
    }
}
