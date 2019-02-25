import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int sector = Integer.parseInt(scanner.nextLine());
            int capacity = Integer.parseInt(scanner.nextLine());
            double price = Double.parseDouble(scanner.nextLine());


           double prsector = (capacity * price) / sector;
           double totalprice = prsector * sector;
            double charity =( totalprice - (prsector * 0.75)) / 8;

            System.out.printf("Total income - %.2f BGN\n", totalprice);
            System.out.printf("Money for charity - %.2f BGN", charity);

        }

    }

