//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("#1");

        int firstFriday = 6;
        for (int i = 1, m = 1; i <= 31 && m < 12; i++) {
            if (i % firstFriday == 0) {
                System.out.println("Сегодня пятница," + i + "е число. Необходимо подготовить отчет");
                firstFriday = firstFriday + 7;
            }
        }

        System.out.println("#2");
        byte version = 1; // для 2 и 3 задач
        if (version == 1) {
            int way = 42195;
            int doWay = 500;
            int passedWay = 0;
            do {
                passedWay = passedWay + doWay;
                if (passedWay <= way) {
                    System.out.println("Держитесь! Осталось " + (way - passedWay) + " метров");
                } else {
                    System.out.println("Твой путь завершен");
                }
            }
            while (passedWay < way);
        }
        if (version == 1) {
            int way = 42195;
            int doWay = 500;
            int passedWay = 0;
            for (; passedWay <= way; passedWay = passedWay + doWay) {

                System.out.println("Держитесь! Осталось " + (way - passedWay) + " метров");
            }
            System.out.println("Твой путь завершен");
        }
        System.out.println("#3");
        if (version == 1) {
            int many = 50050;
            int price = 100;
            int spentMany = many;
            int day = 0;
            int freeDay = 0;
            while (spentMany >= price) {
                day = day + 1;
                spentMany = spentMany - price;
                if (day % 5 != 0) {
                    continue;
                }
                freeDay = freeDay + 1;
            }
            System.out.println(many + " рублей хватит на " + (day + freeDay) + " дней, из них " + freeDay + " дней бесплатны. На счету останется " + spentMany + " рублей");
        }
        if (version == 2) {
            int many = 50050;
            int price = 100;
            int spentMany = many;
            int day = 0;
            int freeDay = 0;
            for (; spentMany >= price; spentMany = spentMany - price) {
                if (day % 5 != 0 && day > 0) {
                    day = day + 1;
                    continue;
                }
                freeDay = freeDay + 1;
                day = day + 1;
            }

            System.out.println(many + " рублей хватит на " + (day + freeDay) + " дней, из них " + freeDay + " дней бесплатны. На счету останется " + spentMany + " рублей");
        }

        System.out.println("#4");
        int month = 0;
        int total = 0;
        int income = 15000;
        byte percent = 7;
        int purpose = 12000000;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total + (total * percent / 100);
            }
            total = total + income;
            System.out.println(month + " месяц, накоплено " + total);
            if (total >= purpose) {
                break;
            }
        }

        System.out.println("№5");
        byte charge = 0;
        short minute = 0;
        byte overheats = 0;
        while (charge < 100 && overheats <= 3) {
            System.out.println(minute + " minute | заряд " + charge);
            minute++;
            if ((minute - overheats) % 10 == 0) {
                overheats++;
                minute++;
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + " %");
                    minute = (short) (minute - 2);
                    break;
                }
                System.out.println("перегрев");
                continue;
            }
            charge = (byte) (charge + 2);
        }
        System.out.println("Зарядка заняла " + minute + " минут");
    }
}