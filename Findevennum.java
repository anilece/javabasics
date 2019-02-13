import java.util.Scanner;
class Findevennum{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int i=sc.nextInt();
  int n=sc.nextInt();
  for (;i<n;i++){
      if (i%2==0)
        System.out.print(i+" ");
      }
  }
}
