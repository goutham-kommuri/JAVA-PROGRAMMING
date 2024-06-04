import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(age>18){
			System.out.println("ELIGIBLE to vote");
		}else{
			int shortBy = (18 - age);
			System.out.println("Sorry, you can't vote now! You can vote after :"+ shortBy + " years");
		}

	}

}
OUTPUT

Enter your age
21
ELIGIBLE to vote
