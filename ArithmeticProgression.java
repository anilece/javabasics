import java.util.Scanner;
class ArithmeticProgression{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int d=sc.nextInt();
int[] ar=new int[n*d];
int sum=0;
for (int i=0;i<n*d;i++){
  ar[i]=i+1;
  }
for (int i=0;i<n;i++){
	sum=sum+ar[a-1];
  a=a+d;
  }

System.out.print(sum);
}
}
