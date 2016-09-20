import java.util.Arrays;

public class displayResistanceValue {
	
	displayMessage display = new displayMessage();
	
	
	public void displayResistanceValue(String first,String second,String third,String tolerance,String resistanceValue,int toleranceNumber){
		display.reistanceHeader();
		
		System.out.println("The color of the first band: "+ first);
    	System.out.println("The color of the second band: "+second );
    	System.out.println("The color of the multiplier: "+third );
    	System.out.println("The color of the tolerance: "+tolerance);
    	
		System.out.println  (resistanceValue);
		System.out.println(" with a tolerance of +- "+toleranceNumber + "%");
		
		}
}

