public class Student1{
int roll;
String name;
public Student1(int roll,String name){
this.roll=roll;
this.name=name;
}
public void updateDetailes(String name){
this.name=name;
}
public void display(){
System.out.println("roll:"+roll);
System.out.println("name:"+name);
}
public String toString(){
return "roll:"+roll+"\nname:"+name;
}
public static void main(String []args){
Student1 s=new Student1(102,"ramu");
System.out.println(s);
s.updateDetailes("lucky");
System.out.println(s);
}}