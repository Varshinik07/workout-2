import java .util.*;
class Employee{
int empid,a1,a2,a3;
String fName,result;
 
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the Employee ID");
empid=sc.nextInt();
System.out.println("enter the Field name");
fName=sc.next();
System.out.println("enter the Assessment 1");
a1=sc.nextInt();
System.out.println("enter the Assessment 2");
a2=sc.nextInt();
System.out.println("enter the Assessment 3");
a3=sc.nextInt();
}
void result()
{
if(a1>=75&&a2>=75&&a3>=75)
{
System.out.println("promoted");
}
else
{
System.out.println("Demoted");
}
}
void cal(){
double total=a1+a2+a3;
double per=(total/300)*100;
System.out.println("total mark obtained:"+total);
System.out.println("percentage obtained:"+per);
}
}
class employee{
public static void main(String args[]){
Employee e=new Employee();
e.result();
e.cal();
}
}