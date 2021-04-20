package s1.s2;
public class Showp
{
public void pac()
{
int temp,a,b;
temp=6;
a=4;
b=6;
System.out.println("after swapping a:"+a+" b:"+b);
}
}

import s1.s2.Showp;
class Swap
{
public static void main(String args[])
{
int a=6,b=4;
System.out.println("before swapping a:"+a+" b:"+b);
Showp s=new Showp();
s.pac();
}
}
