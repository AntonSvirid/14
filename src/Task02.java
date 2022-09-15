import java.util.Scanner;

// вывод положительных чисел
public class Task02 {

    public static int inputPositivNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Input positive number ");
            number = scanner.nextInt();
            if (number > 0) {
                break;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int number = inputPositivNumber();

        System.out.println(number);
    }
}


//        for (int count = 1; count < 10; count++) {
//        int n = 10;
//        for (int d = 1; d < n; d++) {
//        System.out.print(d * count + "\t");
//        }
//        System.out.println();