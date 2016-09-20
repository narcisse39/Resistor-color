import java.util.Arrays;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		//Create objects
		displayMessage display = new displayMessage();
    	Scanner input = new Scanner(System.in);
    	resistorBand bands = new resistorBand();
    	
    	calculateResistance calculate = new calculateResistance();
    	displayResistanceValue resistanceValue  = new displayResistanceValue();
    	
    	
    	//Attribute
    	int option;
    	
    	
    	//Display the menu
    	display.displayHeader();
    	display.displayMenu();
    	display.option();
    	option = input.nextInt();
    	display.horizontalLine();
    	System.out.println();
    	
    	while(option != 4){
    		
    		switch(option){
    		case 1:
    			//Prompt for the color coding of the resistor
    			display.firstDigit();
    			display.inputColor();
    			bands.setFirstBand();
    			
    			display.secondDigit();
    			display.inputColor();
    			bands.setSecondBand();
    			
    			display.thirdDigit();
    			display.inputColor();
    			bands.setThirdBand();
    			
    			display.fourthDigit();
    			display.inputColor();
    			bands.setFourthBand();
    				
    			break;
    		case 2:
    			display.calculateResistanceValue();
    			
    			break;
    		case 3:

    			//Calculate the resistance value
    			calculate.calculateFirstAndSecondDigits(bands.getFirstBand(),bands.getSecondBand());
    			calculate.getFirstAndSecondDigits();
    			
    			//Calculate the resistance value in scientific form
    			calculate.getScientificNotation(bands.getThirdBand());
    			
    			//Display the resistance value
    			resistanceValue.displayResistanceValue(bands.getFirstColor(),bands.getSecondColor(),bands.getThirdColor()
    					,bands.getFourthColor(),calculate.toString(),bands.getFourthBand());
    			break;
    			
    		default:
    			//Display error
    			display.displayError();
    			break;
    		}
    		
    		//Prompt the user to select an option
    		display.horizontalLine();
    		System.out.println();
    		display.option();
        	option = input.nextInt();
        	System.out.println();
        	display.horizontalLine();
    	}
    	//Exit the application
    	display.displayExit();
    	
	}

}

