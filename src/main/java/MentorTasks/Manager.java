package MentorTasks;

public class Manager extends Employee {
    private int teamSize;


    public Manager(String name, double salary,int teamSize){
        super(name,salary);
        this.teamSize=teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void displayInfo() {
        System.out.println("Name:" + super.getName());
        System.out.println("Salary:" + super.getSalary());
        System.out.println("teamSize:"+teamSize);
//        super.displayInfo();
    }

    public double calculateBonus(double percentage,double fixedAmount) {
        fixedAmount=super.getSalary() + super.getSalary()* percentage / 100;
        return fixedAmount;
    }

}

