package dataType;

public class StringDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String anyThing = "hkhEEE44#@";
		/*
		 * String is referrential data type
		 * unlimited memory
		 * anything between ""
		 */
		
		String firstName= "Tahura";
		/*
		 * String is the data type== you must declare data type
		 * firstName is the variable name
		 * "Tahura"; = is the first name
		 *
		 */
		
		String lastName="Begum";
		
		//only addition is allowed for String data type
		//and concatenation is also allowed
		
		String fullName = firstName + lastName; 
		System.out.println(fullName);
		
		//and concatenation is also allowed
		
		String fullNameOne = firstName +" "+ lastName; 
		System.out.println(fullNameOne);
		
		String fullNameTwo = "My full name is " +firstName +" "+ lastName; 
		System.out.println(fullNameTwo);
		
	}
	

}
