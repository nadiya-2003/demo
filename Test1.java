import java.util.Scanner;
class Test1
{
public static void checkEvenOdd(int a)
{
if (a%2==0)
System.out.println("EVEN");
else
System.out.println("ODD");
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
Test1.checkEvenOdd(n);
}
}