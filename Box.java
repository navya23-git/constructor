public class Box{
int length;
public Box(int length){
this.length=length;
}
public 	Box setLength(int length){
this.length=length;
return this;
}
public void display(){
System.out.println("length:"+length);
}
public String toString(){
return "length:"+length;
}
public static void main(String args[]){
Box b = new Box(5);
    Box b1 = new Box(0);
    System.out.println(b);
    b1.setLength(10).display(); 
    System.out.println(b1);
}
}