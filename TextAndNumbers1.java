import java.util.Scanner;

public class TextAndNumbers1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String firstName = scaner.nextLine();
        String lastName = scaner.nextLine();
        int age = Integer.parseInt(scaner.nextLine());
        String city = scaner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",
                firstName,lastName,age,city);
    }
}

