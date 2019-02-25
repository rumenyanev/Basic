import java.util.Scanner;

public class InchesToSentimetres {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double inches = Double.parseDouble(console.nextLine());
         double result = inches * 2.54;
        System.out.println(result);
    }
}
