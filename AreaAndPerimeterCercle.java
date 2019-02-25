import java.util.Scanner;

public class AreaAndPerimeterCercle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * radius *radius;
        double perimeter= 2 * Math.PI * radius;
        System.out.println(area);
        System.out.println(perimeter);
    }


    }

