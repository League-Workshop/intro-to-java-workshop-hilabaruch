package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int number = 0 ;
		// 2.  Ask the user a question 
		String name =JOptionPane.showInputDialog(null,"What is 90 divied by 5?");
		// 3.  Use an if statement to check if their answer is correct
		if(name.equals("18")) {number += 1;}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String rose =JOptionPane.showInputDialog(null,"What is 100 times 100?");
		
		if(rose.equals("10000")) {number += 2;}
String blue =JOptionPane.showInputDialog(null,"What is 170 times 90?");
		
		if(blue.equals("15300")) {number += 3;}
		// 6.  After all the questions have been asked, print the user's score 
System.out.println(number);
	}
}
