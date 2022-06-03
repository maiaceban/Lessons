public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Maia", "02/05/1996");
        System.out.println("Name: " + employee.name);
        RegularEmployee re = new RegularEmployee("Maia", "02/05/1996", 9500L, "02.12.2020");
        System.out.println("The salary is: " + re.salary);
        ContractEmployee ce = new ContractEmployee("Maia", "02/05/1996", 350L, "nedeterminat");
        System.out.println("Pay Per Hours: " + ce.payPerHour);
    }
}
