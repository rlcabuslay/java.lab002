import java.util.Scanner;  

public class Answer1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Invoice Total Calculator");
		
		Scanner scanner = new Scanner(System.in);
		
		float numInvoices = 0;
		float totalInvoice = 0;
		float totalDiscount = 0;
		
		while (true) {
			System.out.print("Enter subtotal: ");
		    String stringSubtotal = scanner.nextLine();
		    float subtotal = Float.parseFloat(stringSubtotal);
		    
		    System.out.print("Enter Discount percent: ");
		    String stringDiscountPercent = scanner.nextLine();
		    float discountPercent = Float.parseFloat(stringDiscountPercent);
		    
		    float discountAmount = subtotal * discountPercent;

		    System.out.println(String.format("Discount amount: %s", discountAmount));
		    
		    float invoiceTotal = subtotal - discountAmount;
		    
		    System.out.println(String.format("Invoice total: %s", invoiceTotal));
		    
		    numInvoices++;
	    	totalInvoice += invoiceTotal;
	    	totalDiscount += discountAmount;
		    
	    	boolean continueFlag;
	    	
	    	do {
	    		System.out.print("Continue? (y/n): ");
			    String continueCalc = scanner.nextLine().toLowerCase();
			    
			    if (continueCalc.equals("y")) {
			    	continueFlag = true;
			    	break;
			    	
			    } else if (continueCalc.equals("n")){
			    	continueFlag = false;
			    	break;
			    	
			    } else {
			    	System.out.println("Invalid input. Please retry.");
			    	continue;
			    	
			    }
	    	} while(true);
	    	
	    	if (continueFlag == true) {
	    		continue;
	    		
	    	} else {
	    		break;
	    		
	    	}
		    
		}
		
		System.out.println(String.format("Number of invoices: %s", (int) numInvoices));
		System.out.println(String.format("Average invoice: %s", totalInvoice / numInvoices));
		System.out.println(String.format("Average discount: %s", totalDiscount / numInvoices));
	}

}
