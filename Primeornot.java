import java.util.*;
class Primeornot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=2;
int c=0;
while (i<=Math.sqrt(n)){
	if (n%i==0){
             c=c+1;
	}			
    i++;
	}
if (c==0)
System.out.print("yes");
else
System.out.print("no");                 	
}
}
