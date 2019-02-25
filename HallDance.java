

        import java.util.Scanner;

    public class HallDance {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double side = Double.parseDouble(scanner.nextLine());
            double hallArea = (length * 100) * (width * 100);
            double ikea = (side * 100) * (side * 100);
            double peika = hallArea / 10;
            double freeSpace = hallArea - ikea - peika;
            int dancers = (int) (freeSpace / (40 + 7000));
            System.out.println(dancers);
        }
}
