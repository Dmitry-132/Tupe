public class Employee {

    private static int idApp;
    private int id;
    private String name;
    private String lastName;
    private String patronymic;
    private int salary;
    private int department;

    public Employee(String name, String lastName, String patronymic, int salary, int department) {

        this.id = idApp++;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("id " + this.id + " Зарплата не может иметь отрицательное значение");
        }
        if (department > 0 && department < 6) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("id " + this.id + " некорректный идентификатор отдела");
        }
    }

    public String toString() {
//        return "id = " + id + ", name = " + name + ", lastName = " + lastName + ", patronymic = " + patronymic + ", salary = " + salary + ", dapartament = " + department;
        return String.format("id = %d, name = %s, lastName = %s, patronymic = %s, salary = %d, dapartament = %d", id, name, lastName, patronymic, salary, department);
    }

    public void printShortInfo() {
        System.out.println("Сотрудник " + name + ", з.п. " + salary + "руб.");
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Зарплата не может иметь отрицательное значение");
        }
    }

    public void setDepartment(int department) {
        if (department > 0 && department < 6) {
            this.department = department;
        } else {
            System.out.println("некорректный идентификатор отдела");
        }
    }


}
