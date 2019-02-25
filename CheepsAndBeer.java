

        import java.util.Scanner;

public class CheepsAndBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfBeer = Integer.parseInt(scanner.nextLine());
        int numberOfChips = Integer.parseInt(scanner.nextLine());

        double priceForBeers = numberOfBeer * 1.2;
        double priceForChips = (priceForBeers  * 0.45)*numberOfChips;
        priceForChips = Math.ceil(priceForChips);

        double totalPrice = priceForBeers + priceForChips;

        if (budget > totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("%s bought a snack and has %.2f leva left.", nameFan, moneyLeft);
        } else {
            double needsLeva = (budget - totalPrice)*-1;
            System.out.printf("%s needs %.2f more leva!", nameFan, needsLeva);
        }
    }
}