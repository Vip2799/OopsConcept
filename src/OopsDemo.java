public class OopsDemo {
    String employeeName;
    String employeeCode;
    double salary;
    int age;
    String dob ;

    public double SalaryHike(double hikePercentage){
        return salary +(salary*hikePercentage/100);
    }

    public void displayEmployeeDetails(){
        System.out.println("Name of the Employee : "+employeeName);
        System.out.println("Employee Code : "+employeeCode);
        System.out.println("Salary of the Employee : "+salary);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Age : "+age);
    }

}
