//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("№1; #2");
        byte clientOS = 0;
        short clientDeviceYear = 2007;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Операционная система неопознанна");
            }
        }
        else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Операционная система неопознанна");
            }
        }

        System.out.println("№3");
        int year =2100;
       if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
           System.out.println(year + " год является високосным");
       }
       else  {
           System.out.println(year + " год не является високосным");
       }

        System.out.println("№4");
       short deliveryDistance = 95;
       if (deliveryDistance <= 20) {
           byte timesDelivery = 1;
           System.out.println("Потребуется дней " + timesDelivery);
       }
       else if (deliveryDistance <= 60) {
           byte timesDelivery = 2;
           System.out.println("Потребуется дней " + timesDelivery);
       }
       else if (deliveryDistance <= 100) {
           byte timesDelivery = 3;
           System.out.println("Потребуется дней " + timesDelivery);
       }
       else {
           System.out.println("Доставки нет");
       }

        System.out.println("№5");
       byte monthNumber = 12;
        switch (monthNumber) {
            case 1: case 2: case 3:
                System.out.println("Весна");
                break;
            case 4: case 5: case 6:
                System.out.println("Лето");
                break;
            case 7: case 8: case 9:
                System.out.println("Осень");
                break;
            case 10: case 11: case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }








    }
}