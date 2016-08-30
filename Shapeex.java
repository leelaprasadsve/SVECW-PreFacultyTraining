public abstact Shape
{
public String color;
public boolean filled;
public Shape()
{
System.out.println("in Shape");
}
public Shape(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getColor()
{
return color; }
public void setColor(String color)
{
this.color=color; }
public boolean isFilled()
{
return filled; }
public void setFilled(boolean filled)
{
this.filled=filled; }
pulic abstract double getArea();
public abstract double getPerimeter();
public abstract String toString();
}

}
public class Circle extends Shape
{
public double radius;
public Circle()
{
System.out.println("in circle");
}
public Circle(double radius)
{
this.radius=radius;
}
public Circle(double radius,String color,boolean filled)
{
super(color,filled);
this.radius=radius;
}
public double getRadius()
{
return radius; }
public void setRadius(double radius)
{
this.radius=radius;
}
public double getArea()
{
return 2*3.14*radius;
}
public double getPerimeter()
{
return radius;
}
public String toString()
{
return color; }
}
public class Rectangle extends Shape
{
public double width;
public double length;
public Rectangle()
{
System.out.println("in rectangle");
}
public Rectangle(double width,double length)
{
this.width=width;
this.length=length;
}
public Rectangle(double width,double length,String color,boolean filled)
{
super(color,filled);
this.width=width;
this.length=length;
}
public double getWidth()
{
return width; }
public void setWidth(double width)
{
this.width=width;
}
public double getLength()
{
return length; }
public void setLength(double length)
{
this.length=length;
}
public double getArea()
{
return width*length;
}
public double getPerimeter()
{
return radius; }
public String toString()
{
return color;
}
}
public class Square extends Rectangle
{
public Square()
{
System.out.println("in Square");
}
public Square(double side)
{
length=side;
}
public Square(double side,String color,boolean filled)
{
super(color,filled);
length=side;
}
public double getSide()
{
return length;
}
public void setSide(double side)
{
length=side;
}
public void setWidth(double side)
{
width=side;
}
public void setLength(double side)
{
length=side;
}
public String toString()
{
return color;
}
}

public class Shapeex
{
public static void main(String a[])
{
Square s=new Square(34.23,"abc",1);
}
}