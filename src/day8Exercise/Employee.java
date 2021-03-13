package day8Exercise;

//Encapsulation provides a strategy for abstraction
public class Employee {
    private String empName;
    private int empId;

    //setter
    public void setEmpName (String empName){
        this.empName = empName;
    }

    public void setEmpId (int empId) {
        this.empId = empId;
    }

    //getter
    public int getEmpId() {
        return empId;
    }
    public String getEmpName(){
        return empName;
    }

}
