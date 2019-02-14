

import java.util.Scanner;
class Armstrongnum{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int res=0;   
  int rem=0;	
  int temp=a;
  while(a>0){
	      rem=a%10;
        res=res+(rem*rem*rem);
	      a=a/10;
   }
  if (temp==res)
	  System.out.print("yes");
  else
	  System.out.print("no");
}
}
