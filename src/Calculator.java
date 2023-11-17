public class Calculator {
    double percent;
    boolean enough;
    double summ;
    double yearly = 150000 * 12;//сколько мы тратим за год без учета инфляции

    public void setPercent(double x) {
        percent = x;
    }

    public boolean fireCalculator(int x) {
        summ = yearly * 100 / percent;
        for (int i = x; i < 20; i++) {
            double kmoex = Constants.MOEX_RATE[i + 1] / Constants.MOEX_RATE[i];
            if (summ <= 0) {
                break;
            } else {
                if (summ * percent / 100 < yearly) {
                    summ = (summ - yearly) * (kmoex - Constants.INFLATION_RATE[i] / 100); // Если траты больше, то берем не процент, но, по идее
                } else {
                    summ = (summ - summ * percent / 100) * (kmoex - Constants.INFLATION_RATE[i] / 100);
                }
            }

        }
        if (summ > 0) {
            enough = true;
        } else {
            enough = false;
        }
        return enough;
    }
}
