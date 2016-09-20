

public class displayMessage {
public void displayHeader(){
	System.out.println("Welcome");
	System.out.println("-------");
}
public void displayError(){
	System.out.println("------------------------------");
	System.out.println("Wrong option has been entered!");
	System.out.println("------------------------------");
}
public void displayExit(){
	System.out.print("You have exit the program.\nThank You for using the program.");
	System.out.println();
}
public void displayMenu(){
	System.out.println("Menu");
	System.out.println("----");
	System.out.println("1.Enter color values");
	System.out.println("2.Calculate resistance");
	System.out.println("3.Display resistance value");
	System.out.println("4.Exit");
	
}
public void option(){
	System.out.print("Select option:");
}
public void colorError(String color){
	System.out.println("Wrong "+color+" has been entered");
}
public void inputColor(){
	System.out.print("Enter the colour coding :");
}
public void firstDigit(){
	System.out.println("FIRST BAND");
}
public void secondDigit(){
	System.out.println("SECOND BAND");
}
public void thirdDigit(){
	System.out.println("THIRD BAND");
}
public void fourthDigit(){
	System.out.println("FOURTH BAND");
}
public void reistanceHeader(){
	System.out.println();
	System.out.println("Display the colors and value of the resistance");
	System.out.println("----------------------------------------------");
}
public void horizontalLine(){
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
}
public void calculateResistanceValue(){
	System.out.println("THE RESISTANCE VALUE HAS BEEN CALCULATED!");
}

}

