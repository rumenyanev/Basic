import java.util.Scanner;

public class TripToWorldCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceGo = Double.parseDouble(scan.nextLine());
        double priceReturn = Double.parseDouble(scan.nextLine());
        double priceTicket = Double.parseDouble(scan.nextLine());
        double matches = Double.parseDouble(scan.nextLine());
        double priceProcent = Double.parseDouble(scan.nextLine());

        double flyTicket = 6 * (priceGo + priceReturn);
        double reducetFlyTicket = (flyTicket - (flyTicket *( priceProcent/100)));
        double totalPriceTicketMaches = 6 * matches * priceTicket;
        double totalSumToPay = reducetFlyTicket + totalPriceTicketMaches;
        double payEvryOne = totalSumToPay / 6;


        System.out.printf("Total sum: %.2f lv.\n",totalSumToPay);
        System.out.printf("Each friend has to pay %.2f lv.",payEvryOne);



    }
}
