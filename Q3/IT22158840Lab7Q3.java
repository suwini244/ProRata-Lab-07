import java.util.Scanner;

    public class IT22158840Lab7Q3 {
	    public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		
		 for(int customer = 1; customer <= 5; customer++) {
		    System.out.println("Customer" +customer);
			
			System.out.print("Enter total bill amount: ");
			int billAmount = input.nextInt();
			input.nextLine();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char paymentMode = input.next().charAt(0);
			
			if (paymentMode == 'C' || paymentMode == 'c') {
			    
				double discount = billAmount * 0.05;
				double amountToPay = billAmount - discount;
				System.out.println("Discount is: " +discount);
				System.out.println("Amount to be paid: " +amountToPay); 
				
			} else if (paymentMode == 'O' || paymentMode == 'o') {
			 
			    System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + billAmount);
			} else {
			   
			    System.out.println("Payment Mode is not Valid");
			}
			
			System.out.println();
		 }
		
	    }
	}
			