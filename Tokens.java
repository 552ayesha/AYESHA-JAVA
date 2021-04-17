import java.util.StringTokenizer;
public class Tokens
{
public static void main(String args[])
{
int count=0;
String msg="Example of String Tokenizers ";
StringTokenizer st=new StringTokenizer(msg," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
count++;
}
System.out.print(count);
}
}
