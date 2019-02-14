

import java.util.Scanner;
class ArmstrongnumBtwAB{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  for (int i=a+1;i<b;i++){
      int res=0;   
      int rem=0;	
      int temp=i;
      while(i>0){
	        rem=i%10;
          res=res+(rem*rem*rem);
	        i=i/10;
          }
      i=temp;
      if (temp==res)
	        System.out.print(i+" ");
  }

}
}
