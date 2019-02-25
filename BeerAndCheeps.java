 import java.util.Scanner;

 public class BeerAndCheeps {
 public static void main(String[]args){

         Scanner scan = new Scanner(System.in);


           String name = scan.nextLine();
           double money   = Double.parseDouble(scan.nextLine());
           int beer = Integer.parseInt(scan.nextLine());//broi biri
           int cheeps = Integer.parseInt(scan.nextLine());// broi paketi chips

           double totalPriceBeer = beer * 1.2;
           double packageCheeps = totalPriceBeer * 0.45;
           double totalCheeps = (packageCheeps * cheeps);


           double realPriceChips= Math.ceil (totalCheeps);
           double totalSum = totalPriceBeer + realPriceChips;

           double rest = (money - totalSum);
           double needMoney = (rest * -1);

           if (totalSum <= money) {
               System.out.printf("%s bought a snack and has %.2f leva left.",name, rest);
           } else if (totalSum >= money) {

               System.out.printf("%s needs %.2f more leva!",name,needMoney);}
      }
     }


















