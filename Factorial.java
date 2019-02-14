import java.util.Scanner;
class Factorial{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int res=1;
  while(a>0){
     res=res*a;
     a--;
      }
  System.out.print(res);
  }
}
