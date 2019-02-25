import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whisckyprice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double brendy = Double.parseDouble(scanner.nextLine());
        double whisckey = Double.parseDouble(scanner.nextLine());

        double brendyprice = whisckyprice/2;
        double wineprice = brendyprice * 0.6;
        double beerprice = brendyprice * 0.2;

        double beerSum = beer * beerprice;
        double wineSum = wine  * wineprice;
        double brendySum = brendy * brendyprice;
        double whiskeySum = whisckey * whisckyprice;

        double all = beerSum + whiskeySum + wineSum + brendySum;
        System.out.printf("%.2f",all);






    }
}
