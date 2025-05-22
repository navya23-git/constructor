public class Product1{
int id;
double price;
public Product1(int id,double price)
{
this.id=id;
this.price=price;
}
public boolean isSame(Product1 p){
return this.id == p.id ;
}
public String toString() {
 return "Product ID: " + id + ", Price: " + price;
 }
public static void main(String args[]){
Product1 p1=new Product1(102,100);
Product1 p2=new Product1(102,100);
if(p1==p2){
System.out.println("they are same");
}
else{
System.out.println("they are not same");
}
}}