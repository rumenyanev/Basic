import java.util.Scanner;

public class CurrenciConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        // 1bgN = * 1.79549 usD   ; 1.95583 euR  ; 2.53405 gbP;


        if (input.equals("USD")) {
            sum = sum * 1.79549;
        } else if (input.equals("EUR")) {
            sum = sum * 1.95583;
        } else if (input.equals("GBP")) {
            sum = sum * 2.53405;
        }
        if (output.equals("USD")) {
            sum = sum / 1.79549;
        } else if (output.equals("EUR")) {
            sum = sum / 1.95583;
        } else if (output.equals("GBP")) {
            sum = sum / 2.53405;
        }
        System.out.printf("%.2f %s", sum, output);


    }
}
