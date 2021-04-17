import java.lang.*;
import java.util.*;
interface Internal 
{
public void readIMarks();
public void display();
}
interface External 
{
public void readEMarks();
}
class MyMarks implements Internal,External 
{
int internal[]=new int[5];
int external[]=new int[5];
public void readIMarks() 
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Internal marks of 5 subjects");
for(int i=0;i<5;i++)
{
internal[i]=sc.nextInt();
}
}
public void readEMarks()  
{
Scanner sc =new Scanner (System.in);
System.out.println("Enter the External marks of 5 subjects");
for (int i=0;i<5;i++)
{
external[i]=sc.nextInt();
}
}
public void display() 
{
System.out.println("Total of Internal & External Marks are:");
for(int i=0;i<5;i++)
{
System.out.println(internal[i]+external[i]);
}
}
}
class InExMarks
{
public static void main(String args[])  
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter student name");
String name=sc.next();
System.out.println("Enter student roll no.");
String rno=sc.next();
System.out.println("Five subjects Internal and External Marks are:");
MyMarks m=new MyMarks();
m.readIMarks();
m.readEMarks();
System.out.println("student name:"+name);
System.out.println("student roll no.:"+rno);
m.display();
}
}
