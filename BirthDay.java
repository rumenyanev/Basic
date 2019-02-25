import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  length = Double.parseDouble(scanner.nextLine());
        double  width = Double.parseDouble(scanner.nextLine());
        double  height = Double.parseDouble(scanner.nextLine());
        double  percent = Double.parseDouble(scanner.nextLine());

        double voiume = length * width * height;
        double allLitres = voiume * 0.001;

        double per = percent * 0.01;
        double result = allLitres * (1-per);
        System.out.printf("%.3f",result);

    }
}
