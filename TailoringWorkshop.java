import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double widht = Double.parseDouble(scanner.nextLine());

        double tableCloth = tables *(lenght + 2 * 0.3) * (widht + 2 * 0.3);
        double cowerArea = tables * (lenght/ 2 ) * (lenght/2);

        double USDprice = (tableCloth *7) +(cowerArea * 9);
        double BGNprice = USDprice * 1.85;

        System.out.printf("%.2f USD%n",USDprice);
        System.out.printf("%.2f BGN",BGNprice);


    }
}
