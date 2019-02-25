import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String firstName = scaner.nextLine();
        String lastName = scaner.nextLine();
        int age = Integer.parseInt(scaner.nextLine());
        String city = scaner.nextLine();
        System.out.println("You are " +firstName+" "+lastName+", a "+age+"-years old person from "+city+ ".");
    }
}
