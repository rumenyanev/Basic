import java.util.Scanner;

public class AreaTrapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = Double.parseDouble(scanner.nextLine());
        double b1 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double result = (b+b1)*h/2;
        System.out.println(result);
    }
}
