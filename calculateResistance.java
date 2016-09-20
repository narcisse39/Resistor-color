
import java.util.Arrays;
public class calculateResistance {
	
	private String ResistorPower;
	private double resistorValue,firstAndSecondDigits;
	
	
	
	displayMessage display = new displayMessage();
	
	
	
	
	public void calculateFirstAndSecondDigits(int first, int second ){
		firstAndSecondDigits = first*10+second;
		
		if(firstAndSecondDigits == 2){
			firstAndSecondDigits = 2.2;}

		else if(firstAndSecondDigits == 3){
			firstAndSecondDigits= 3.3;}

		else if(firstAndSecondDigits == 4){
			firstAndSecondDigits= 3.9;}

		else if(firstAndSecondDigits == 5){
			firstAndSecondDigits= 4.7;}

		else if(firstAndSecondDigits == 6){
			firstAndSecondDigits= 5.6;}

		else if(firstAndSecondDigits == 7){
			firstAndSecondDigits= 6.8;}

		else if(firstAndSecondDigits == 8){
			firstAndSecondDigits= 8.2;}

		else if(firstAndSecondDigits == 9){
			firstAndSecondDigits= 8.2;}

		else if(firstAndSecondDigits == 11){
			firstAndSecondDigits= 12;}

		else if(firstAndSecondDigits > 12 && firstAndSecondDigits < 15){
			if(firstAndSecondDigits - 12 < (15 - 12) / 2){
				firstAndSecondDigits= 12;}
			else {firstAndSecondDigits= 15;}
			}

		else if(firstAndSecondDigits > 15 && firstAndSecondDigits < 18){
			if(firstAndSecondDigits - 15 < (18 - 15) / 2){
				firstAndSecondDigits= 15;}
			else {firstAndSecondDigits= 18;}
			}

		else if(firstAndSecondDigits > 18 && firstAndSecondDigits < 22){
			if(firstAndSecondDigits - 18 < (22 - 18) / 2){
				firstAndSecondDigits= 18;}
			else {firstAndSecondDigits= 22;}
			}

		else if(firstAndSecondDigits > 22 && firstAndSecondDigits < 27){
			if(firstAndSecondDigits - 22 < (27 - 22) ){
				firstAndSecondDigits= 22;}
			else {firstAndSecondDigits= 27;}
			}

		else if(firstAndSecondDigits > 27 && firstAndSecondDigits < 33){
			if(firstAndSecondDigits - 27 < (33 - 27) / 2){
				firstAndSecondDigits= 27;}
			else {firstAndSecondDigits= 33;}
			}

		else if(firstAndSecondDigits > 33 && firstAndSecondDigits < 39){
			if(firstAndSecondDigits - 33 < (39 - 33) / 2){
				firstAndSecondDigits= 33;}
			else {firstAndSecondDigits= 39;}
			}

		else if(firstAndSecondDigits > 39 && firstAndSecondDigits < 47){
			if(firstAndSecondDigits - 39 < (47 - 39) / 2){
				firstAndSecondDigits= 39;}
			else {firstAndSecondDigits= 47;}
			}

		else if(firstAndSecondDigits > 47 && firstAndSecondDigits < 56){
			if(firstAndSecondDigits - 47 < (56 - 47) / 2){
				firstAndSecondDigits= 47;}
			else {firstAndSecondDigits= 56;}
			}

		else if(firstAndSecondDigits > 56 && firstAndSecondDigits < 68){
			if(firstAndSecondDigits - 56 < (68 - 56) / 2){
				firstAndSecondDigits= 56;}
			else {firstAndSecondDigits= 68;}
			}

		else if(firstAndSecondDigits > 68 && firstAndSecondDigits < 82){
			if(firstAndSecondDigits - 68 < (82 - 68) / 2){
				firstAndSecondDigits= 68;}
			else{ firstAndSecondDigits= 82;}
			}

		else if(firstAndSecondDigits > 82 && firstAndSecondDigits < 100){
			if(firstAndSecondDigits - 82 < (100 - 82) / 2){
				firstAndSecondDigits= 82;}
			else {firstAndSecondDigits= 100;}
			}

		else {firstAndSecondDigits = firstAndSecondDigits;}
	}

	public double getFirstAndSecondDigits(){
		
		return firstAndSecondDigits;
		}
	
	public void getScientificNotation(int third){	
		
	if( getFirstAndSecondDigits() > 0 && getFirstAndSecondDigits()< 10){
		switch(third){

		case 0:
			ResistorPower = "Ohms";
			resistorValue= getFirstAndSecondDigits() *1;
			
			break;

		case 1:
			ResistorPower = "Ohms";
			resistorValue= getFirstAndSecondDigits() *10;
			
			break;

		case 2:
			ResistorPower = "Ohms";
			resistorValue= getFirstAndSecondDigits() *100;
			break;

		case 3:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits() *1;
			break;

		case 4:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits() *10;
			break;

		case 5:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits() *100;
			break;

		case 6:
			ResistorPower = "Mohms";
			resistorValue= getFirstAndSecondDigits() *1;
			break;
		case 7:
			ResistorPower = "Mohms";
			resistorValue= getFirstAndSecondDigits() *10;
			break;
		case 8:
			ResistorPower = "Mohms";
			resistorValue= getFirstAndSecondDigits() *100;
			break;

		default:
			display.colorError("multiplier");
			break;
			
			}
	}
	else if (getFirstAndSecondDigits()>= 10 && getFirstAndSecondDigits()< 100){
		switch(third){

		case 0:
			ResistorPower = "Ohms";
			resistorValue= getFirstAndSecondDigits() *1;
			
			break;

		case 1:
			ResistorPower = "Ohms";
			resistorValue= getFirstAndSecondDigits() *10;
			
			break;

		case 2:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits()/10;
			break;

		case 3:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits() *1;
			break;

		case 4:
			ResistorPower = "Kohms";
			resistorValue= getFirstAndSecondDigits() *10;
			break;

		case 5:
			ResistorPower = "Mohms";
			resistorValue= getFirstAndSecondDigits() /10;
			break;

		case 6:
			ResistorPower = "Mohms";
			resistorValue= getFirstAndSecondDigits() *1;
			break;

		default:
			display.colorError("multiplier");
			break;
			
			}
	}
	else{
		display.colorError("multiplier");
	}
	}
	public double getResult(){
		return resistorValue;
	}
	public String multipierPower(){
		return ResistorPower;
	}
	
	
	public String toString(){
		return "Resistance value: "+getResult()+multipierPower();
	}


}

