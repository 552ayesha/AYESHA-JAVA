class Sum
{
 void add(int a,int b)
 {
  System.out.println(a+b);
 }
 void add(float a,float b)
 {
  System.out.println(a+b);
 }
 void add(double a,double b)
 {
  System.out.println(a+b);
 }
 void add(int a,double b)
 {
  System.out.println(a+b);
 }
}
class Methodoverloading
{
public static void main(String args[])
{
 Sum s=new Sum();
 s.add(2,5);
 s.add(2.4f,1.3f);
 s.add(3.6,1.9);
 s.add(2,4.5);
}
}
