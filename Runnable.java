import java.lang.Thread;
class First implements Runnable
{
public void run()
{
try
{
for(int i=1;i<=3;i++)
{
System.out.println("Good Morning");
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class Second implements Runnable
{
public void run()
{
try
{
for(int k=1;k<=3;k++)
{
System.out.println("Hello");
Thread.sleep(2000);
}
}
catch(InterruptedException h)
{
System.out.println(h);
}
}
}
class Third implements Runnable
{
public void run()
{
try
{
for(int j=1;j<=3;j++)
{
System.out.println("Welcome");
Thread.sleep(3000);
}
}
catch(InterruptedException f)
{
System.out.println(f);
}
}
}
class Runnable
{
public static void main(String args[])
{
First m1=new First();
Thread t1=new Thread(m1);
Second m2=new Second();
Thread t2=new Thread(m2);
Third m3=new Third();
Thread t3=new Thread(m3);
t1.start();
t2.start();
t3.start();
}
}
