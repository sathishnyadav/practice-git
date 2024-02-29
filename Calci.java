import java.util.Scanner;

interface Calci
{
 public static int getSum(int n1,int n2);
}

class CalciImpl implements Calci
{
 public static int getSum(int n1,int n2){
  return n1+n2;
}
}

class CalciDriver
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers to find sum");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println(num1+"+"+num2+"="+CalciImpl.getSum(num1, num2));
}
}