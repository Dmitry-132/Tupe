//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        Employee e1 = new Employee("Vincent", "Vega", "Ильич", 55000, 2);
        Employee e2 = new Employee("Vadim", "Gorky", "Pavlovich", 60000, 5);
        Employee e3 = new Employee("Ilya", "Dobroperdov", "Nikolaevich", 75000, 3);
        Employee e4 = new Employee("Ivan", "Ivanov", "Ivanovich", 50000, 2);
        Employee e5 = new Employee("Daniil", "Krasnov", "Vasilyevich", 66000, 1);
        Employee e6 = new Employee("Nikita", "Smirnov", "Alexandrovich", 75000, 5);
        Employee e7 = new Employee("Vadim", "Kireev", "Dmitrievich", 52000, 3);
        book.addEmployee(e1);
        book.addEmployee(e2);
        book.addEmployee(e3);
        book.addEmployee(e4);
        book.addEmployee(e5);
        book.addEmployee(e6);
        book.addEmployee(e7);

        System.out.println(e1);
        e1.printShortInfo();
        book.printAllEmployees();
        book.averageTotalSalary();
        book.totalTax("PROGRESSIVE");
        book.salaryIndexByDepartment(2, 13);
        book.increasedSalaryByDepartment(3, 40000);
        book.lessWages(70000);
        book.comparisonSalary(e3);
    }
}