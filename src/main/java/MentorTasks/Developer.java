package MentorTasks;

public class Developer extends Employee{
    private String developerLanguage;

    public Developer(String name, double salary,String developerLanguage){
        super(name, salary);
        this.developerLanguage=developerLanguage;
    }

    public void setDeveloperLanguage(String developerLanguage) {
        this.developerLanguage = developerLanguage;
    }

    public String getDeveloperLanguage(){
        return developerLanguage;
    }

    public void displayInfo() {
        System.out.println("Name:" + super.getName());
        System.out.println("Salary:" + super.getSalary());
        System.out.println("teamSize:"+developerLanguage);
    }

    public double calculateBonus(double percentage, double fixedAmount){
        fixedAmount=calculateBonus(percentage)+super.getSalary();
        return fixedAmount;
    }

}



