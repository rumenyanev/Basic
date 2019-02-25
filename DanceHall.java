import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = Double.parseDouble(scanner.nextLine());//дължина на залата
        double w = Double.parseDouble(scanner.nextLine());//ширина на залата
        double a = Double.parseDouble(scanner.nextLine());//страна на гардероба в метри

        double areaHall = (l * 100) *(w * 100);//площ зала
        double areaC = (a * 100) * (a * 100); //площ гардероб
        double areaD =( areaHall/10);//площ пейка
        double freeArea = areaHall - areaC - areaD;//свободно простронство
        int dansers =(int) (freeArea/(40+ 7000));//брой танциори

        System.out.println(dansers);





    }
}
