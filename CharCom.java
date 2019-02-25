import java.util.Scanner;

public class CharCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        double a = Double.parseDouble(scanner.nextLine());//dni kampaniq
        double b = Double.parseDouble(scanner.nextLine()); //sladkari broi
        double c = Double.parseDouble(scanner.nextLine()); //torti broi
        double d = Double.parseDouble(scanner.nextLine()); //gofreti broi
        double f = Double.parseDouble(scanner.nextLine()); //palachinki broi

        //cena na torta - 45
        //cena na gofreta - 5.80
        //cena na palachinka - 3.20

        double c1 = c * 45;
        double d1 = d * 5.80;
        double f1 = f * 3.20;
        double den = (c1 + d1 + f1) * b;
        double kampaniq = den * a;
        double total1 = kampaniq * 0.125;
        double total = kampaniq - total1;


        System.out.printf("%.2f", total);
        //System.out.println(den);


    }
}