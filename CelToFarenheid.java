import java.util.Scanner;

public class CelToFarenheid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C = Double.parseDouble(scan.nextLine());
        double F = C * 1.8 + 32;
        System.out.printf("%.2f",F);
    }
}
