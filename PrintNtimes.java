import java.util.Scanner;
class PrintNtimes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if (sc.hasNextInt()){
	int a=sc.nextInt();
	for (int i=0;i<a;i++){
		System.out.println("Hello");
		}
  }
else{
	System.out.println("Invalid Input");
}
}
} 
