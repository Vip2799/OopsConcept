public class Employee {

    String employeeName;
    int employeeCode;
    int employeeAge;
    String dob;
    String address;
    double salary;

    Employee(String employeeName, int employeeCode, int employeeAge, String dob, String address, double salary) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.employeeAge = employeeAge;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
    }

    public double annualSalary() {
        return salary * 12;
    }

    //    public double payRise(double hikePercentage){
//        salary = salary +(salary * hikePercentage/100);
//    return  salary ;
//    }
    public double payRise(double hikePercentage) {
//    salary = salary +(salary * hikePercentage/100);
        return salary + (salary * hikePercentage / 100);
    }
}
