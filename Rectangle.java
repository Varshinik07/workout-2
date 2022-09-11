import java.util.*;
public class Rectangle{
double length;
double breadth;
 
void getArea()
{
double area;
area=this.length*this.breadth;
System.out.println("Area of rectangle:" +area);
}

void getPerimeter()
{
double Perimeter;
Perimeter=2*(this.length*this.breadth);
System.out.println("Perimeter of rectangle:" +Perimeter);
}
}

class Area_periRectangle{
public static void main(String args[])
{
Rectangle rect=new Rectangle();
rect.length=12.54;
rect.breadth=21.64;
System.out.println("length="+rect.length);
System.out.println("breadth="+rect.breadth);
rect.getArea();
rect.getPerimeter();
}
}