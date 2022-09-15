import java.util.Scanner;

// поиск максимальной цифры в числе
public class Task01 {

    public static int findMaxDigit(int number){
        // условная тернарная операция для вычисления модуля
        number = number < 0 ? -number : number;

        int max = number % 10;
        number /= 10;

        while (number != 0) {
            int digit = number % 10;

            // улучшение производительности
            // при достижении макс возможной  значения переменной
            if (digit == 9) {
                max = digit;
                break;
            }
            // вычисления/логика
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number ");
        int num = scanner.nextInt();

        int digit = findMaxDigit(num);

        System.out.println(digit + " is max");
    }
}
