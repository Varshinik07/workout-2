class SwapVal{
int a,b;
SwapVal(){
}
SwapVal(int i,int j)
{
a=i;
b=j;
}
void swap(int a,int b)
{
System.out.println("before swapping: a="+a+ "and b= "+b);
int c=a;
a=b;
b=c;
System.out.println("after swapping: a="+a+ "and b= "+b);
}
void swapreference(SwapVal val)
{
System.out.println("before swapping: a="+a+ "and b= "+b);
int c;
c=val.a;
val.a=val.b;
val.b=c;
System.out.println("after swapping: a="+val.a+ "and b= "+val.b);
}
public static void main(String args[]){
SwapVal sw1=new SwapVal();
sw1.swap(30,50);
SwapVal sw2=new SwapVal(9,8);
sw2.swapreference(sw2);
}
}