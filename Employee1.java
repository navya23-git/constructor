public class Employee1{
String name;
double salary;
public Employee1(String name,double salary)
{
this.name=name;
this.salary=salary;
}
public void setSalary(String name,double salary){
this.name=name;
this.salary=salary;
}
public void display(){
System.out.println("name:"+name);
System.out.println("salary:"+salary);
}
public String toString(String name,double salary){
return "name:"+name+"salary:"+salary;
}
public static void main(String args[]){
Employee e=new Employee("ramu",100000.0);
System.out.println(e);
}
}