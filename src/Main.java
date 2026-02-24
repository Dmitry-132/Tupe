//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static double operSystem;

    // #1
public static int calculateLeapYear(int leapYear){
    if (leapYear < 1584) {
        System.out.println(leapYear + " год не является високосным, т.к. в те времена данное понятие ещё не было открыто");
    } else if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
        System.out.println(leapYear + " год — високосный год");
    } else {
        System.out.println(leapYear + " год — невисокосный год");
    }
    return leapYear;
}
//#2
public static int definingVersion(int operSystem,int deviceYear ){
    if (deviceYear < 2015 && operSystem == 0) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (deviceYear < 2015 && operSystem == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (deviceYear >= 2015 && operSystem == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (deviceYear >= 2015 && operSystem == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Операционная система неопознанна");
    }

    return operSystem;
}
//#3
public static int determiningDeliveryDistance(int distance) {
    if (distance <= 20) {
        byte timesDelivery = 1;
        System.out.println("Потребуется дней " + timesDelivery);
    } else if (distance <= 60) {
        byte timesDelivery = 2;
        System.out.println("Потребуется дней " + timesDelivery);
    } else if (distance <= 100) {
        byte timesDelivery = 3;
        System.out.println("Потребуется дней " + timesDelivery);
    } else {
        System.out.println("Доставки нет");
    }
    return distance;
}
    public static void main(String[] args) {

        System.out.println("#1");
        int year = 2000;
        calculateLeapYear(year);

        System.out.println("#2");
        byte clientOS = 0;
        short clientDeviceYear = 2025;
        definingVersion(clientOS,clientDeviceYear);

        System.out.println("#3");
        short deliveryDistance = 95;
        determiningDeliveryDistance(deliveryDistance);

    }
}