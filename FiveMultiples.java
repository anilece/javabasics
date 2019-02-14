import java.util.Scanner;
class FiveMultiples{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int res=1;
  int i=1;
  while(i<=5){
    res=i*a;
    i++;
    System.out.print(res+" ");
    }
  }
}
