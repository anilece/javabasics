import java.util.Scanner;
class PrintNsum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if (sc.hasNextInt()){
	int a=sc.nextInt();
	int sum=0;
	for (int i=0;i<=a;i++){
		sum+=i;
	}
System.out.println(sum);
}
else{
	System.out.println("Invalid Input");
}
}
} 
