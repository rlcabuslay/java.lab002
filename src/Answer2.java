import java.util.Scanner; 

public class Answer2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Download Time Estimator");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter file size (MB): ");
			String stringFileSize = scanner.nextLine();
			int fileSize = Integer.parseInt(stringFileSize);
			
			System.out.print("Enter download speed (MB/sec): ");
			String stringDownloadSpeed = scanner.nextLine();
			int downloadSpeed = Integer.parseInt(stringDownloadSpeed);
			
			int totalSeconds = fileSize / downloadSpeed;
			
			int seconds = totalSeconds % 60;
			
			int totalMinutes = totalSeconds / 60;
			
			int minutes = totalMinutes % 60;
			
			int hours = totalMinutes / 60;
			
			System.out.println(String.format("This download will take approximately: %s hours %s minutes %s seconds", hours, minutes, seconds));
			
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
	}
}
