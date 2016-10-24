import java.util.Scanner;

public class AdditionQuizGlen {
	public static void main(String[] args) {
		final int TOTAL_QUESTION_NUMBERS = 5;
		int yourAnswers, count, countCorrectAnswers, wrongAnswerCounter;
		long startTime = System.currentTimeMillis();
		count = 0;
		countCorrectAnswers = 0;
		wrongAnswerCounter = 0;
		
		String yourName;
		String output = " ";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name : ");
		yourName = input.next();
		
		
		System.out.println("Welcome, " + yourName + "! Please solve following questions");
		
		while (count < TOTAL_QUESTION_NUMBERS) {
			int randomNum1 = (int)(Math.random() * 101);
			int randomNum2 = (int)(Math.random() * 101);
			int realAnswers = randomNum1 + randomNum2;
			System.out.print("\n " + randomNum1 + " + " + randomNum2 + " = " );
			yourAnswers = input.nextInt();
			
			if (yourAnswers == realAnswers) {
				countCorrectAnswers++;
			}
			
			else {
				wrongAnswerCounter++;
			}
			
			count++;
			output += "\n" + randomNum1 + " + " + randomNum2 + " = " 
					+ yourAnswers + ((yourAnswers == realAnswers) ? " ... Correct" : " ... Wrong" );
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		if (countCorrectAnswers == TOTAL_QUESTION_NUMBERS) {
			System.out.println("You are a genius, " + yourName + "! You have answered all "
							+ TOTAL_QUESTION_NUMBERS 
							+ " questions correctly."
							+ "\nIt took " + testTime / 1000 + " seconds to complete the questions."
							+ "\nHere are your answers below ... "
							+ "\n" + output);
			System.exit(1);
		}
		
		else if (wrongAnswerCounter == 5) {
			System.out.println("You got everything wrong, " + yourName + "! Fuck off!");
			System.exit(1);
		}

		else if (wrongAnswerCounter ==1) {
			System.out.println(yourName + ", you have answered " + wrongAnswerCounter 
					 + " question incorrectly. "
					 + "\nIt took " + testTime / 1000 + " seconds to complete the questions."
					 + "\nHere are your answers below ... "
					 + "\n" + output);
		}
		
		else {
			System.out.println(yourName + ", you have answered " + wrongAnswerCounter 
					 + " questions incorrectly. "
					 + "\nIt took " + testTime / 1000 + " seconds to complete the questions."
					 + "\nHere are your answers below ... "
					 + "\n" + output);
		}
		
		input.close();
	}
}

