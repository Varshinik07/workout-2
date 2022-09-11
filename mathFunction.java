import java .util.*;
public class mathFunction{
int x,y;
double a,b;
mathFunction()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter x value");
  x=sc.nextInt();
 System.out.println("enter y value");
  y=sc.nextInt();
 System.out.println("enter a value");
  a=sc.nextFloat();
 System.out.println("enter b value");
  b=sc.nextFloat();
}
 void multiply(int x,int y)
{
int z=x*y;
System.out.println("multiply value:"+z);
}

void multiply(double a,double b)
{
double c=a*b;
System.out.println("multiply value:"+c);
}

void multiply(int x,double a)
{
double d=x*a;
System.out.println("multiply value:"+d);
}
class math_Function{
public static void main(String args[]){
mathFunction mf=new mathFunction();
mf.multiply(4,6);
mf.multiply(3.2,7.2);
mf.multiply(4,3.2);
}
}
}