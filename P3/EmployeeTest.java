public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 2500.0);
        Employee employee2 = new Employee("Jane", "Smith", 3000.0);

        System.out.println("Yearly salary of " + employee1.getFN() + " " + employee1.getLN() + ": $" + employee1.getYS());
        System.out.println("Yearly salary of " + employee2.getFN() + " " + employee2.getLN() + ": $" + employee2.getYS());

        employee1.giveRaise(10);
        employee2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println("Yearly salary of " + employee1.getFN() + " " + employee1.getLN() + ": $" + employee1.getYS());
        System.out.println("Yearly salary of " + employee2.getFN() + " " + employee2.getLN() + ": $" + employee2.getYS());
    }
}
