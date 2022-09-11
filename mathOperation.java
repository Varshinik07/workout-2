import java.util.*;
class mathOperation{
double r;
int x,y;
mathOperation(){
}
void init()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter x value");
x=sc.nextInt();
System.out.println("enter y value");
y=sc.nextInt();
}
void add()
{
int r=x+y;
System.out.println("Add value" +r);
}
void multiply()
{
int r=x*y;
System.out.println("multiplied value" +r);
}
void power()
{
double r=Math.pow(x,y);
System.out.println("R=" +r);
}
void display()
{
add();
multiply();
power();
}
}
class math_Operation{
public static void main(String args[]){
mathOperation mo=new mathOperation();
mo.init();
mo.display();
}
}