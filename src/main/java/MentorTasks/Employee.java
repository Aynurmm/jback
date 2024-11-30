package MentorTasks;

public class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    public double calculateBonus(double percentage) {
        salary += salary * percentage / 100;
        return salary;
    }



}
