import java.util.Scanner;
class LargestOfThree{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	if(sc.hasNextInt()){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if ((a>b)&&(a>c))
	System.out.print(a);
	else if (b>c)
	System.out.print(b);
	else
	System.out.print(c);
	}
	else if(sc.hasNext()){
		System.out.print("Invalid Input");
	}
	}
}
