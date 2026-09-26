import java.util.Scanner;

public class IT2158840Lab7Q1A {
    public static void main(String[] args) {
	
	   Scanner input = new Scanner(System.in);
	   int totalSubjects = 4;
	   double totalMarks = 0;
	   
	   System.out.println("Enter marks for four subjects" + totalSubjects + "subjects:");
	   
	   for (int i = 1; i <= totalSubjects; i++) {
	        System.out.print("Enter Subject Mark " + i + ": ");
		    int marks = input.nextInt();
			
			
			if (marks < 0 || marks > 100) {
			    System.out.println("Invalid marks! Please enter marks between 0 and 100. ");
			    i--;
			    continue;
			}
			
			totalMarks += marks;
	   
	   }

 	        double average = totalMarks / totalSubjects;
			
			String grade;
			if (average >= 75 && average <= 100) {
			    grade = "Distinction";
			} else if (average >= 50 && average <= 74) {
			    grade = "Credit";
            } else {
                grade = "Fail";
            }


        System.out.printf("Average is: %.1f%n", average);
        System.out.println("Overall Grade is : " + grade);
  
    }
}	
				