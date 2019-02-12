import java.util.*;
class SumUptoK{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if (sc.hasNextInt()){
	int n=sc.nextInt();
	int k=sc.nextInt();
	int sum=0;
	if (n>=k){
		int[] a = new int[n] ;
		for (int i = 0; i < n; i++) 
		{
			a[i]=sc.nextInt();
		}		
		int j=0;
		while (j<k){
			sum=sum+a[j];
			j=j+1;
			}
		System.out.println(sum);
    }
	else{
		System.out.println("Invalid Input");
		}
	}
else{
	System.out.println("Invalid Input");
}
}
}
