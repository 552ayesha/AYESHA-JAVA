package same;
class A
{
 public int x;
 protected int y;
 private int z;
 int d;
}

package same;
class B extends A
{
public static void main(String args[])
{
B b=new B();
b.x=5;
b.y=6;
b.d=9;
System.out.println("x="+b.x);
System.out.println("y="+b.y);
System.out.println("d="+b.d);
}
}
