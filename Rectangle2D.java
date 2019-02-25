import java.util.Scanner;

public class Rectangle2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double a = Math.max(x1,x2) - Math.min(x1,x2);
        double b = Math.max(y1,y2) - Math.min(y1,y2);

        double area =( a * b );
        double perymeter =( a + b )*2;
        System.out.println(area);
        System.out.println(perymeter);


    }
}
