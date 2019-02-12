import java.util.Scanner;
class CheckLeapyear{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if (sc.hasNextInt()){
	int year=sc.nextInt();
	if (year%4==0)
		if(year%100==0)
			if(year%400==0)
				System.out.println("yes");
			else
				System.out.println("no");
		else
			System.out.println("yes");
	else
		System.out.println("no");	
	}
else{
System.out.print("Invalid Input");
}
}
}
