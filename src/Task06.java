// PythagorasTable

public class Task06 {

    public static String getPythagorasTable(int dimension) {
        StringBuilder msg = new StringBuilder();    // применять в случае формирования более 3 строк!!!

        for (int j = 1; j <= dimension; j++) {
            for (int i = 1; i <= dimension; i++) {
                msg.append(i * j).append("\t");
            }
            msg.append("\n");
        }
        return msg + "";  // преобразование стрингБилдера в строку (для вывода)
    }

    public static void main(String[] args) {
        int dimension = Task02.inputPositivNumber();

        String result = getPythagorasTable(dimension);

        System.out.println(result);
    }
}