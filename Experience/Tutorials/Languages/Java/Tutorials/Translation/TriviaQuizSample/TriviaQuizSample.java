package Java.Tutorials.Translation.TriviaQuizSample;

import java.util.Scanner;


/*UPGRADE CHALLENGE: create an AI or a Database filled with question with the chosen subjects to take a quiz
   (subjects: simple math, science, history, geography) 
*/

//TODO Geography Capitals first (with random arrangement)
    //TODO if none of the above (input the correct answer .toLowerCase()))

 //initialize quiz (scanner and variables)
    //scanner
    //keep quiz running
    //countries and capitals declaration in an array

        //play? y or n
            //condition if play == y
                //continue;
            //if play == n
                //break;

        //question n
            //correct answer condition (if answer == correct answer)
                //correct answer dialogue next question
            //wrong answer condition (else - wrong answers)
                // wrong answer dialogue next question
                
        //question ...

        // display correct answers over total items of quiz
            //want to replay?

        //make a function about the questionnaire (getAnswer, getQuestion)
        //make a database of the countries and the capitals into hashmaps
   

public class TriviaQuizSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String answer = scanner.nextLine().toLowerCase();
        boolean continueQuiz = true;

        while (true) {
            try {
                System.out.println("Question N:");
                System.out.println("What is the Capital of (Country)");

                System.out.println("Choices: ");
                System.out.println("A. Capital 1");
                System.out.println("B. Capital 2");
                System.out.println("C. Capital 3");
                System.out.println("D. Capital 4");
                System.out.println("E. None of the above");
                // trigger the input case
                

            }
            catch (Exception e) {
                System.out.println("Invalid answer...");
            }
        }

       
    }
}