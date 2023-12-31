/**
 * Вспомогательный класс с данными, на основе которых нужно производить расчет
 * Данные могут отличаться от реальных (эксраполированы или округлены)
 */
public class Constants {

    //Индекс мос биржи с 2002 по 2022 сверху вниз
    public static final double[] MOEX_RATE = {// от 0 до 20
            417.42, //2002
            673.72,//2003
            722.81,//4
            1323.32,//5
            2216.63,
            2472.38,
            810.922,
            1793.24,
            2209.46,
            1835.14,
            1934.43,
            1967.83,
            1828.06,
            2305.50,
            3042.00,
            3015.71,
            3564.05,
            4887.25,
            5567.28,
            6731.43,
            4170.35
    };
    //Инфляция с 2002 по 2022 сверху вниз
    public static final double[] INFLATION_RATE = {
            15.06,
            11.99,
            11.74,
            10.91,
            9.00,
            11.87,
            13.28,
            8.80,
            8.78,
            6.10,
            6.58,
            6.45,
            11.36,
            12.91,
            5.38,
            2.52,
            4.27,
            03.05,
            4.91,
            8.39,
            11.92,
    };

}
