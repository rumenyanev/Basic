import java.util.Scanner;

public class greetingByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.next();

        if (gender.equals("f")) {
            if (age < 16) System.out.println("Miss");
            else System.out.println("Ms.");
        } else {
            if (age < 16) System.out.println("Master");
            else System.out.println("Mr.");
        }
    }
}
