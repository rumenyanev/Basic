import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = a*h/2;
      //  double result =
        System.out.printf("Triangle area = " + " %.2f",area);
    }
}
