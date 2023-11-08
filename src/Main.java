import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mounthly = 150000.00; //ежемесячный расход
        System.out.println("Введите желаемый год выход на FIRE-пенсию");
        Scanner scan = new Scanner(System.in);
        int str = (scan.nextInt());
        Year fireYear = new Year();
        fireYear.setYear(str);
        YTN fireYTN = new YTN();
        int i = fireYTN.giveYTN(fireYear.getYear());
        CountStock fireCM = new CountStock();
        fireCM.setCountMoney(i, mounthly);
    }
}