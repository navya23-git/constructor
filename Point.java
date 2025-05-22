public class Point{
int x;
int y;
public Point(int x,int y){
this.x=x;
this.y=y;
}
public void print(){
System.out.println("x:"+x);
System.out.println("y:"+y);
}
public String toString(){
return "x:"+x+"\ny:"+y;
}
public static void main(String []args){
Point p=new Point(2,3);
System.out.println(p);
}
}