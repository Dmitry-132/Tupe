//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("№1");
        byte oranges = 67;
        short apples = 569;
        int nuts = 27897;
        long potatoes = 789655456549L;
        float salt = 25.75346F;
        double sugar = 654.4654364645;
        System.out.println("Значение переменной oranges с типом  byte равно " + oranges);
        System.out.println("Значение переменной apples с типом short равно " + apples);
        System.out.println("Значение переменной nuts с типом int равно " + nuts);
        System.out.println("Значение переменной potatoes с типом long равно " + potatoes);
        System.out.println("Значение переменной salt с типом float равно " + salt);
        System.out.println("Значение переменной sugar с типом double равно " + sugar);

        System.out.println("№2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short i = -159;
        short e = 27897;
        byte g = 67;

        System.out.println("№3");
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short totalSheets = 480;
        int papersForPerson =  totalSheets /(classA + classB + classC);
        System.out.println("На каждого ученика рассчитано " + papersForPerson + " листов бумаги");

        System.out.println("№4");
        byte bottlesInMinute = 16/2;
        int bottlesIn5Minutes = 5 * bottlesInMinute;
        System.out.println("За 5 минут машина произвела " + bottlesIn5Minutes + "штук бутылок");
        int bottlesInDay = bottlesInMinute * (24 * 60);
        System.out.println("За день машина произвела " + bottlesInDay + "штук бутылок");
        int bottlesIn3Days = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + "штук бутылок");
        int bottlesInMonth = bottlesInDay * 31;
        System.out.println("За месяц машина произвела " + bottlesInMonth + "штук бутылок");

        System.out.println("№5");
        byte totalNeedsPaint = 120;
        byte needsWhitePaint = 2;
        byte needsBrownPaint = 4;
        int totalClass = totalNeedsPaint / (needsWhitePaint + needsBrownPaint);
        int totalNeedsWhitePaint = totalClass * needsWhitePaint;
        int totalNeedsBrownPaint = totalClass * needsBrownPaint;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalNeedsWhitePaint + " банок белой краски и " + totalNeedsBrownPaint + " банок коричневой краски");

        System.out.println("№6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int massWeight = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        float massWeightInKg = massWeight * 0.01f;
        System.out.println("Итоговый вес завтрака по данному рецепту равен " + massWeight + " грамм или " + massWeightInKg + " килограмм");

        System.out.println("№7");
        short NeedDropMass = 7000;
        short canDropMass1 = 250;
        short canDropMass2 = 500;
        short needDaysForDrop1 = (short) (NeedDropMass / canDropMass1);
        short needDaysForDrop2 = (short) (NeedDropMass / canDropMass2);
        System.out.println("Если спортсмен будет тратить по " + canDropMass1 + " грамм в день, ему понадобится " + needDaysForDrop1 + " дней");
        System.out.println("Если спортсмен будет тратить по " + canDropMass2 + " грамм в день, ему понадобится " + needDaysForDrop2 + " дней");
        byte needDaysOnAverage = (byte) ((needDaysForDrop1 + needDaysForDrop2) / 2);
        System.out.println("В среднем понадобится " + needDaysOnAverage + " дней");

        System.out.println("№8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int newSalaryMasha = (int) (salaryMasha * 1.1);
        int newSalaryDenis = (int) (salaryDenis * 1.1);
        int newSalaryChristina = (int) (salaryChristina * 1.1);
        int upSalaryMashaPerYear = (newSalaryMasha - salaryMasha) * 12;
        int upSalaryDenisPerYear = (newSalaryDenis - salaryDenis) * 12;
        int upSalaryChristinaPerYear = (newSalaryChristina - salaryChristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + upSalaryMashaPerYear + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + upSalaryDenisPerYear + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на " + upSalaryChristinaPerYear + " рублей");
        }
    }
