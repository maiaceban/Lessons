public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("unknown", 0, "unknown");
        Employee employee2 = new Employee("Jora", 45, "unknown");
        Employee employee3 = new Employee("Gordon", 45000, "2th Avenue Coco Jumbo");

        printEmployee(employee1);
        printEmployee(employee2);
        printEmployee(employee3);
    }

    public static void printEmployee(Employee employee) {
        System.out.println("Employee is:" + " " + employee.name + " \t" + "" + "The salary is: " + employee.salary +
                " " + "\t" + "" + "The address is: " + employee.address);
    }
}
