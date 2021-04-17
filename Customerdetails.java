import java.util.*;
class Customerdetails
{
 Scanner sc=new Scanner(System.in);
 String name,type;
 int accno;
 double balance;
 public void get_details()
{
 System.out.println("enter account number:");
 accno=sc.nextInt();
 System.out.println("enter name of account holder:");
 name=sc.next();
 System.out.println("enter account type:");
 type=sc.next();
 System.out.println("enter intial balance:");
 balance=sc.nextDouble();
}
public void display()
{
System.out.println("ACCOUNT NUMBER:"+accno+"\n"+"ACCOUNT HOLDER NAME:"+name);
System.out.println("ACCOUNT TYPE:"+type+"\n"+"AVAILABLE BALANCE:"+balance);
}
}
class TransactionDetails extends CustomerDetails
{
Scanner sc=new Scanner(System.in);
public void withdraw()
{
System.out.println("Enter amount to withdraw:");
double amount=sc.nextInt();
if(balance-amount<500)
System.out.println("you must have maintain minimum balance");
else
{
balance=balance-amount;
System.out.println("AVAILABLE BALANCE:"+balance);
}
}
public void deposit()
{
System.out.println("Enter amount to deposit:");
double amount=sc.nextInt();
balance=balance+amount;
System.out.println("AVAILABLE BALANCE:"+balance);
} 
}
class BankTransaction extends TransactionDetails
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
BankTransaction bt=new BankTransaction();
bt.get_details();
bt.display();
System.out.println("Enter your choice(0(withdraw)/1(deposit)");
int choice=s.nextInt();
if(choice==0)
bt.withdraw();
else if(choice==1)
bt.deposit();
else
System.out.println("Invalid choice");
}
}
