package ru.netology.stats;

public class StatsService {
    public long minSales(long[] sales) {  // месяц с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public long maxSales(long[] sales) {  // месяц, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public long sumSales(long[] sales) { // сумма всех продаж

        long sumSales = 0;
        for (long sal : sales) {

            sumSales += sal;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {  // средняя сумма продаж в месяц

       long avarageSales = sumSales(sales) / sales.length;

        return avarageSales;
    }

    public long sumMonthsAverageMaxSales(long[] sales) {  // количество месяцев, в которых продажи были выше среднего

        int month = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {

                month++;
            }
        }
        return month;
    }

    public long sumMonthsAverageMinSales(long[] sales) {  // количество месяцев, в которых продажи были ниже среднего

        int month = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {

                month++;
            }
        }
        return month;
    }
}
