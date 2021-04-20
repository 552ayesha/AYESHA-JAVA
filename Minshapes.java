abstract class Shapes
{
 abstract void calTriangle(int b,int h);
 abstract void calRectangle(int l,int b);
 abstract void calCircle(int r);
 abstract void calSquare(int s);
}
class Area extends Shapes
{
 void calTriangle(int b,int h)
 {
 System.out.println("The area of triangle is="+(b*h)/2);
 }
 void calRectangle(int l,int b)
 {
 System.out.println("The area of retangle is="+(l*b));
 }
  void calCircle(int r)
 { 
 System.out.println("The area of circle is="+(3.14*r*r));
 }
 void calSquare(int s)
 {
 System.out.println("The area of square is="+(s*s));
 }
}
class Minshapes
{
public static void main(String args[])
{
 Area a=new Area();
 a.calTriangle(2,6);
 a.calRectangle(2,4);
 a.calCircle(2);
 a.calSquare(4);
}
}
