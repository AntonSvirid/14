public class Task07 {
    // обьявление метода
    public static int sum(int a, int b) { // public - видимый
        // logik
        int result = a + b;
        return result; // остановить метод и вернуть значение во вне
    }

    public static void print(int result) {
        // output
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
        int result = sum(6, 7);
        print(result);
    }
}
