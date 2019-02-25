import java.util.Scanner;

public class NeighborhoodShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine().toLowerCase();
        String syti = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());


        if (product.equals("coffee")) {
            if (syti.equals("Sofia")) {
                System.out.println(0.50 * quantity);
            } else if (syti.equals("Plovdiv")) {
                System.out.println(0.40 * quantity);

            } else {
                System.out.println(0.45 * quantity);
            }
        } if (product.equals("water")) {

            if (syti.equals("Sofia")) {
                System.out.println(0.80 * quantity);
            } else if (syti.equals("Plovdiv")) {
                System.out.println(0.70 * quantity);
            } else {
                System.out.println(0.70 * quantity);
            }
        } if ("beer".equals(product)) {
            if ("Sofia".equals(syti)) {
                System.out.println(1.20 * quantity);
            } else if ("Plovdiv".equals(syti)) {
                System.out.println(1.15 * quantity);
            } else {
                System.out.println(1.10 * quantity);
            }
        }  if ("sweets".equals(product)) {
            if ("Sofia".equals(syti)) {
                System.out.println(1.45 * quantity);
            } else if ("Plovdiv".equals(syti)) {
                System.out.println(1.35 * quantity);
            } else {
                System.out.println(1.30 * quantity);
            }
        }  if ("peanuts".equals(product)) {
                            if ("Sofia".equals(syti)) {
                                System.out.println(1.60 * quantity);
                            }  if ("Plovdiv".equals(syti)) {
                                System.out.print(1.50* quantity);
                            } else {
                                System.out.println(1.55 * quantity);
                            }
                        }
                    }
                }
