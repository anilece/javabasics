import java.util.Scanner;
class VowelCheck{
    public static void main(String[] args){ 	
    Scanner scan=new Scanner(System.in);
    char ch=scan.next().toLowerCase().charAt(0);
    if (Character.isLetter(ch))
	{
	
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		System.out.println("Vowel");
	}
	else{
		System.out.println("Consonant");
	}
     }
     else{
		System.out.println("invalid");
	}
    }
}	
			
