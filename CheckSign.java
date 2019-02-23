import java.util.Scanner;
class CheckSign{
 public static void main(String[] args){ 
   Scanner sc=new Scanner(System.in);
   int i;
   if (!sc.hasNextInt()) {  #to check for invalid input 
        System.out.println("Invalid Input");
        sc.next(); 
    }
	  else{
        i = sc.nextInt();
   
  
    if (i>0){  # to check positive number
      System.out.print("Positive");
      }
   else if(i==0){ # check zero
      System.out.print("Zero");
      }
   else{  #else negative confirmed
      System.out.print("Negative");
      }
   }	   
 }
 }
