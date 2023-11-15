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
        fireYTN.setYTN(str);
        //System.out.println(fireYTN.getYTN());
        Calculator FireCalculator = new Calculator();
        double percent = 0.5;
        for(double i = percent; i < 25.0; i += 0.5){
            FireCalculator.setPercent(i);
            if(FireCalculator.fireCalculator(fireYTN.getYTN())){
                continue;
            }
            else {
                System.out.println(i - 0.5);
                break;
            }
        }
    }
}