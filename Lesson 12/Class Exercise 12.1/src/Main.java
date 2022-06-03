public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Maia", "02/05/1996");
        System.out.println(employee.birthDate);
        Employee regularEmployee = new RegularEmployee("Maia", "02/05/1996", 9500L, "02.12.2020");
        System.out.println(regularEmployee.name);
        Employee contractEmployee = new ContractEmployee("Maia", "02/05/1996", 8L, "nedeterminat");
        System.out.println(contractEmployee.name);
    }
}
