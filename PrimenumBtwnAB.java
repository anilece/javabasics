import java.util.Scanner;
class PrimenumBtwnAB{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

int temp=0;
for (int i=a+1;i<b;i++)
 { int c=0;
   int j=2;
   temp=i;
   while(j<=Math.sqrt(temp))
  	{
  	if (temp%j==0)
	     c=1;
	
        j++;
        }
   if (c==0){
   System.out.print(i+" ");
    }
 }
}
}
