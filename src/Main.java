//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("#1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + "; ");
        }

        System.out.println( "\n" + "#2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "; ");
        }

        System.out.println( "\n" + "#3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + "; ");
        }
        System.out.println( "\n" + "#4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + "; ");
        }
        System.out.println( "\n" + "#5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.print(i + " год является високосным;  ");
        }
        System.out.println( "\n" + "#6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + "; ");
        }
        System.out.println( "\n" + "#7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + "; ");
        }


        System.out.println( "\n" + "#8");
        int salary8 = 29000;
        int total8 = 0;
        for (int i = 1; i < 13; i++) {
            total8 = total8 + salary8;
            System.out.print("Месяц " + i + ", сумма накоплений равна " + total8 + " рублей;  ");
        }

        System.out.println( "\n" + "#9");
        int salary9 = 29000;
        int total9 = 0;
        for (int i = 1; i < 13; i++) {
            total9 = total9 + total9/100;
            total9 = total9 + salary9;
            System.out.print("Месяц " + i + ", сумма накоплений равна " + total9 + " рублей;  ");
        }

        System.out.println( "\n" + "#10");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print("2 * " +i + " = " + i * 2 + ";  ");
        }
    }
}