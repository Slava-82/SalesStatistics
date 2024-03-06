package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {  // месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int maxSales(int[] sales) {  // месяц, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int sumSales(int[] sales) { // сумма всех продаж

        int sumSales = 0;
        for (int sal : sales) {
            if (sal > 0) {

                sumSales += sal;
            }
        }
        return sumSales;
    }

    public int averageSales(int[] sales) {  // средняя сумма продаж в месяц

        int avarageSales = sumSales(sales) / sales.length;

        return avarageSales;
    }

    public int sumMonthsAverageMaxSales(int[] sales) {  // количество месяцев, в которых продажи были выше среднего

        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {

                month++;
            }
        }
        return month;
    }

    public int sumMonthsAverageMinSales(int[] sales) {  // количество месяцев, в которых продажи были ниже среднего

        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {

                month++;
            }
        }
        return month;
    }
}
