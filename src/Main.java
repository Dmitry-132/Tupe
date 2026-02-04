//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("№1");
        byte age1 = 19;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("№2");
        byte temperature = -14;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else  {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("№3");
        short speed = 105;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("№4");
        byte age4 = 15;
        if (age4 >= 2 && 4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то  ему нужно ходить в детский сад");
        }
        else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        }
        else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университете");
        }
        else if (age4 >= 25) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }

        System.out.println("№5");
        byte age5 = 41;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то  ему нельзя кататься на аттракционе");
        }
        else if (age5 >= 5 && age5 <= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (age5 > 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("№6");
        byte totalPlaces = 102;
        byte seatingPlaces = 60;
        byte standingPlaces = (byte) (totalPlaces - seatingPlaces);
        byte nowSeatingPlaces = 60;
        byte nowStandingPlaces = 14;
        byte nowTotalPlaces = (byte) (nowSeatingPlaces + nowStandingPlaces);
        byte freeSeatingPlaces = (byte) (seatingPlaces - nowSeatingPlaces);
        byte freeStandingPlaces = (byte) (standingPlaces - nowStandingPlaces);
        if (nowTotalPlaces >= totalPlaces) {
            System.out.println("Мест нет");
        }
        else if (nowSeatingPlaces < seatingPlaces || nowStandingPlaces < standingPlaces) {
            System.out.println("Свободно " + freeSeatingPlaces + " сидячих мест и " + freeStandingPlaces + " стоячих мест");
        }

        System.out.println("№7");
        int one = 1;
        int two = 1;
        int three = 1;
        if (one > two && one > three) {
            System.out.println("Большее число one ");
        }
        else  if (two > one && two > three) {
            System.out.println("Большее число two ");
        }
        else  if (three> one && three > two) {
            System.out.println("Большее число three");
        }
        else {
            System.out.println("Два или более чисел равны");
        }
    }
}