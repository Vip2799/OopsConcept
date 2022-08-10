public class EmployeeIMPL {
    public static void main(String[] args) {
        Employee daniel = new Employee("Daniel", 130, 32,
                "12/12/1990", "124,bridge water,eville", 3000);

        double annualSalary = daniel.annualSalary();
        System.out.println("Annual Salary = " + annualSalary);
        System.out.println("Monthly salary before pay rise = " + daniel.salary);
        daniel.salary = daniel.payRise(20);
        System.out.println("Monthly salary after pay rise = " + daniel.salary);


    }
}
