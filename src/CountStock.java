public class CountStock {
    double yearly;
    double maxWithdrowal = 0;
    double totalSum = 0;
    public void setCountMoney(int j, double mounthly){
        for(int i = j; i < 21; i++){
            yearly = mounthly * 12 / Constants.MOEX_RATE[i];
            if(maxWithdrowal < yearly){
                maxWithdrowal = Math.ceil(yearly);
            }
            mounthly = mounthly * (100+Constants.INFLATION_RATE[i])/100; //поправка на инфляцию
            totalSum += yearly;
        }
        System.out.println(maxWithdrowal); //максимальное разовое снятие
        System.out.println(totalSum); //общее число снятых денях
        System.out.println(totalSum/maxWithdrowal); //максимальный процент снятия
        }
}
