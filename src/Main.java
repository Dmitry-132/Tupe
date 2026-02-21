//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("#1");
        String firstName = " Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = new String(firstName + " " + middleName + " " + lastName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("#2");
        String fullNameCaps = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameCaps);

        System.out.println("#3");
        fullName = new String("Иванов Семён Семёнович");
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}