import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       double tshirt = Double.parseDouble(scan.nextLine());
       double sumToWin = Double.parseDouble(scan.nextLine());

       double shorts = tshirt * 0.75;
       double socks = shorts * 0.2;
       double boots = (tshirt + shorts) * 2;
       double totalPrice =( tshirt + socks + shorts + boots);

        totalPrice =totalPrice-(totalPrice * 0.15);
       double missingAmout = sumToWin - totalPrice;

        if (totalPrice >= sumToWin) {
           System.out.println("Yes, he will earn the world-cup replica ball!");
           System.out.printf("His sum is %.2f lv.", totalPrice);
      } else {
           System.out.println("No, he will not earn the world-cup replica ball.");
           System.out.printf("He needs %.2f lv. more.",missingAmout);
       }
    }
   }
