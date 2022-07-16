public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jora", 20456.20),
                new Employee("Gordon", 43550.45),
                new Employee("Roger", 13023.69)
        };
        double average = average(employees);
        System.out.printf("Average employee salary is %.2f USD", average);
    }

    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }
}
