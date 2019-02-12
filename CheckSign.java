import java.util.Scanner;
class CheckSign{
 public static void main(String[] args){ 
   Scanner sc=new Scanner(System.in);
   int i;
   if (!sc.hasNextInt()) {
        System.out.println("Invalid Input");
        sc.next(); 
    }
	  else{
        i = sc.nextInt();
   
  
    if (i>0){
      System.out.print("Positive");
      }
   else if(i==0){
      System.out.print("Zero");
      }
   else{
      System.out.print("Negative");
      }
   }	   
 }
 }
