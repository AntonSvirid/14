
// поиск максимальной цифры в числе
public class Task01 {
    public static void main(String[] args) {
        int number = 23545;

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
        System.out.println(max + " is max");
    }
}
