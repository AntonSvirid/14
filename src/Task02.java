// вывод таблицы пифагора
public class Task02 {
    public static void main(String[] args) {

        for (int count = 1; count < 10; count++) {
            int n = 10;
            for (int d = 1; d < n; d++) {
                System.out.print(d * count + "\t");
            }
            System.out.println();
        }
    }
}
