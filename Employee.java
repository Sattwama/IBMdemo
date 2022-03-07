class Employee{
private int empId;
private double salary;
public Employee(int empId,double salary){
this.empId=empId;
this.salary=salary;
}
public void setEmpId(int empId)
{
this.empId=empId;
}
public void setSalary(double salary)
{
this.salary=salary;
}
public int getEmpId(){
return empId;
}
public double getSalary()
{
return salary;
}
}
