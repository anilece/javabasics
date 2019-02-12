import java.util.Scanner;
class CheckEvenOdd{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a;
    if (!sc.hasNextInt()) {
        System.out.println("Invalid Input");
        sc.next(); 
    }
	 else{
         a = sc.nextInt();
         if (a>0){
		      if (a%2==0){
			   System.out.println("Even");
	   	   }
	   	   else{
		      	System.out.println("Odd");
		      }
         }
	      else{
		      System.out.print("Invalid Input");
	     }
   }
   
  }
}
