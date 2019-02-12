import  java.util.Scanner;
class FindnoOfDigits{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	if(sc.hasNextInt()){
	int n=sc.nextInt();
	int c=0;
	int rem=0;
	while (n>0){
		n=n/10;
		c=c+1;
		}
		System.out.print(c);
	}
	else{
		System.out.print("Invalid Input");
  }
}
}
