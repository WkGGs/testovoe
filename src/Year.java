public class Year {
    int year;

    public void setYear(int number) {
        if ((number < 2002) || (number >= 2021)) {
            System.out.println("неверное значение года");
        } else {
            year = number;
        }
    }

    public int getYear() {
        return year;
    }
}
