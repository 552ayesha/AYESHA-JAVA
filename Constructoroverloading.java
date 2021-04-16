import java.util.*;
class Box
{
 double length,height,breadth;
 Box()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter length:");
 length=sc.nextDouble();
 System.out.println("Enter breadth:");
 breadth=sc.nextDouble();
 System.out.println("Enter height:");
 height=sc.nextDouble();
 }
 void volume()
 {  
  System.out.println("The volume of box is:");
  System.out.println(length*height*breadth);
 }
}
class Constructoroverloading
{
 public static void main(String args[])
{
 Box b=new Box();
 b.volume();
}
}
