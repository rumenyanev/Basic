import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        //1usd = 1.79549
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        double bgn = usd*1.79549;
        System.out.printf("%.2f BGN",bgn);

    }
}
