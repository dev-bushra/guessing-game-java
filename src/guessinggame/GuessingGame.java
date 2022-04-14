package guessinggame;

import javax.swing.*;
 
public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*10 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a number between 1 and 10", "Bushra Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >10) {
            return "Your guess is Wrong";
        }
        else if (userAnswer == computerNumber ){
            return "Correct :)  \n Total Guesses Try : " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your number is high than what computer choose , try again :) .";
        }
        else if (userAnswer < computerNumber) {
            return "Your number is low than what computer choose , try again :) .";
        }
        else {
            return "Your guess number is incorrect :( .";
        }
    }
}