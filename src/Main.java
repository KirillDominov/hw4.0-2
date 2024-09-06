public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int accumulation = 15000;
        int deposit = 0;
        int i = 0;
        while (deposit <= 2459000) {
            deposit = deposit + accumulation;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();
        System.out.println("Задача №2");
        int start = 0;
        while (start < 10) {
            start++;
            System.out.print(" " + start);
        }
        System.out.println();
        for (; start > 0; start = start - 1) {
            System.out.print(" " + start);
        }
        System.out.println();
        System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int q = 1; q <= 10; q++) {
            population = population + population * 17 / 1000 - mortality * 8 / 1000;
            System.out.println("Год " + q + ", численность населения составляет" + population);
        }
        System.out.println();
        System.out.println("Задача №4");
        int salary = 15000;
        int total = 0;
        int w = 1;
        for (; total < 12_000_000; w++) {
            total = total + total * 7 / 100;
            total = total + salary;
            {
                System.out.println("Месяц " + w + " Итого " + total);
            }
        }
        System.out.println(total);
        System.out.println();
        System.out.println("Задача №5");
        int salar = 15000;
        int totaly = 0;
        int e = 1;
        for (; totaly < 12_000_000; e++) {
            totaly = totaly + totaly * 7 / 100;
            totaly = totaly + salar;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + " Итого " + totaly);
            }
        }
        System.out.println(totaly);
        System.out.println();
        System.out.println("Задача №6");
        int sal = 15000;
        int sum = 0;
        int r = 1;
        for (; r < 109; r++) {
            sum = sum + sum * 7 / 100;
            sum = sum + sal;
            if (r % 6 == 0) {
                System.out.println("Месяц " + r + " Итого " + sum);
            }
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("Задача №7");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Cегодня пятница " + friday + "е число. Нужно подготовить отчёт");
            friday = friday + 7;
        }
        System.out.println();
        System.out.println("Задача №8");
        int year = 2024;
        int cometa = 79;
        int yearOfComing = 0;

        while (yearOfComing <= year + 100 - cometa) {
            yearOfComing = yearOfComing + cometa;

            if (year - 200 < yearOfComing) {
                System.out.println(yearOfComing);
            }

        }
    }
}