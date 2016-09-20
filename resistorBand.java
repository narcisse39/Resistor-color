import java.util.Arrays;
import java.util.Scanner;

public class resistorBand {
	//attributes
		private String firstColor,secondColor,thirdColor,toleranceColor;
		private String [] colorCodes     = {"black","brown","red","orange","yellow","green","blue","violet","grey"};
		private String [] toleranceCodes = {"0","brown","red","3","4","gold","6","7","8","9","silver","11","12","13","14","15","16","17","18","19","none"};
		
	
		displayMessage display = new displayMessage();
		Scanner scan = new Scanner(System.in);
		
		
		public void setFirstBand(){
			
			 firstColor = scan.next();
		}
		public void setSecondBand(){
			
			secondColor =scan.next();
		}
		public void setThirdBand(){
			
			thirdColor = scan.next();
		}
		public void setFourthBand(){
			
			toleranceColor = scan.next();
		}
	
		public int getFirstBand(){
			return Arrays.binarySearch(colorCodes,getFirstColor());
			
		}
		public int getSecondBand(){
			return Arrays.binarySearch(colorCodes,getSecondColor());	
		}
		public int getThirdBand(){
			return Arrays.binarySearch(colorCodes,getThirdColor());	
		}
		public int getFourthBand(){
			return Arrays.binarySearch(toleranceCodes,getFourthColor());	
		}
		public String getFirstColor(){
			return firstColor;	
		}
		public String getSecondColor(){
			return secondColor;	
		}
		public String getThirdColor(){
			return thirdColor;	
		}
		public String getFourthColor(){
			return toleranceColor;	
		}
		
}
