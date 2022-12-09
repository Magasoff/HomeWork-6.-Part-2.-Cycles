public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int deposit = 15_000;
        int gol = 2_459_000;
        int month = 1;
        double percent = 0.12;
        int total = 0;
        while (total < gol) {
            if (month % 12 == 0) {
                total += total * percent;
            }
            total += deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        System.out.print("Задание 2");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + ",");
        }
        int c = 10;
        while (c > 0) {
            System.out.print(c + ",");
            c--;
        }
        System.out.println("Задание 3");
        int y = 12_000_000;
        int born = 17;
        int death = 8;
        int people = born - death;
        for (int year = 1; year <= 10; year++) {
            y += y * people / 1000;
            System.out.println(" За " + year + " лет, население стало " + y + " человек ");
        }
        System.out.println("Задание 4");
        int friday = 3; // пятница 3е число месяца
        int f = 31;      // число дней в месяце
        for (int p = friday; p < f; p = p + 7) {
            friday = friday + 7;
            System.out.println("Сегодня пятница, " + p + " -е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задание 5");
        int goal = 12_000_000;
        int countMonth = 0;
        double onePercent = 0.07;
        int saving = 15000;
        for (; saving < goal; countMonth++) {
            saving += saving * onePercent;
            if (countMonth % 6 == 0) {
                System.out.println("За " + countMonth + " месяцев накопил " + saving + " рублей ");
            }
            System.out.println("Задание 6");
            int oneFirstGoal = 12_000_000;
            int oneCountMonth = 1;
            double doubleOnePercent = 0.07;
            int firstSaving = 15000;
            for (; oneCountMonth <= 9 * 12; countMonth++) {
                firstSaving += firstSaving * doubleOnePercent;
                if (oneCountMonth % 6 == 0) {
                    System.out.println("За " + oneCountMonth + " месяцев накопил " + firstSaving + " рублей ");
                }
                System.out.println(" Задание 7");
                int firstYear = 0;
                int year = 0;
                int nowYear = 2022;
                int startYear = nowYear - 200;
                int finishYear = nowYear + 100;
                int period = 79;
                while (year < finishYear) {
                    if (year > startYear) {
                        System.out.println(year);
                    }
                    year += period;
                }
            }
            int n = 2;
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
    }
}













