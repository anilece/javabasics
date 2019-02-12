import java.util.Scanner;
class IsAlphabet{
 public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().toLowerCase().charAt(0);
	if (ch>='a' &&ch<='z'){
		System.out.println("Alphabet");
	}
	else{
		System.out.println("No");
	}
 }
}
	
