import java.util.*;
class Palindromeornot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if (sc.hasNextInt()){
	int n=sc.nextInt();
	int pa=0;
	int rem=0;
	int s=n;
	while (n>0){
		rem=n%10;
		pa=(10*pa)+rem;
		n=n/10;
		}
	if (s==pa)
		System.out.print("yes");	
	else
		System.out.println("no");
	}
	else{
		System.out.print("Invalid Input");
	}
}
}
