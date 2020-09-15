import java.util.Scanner;
/**
 *  program that will ask the user for a single integer. It is your job to let the user know what the correct word to be spoken is!

 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	// create a Scanner for user input
	Scanner input = new Scanner(System.in);
	//prompt user for the value
	System.out.println("Please enter a number to play FizzBuzz");
	int number = input.nextInt();
	//if the number divides by both 3 and 5 without any remainder say fizzbuzz
	if (number % 5 == 0 && number % 3 == 0){ 
		System.out.println("You should say FizzBuzz");
	}
	//if it only divides by 5 then say Buzz
	else if (number % 5 == 0){
		System.out.println("You should say Buzz");
	}
	//if it only divides by 3 then say Fizz
	else if (number % 3 == 0){
		System.out.println("You should say Fizz");
	} else { // else just say the number
		System.out.println("You should say " + number);
	}
    
  }
}
