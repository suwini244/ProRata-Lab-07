import java.util.Scanner;

public class IT22158840Lab7Q1B {
    public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
		
		// Loop through 3 students
		for (int i = 1; i <= 3; i++) {
		     System.out.println("Student" + i);
			 System.out.print("Enter marks: ");
			 
			 // Read the entire line and split it into an array of strings
			 String[] marksInput = input.nextLine().split(" ");
			 
			 int mark1 = Integer.parseInt(marksInput[0]);
			 int mark2 = Integer.parseInt(marksInput[1]);
			 int mark3 = Integer.parseInt(marksInput[2]);
			 int mark4 = Integer.parseInt(marksInput[3]);
			 
			 // Calculate the average
			 double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
			 
			 String grade;
			 if (average >= 75 && average <= 100) {
			     grade = "Distinction";
			 } else if (average >= 50 && average <= 74) {
			     grade = "Credit";
			 } else {
			     grade = "Fail";
			 }
			 
             System.out.printf("Average is: %.2f%n", average);
			 System.out.println("Overall Grade is: " +grade);
			 System.out.println();
		}
		
	}
}
			 
			 
 				 
			 