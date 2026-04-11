public class EmployeeBook {
    Employee[] employeeBook = new Employee[10];
    public static String PROPORTIONAL = "PROPORTIONAL";
    public static String PROGRESSIVE = "PROGRESSIVE";

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void printAllEmployees() {
        System.out.println("\n" + " Список сотрудников:");
        for (Employee o_o : employeeBook) {
            if (o_o != null) {
                System.out.println(o_o.toString());
            }
        }
    }

    public void averageTotalSalary() {
        double totalSalary = 0;
        byte totalEmployees = 0;
        for (Employee testEmployee : employeeBook) {
            if (testEmployee != null) {
                totalSalary += testEmployee.getSalary();
                totalEmployees++;
            }
        }
        System.out.println();
        double averaid = totalSalary / totalEmployees;
        System.out.printf("средняя зарплата %d сотрудников составляет %.2f руб.%n%n", totalEmployees, averaid);
    }

    private double calculateTax(double salary, String taxType) {
        switch (taxType) {
            case "PROGRESSIVE":
                if (salary <= 150) {
                    return salary * 0.13;
                } else if (salary <= 350) {
                    return salary * 0.17;
                } else {
                    return salary * 0.21;
                }
            case "PROPORTIONAL":
                return salary * 0.13;
            default:
                System.out.print(taxType + " тип неопознан. Используется PROPORTIONAL: ");
                return salary * 0.13;
        }
    }

    public void totalTax(String taxType) {
        double totalTax = 0;
        System.out.println("Расчет налога с з.п. сотрудников по методу " + taxType);
        for (Employee testEmployee : employeeBook) {
            if (testEmployee != null) {
                double salary = testEmployee.getSalary();
                double tax = calculateTax(salary, taxType);
                totalTax += tax;
                System.out.printf("Сотрудник: %s %s | Зарплата: %.2f | Налог: %.2f%n",
                        testEmployee.getLastName(), testEmployee.getName(), salary, tax);
            }
        }
        System.out.printf("Общая сумма налогов: %.2f руб.%n%n", totalTax);
    }

    public void salaryIndexByDepartment(int department, double index) {
        System.out.println("Перерасчёт зарплат " + department + " отдела по индексу " + index);
        for (Employee testEmployeeo : employeeBook) {
            if (testEmployeeo == null) {
                continue;
            }
            if (testEmployeeo.getDepartment() == department) {
                double newIndex = testEmployeeo.getSalary() * (1 + index / 100);
                testEmployeeo.setSalary((int) newIndex);
                testEmployeeo.printShortInfo();
            }
        }
        System.out.println("");
    }

    public void increasedSalaryByDepartment(int departament, int minSalary) {
        System.out.println("Поиск сотрудника из " + departament + " отдела с з.п. выше " + minSalary);
        for (Employee testEmployee : employeeBook) {
            byte employeesNumber = 0;
            if (testEmployee == null) {
                System.out.println("По указанной з.п. сотрудников нет");
                break;
            }
            employeesNumber++;
            if (testEmployee.getDepartment() == departament && testEmployee.getSalary() > minSalary) {
                System.out.print("Сотрудник под  номером " + employeesNumber + ": ");
                testEmployee.printShortInfo();
                break;
            }
        }
        System.out.println("");
    }

    public void lessWages(int wage) {
        byte employeeNumber = 0;
        byte i = 0;
        while (i < 10) {
            Employee o = employeeBook[i];
            if (employeeBook[i] == null || i == 10) {
                System.out.println("всего найдено " + employeeNumber + " сотрудников с зарплатой ниже " + wage + "\n");
                break;
            } else if (o.getSalary() < wage) {
                o.printShortInfo();
                employeeNumber++;
            }
            i++;
        }
    }

    public boolean comparisonSalary(Employee employee) {
        System.out.println("Поиск сотрудников по зарплате, схожей с " + employee.getName() + " " + employee.getLastName());
        if (employee == null) {
            return false;
        }
        for (Employee testEmployees : employeeBook) {
            if (testEmployees != null && testEmployees.getSalary() == employee.getSalary() && testEmployees.getId() != employee.getId()) {
                System.out.print("id " + testEmployees.getId() + ": ");
                testEmployees.printShortInfo();
                System.out.println();
                return true;
            }
        }
        System.out.println("совпадений по зарплате с сотрудником " + employee.getName() + " " + employee.getLastName() + " не найдено\n");
        return false;
    }
}
