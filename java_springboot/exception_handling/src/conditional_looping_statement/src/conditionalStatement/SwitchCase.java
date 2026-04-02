package conditionalStatement;

public class SwitchCase {
	public static void main(String[] args) {
		
	}
	//System.out.println("Enter day no: ");
	//int value = sc.nextInt();
	//switch(value) {
	//case1:{
		//System.out.printlm("Mon");
		//break;
	//}
	//case 2:{
		//System.out.println("Tuesday");
		//break;
		
	//}
	//default:{
		//System.out.println("Invalid");
		
	//}
	//}
	
	String typeOfDay = switch(value) {
	case 1, 2, 3, 4, 5, 6 -> "Weekday";
	case 7 -> "Weekend";
	default -> "Invalid day";
	};
	
	System.out.pritln("Res: "+typeOfDay);
}

