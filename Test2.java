//without using % ,finding even or odd number


import java.util.Scanner;
class Test2
{
public static void checkEvenOdd(int a)
{
if((a/2)*2==a)
System.out.println("EVEN");
else
System.out.println("ODD");
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
Test2.checkEvenOdd(n);
}
}