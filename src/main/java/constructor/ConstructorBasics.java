package constructor;

public class ConstructorBasics {
	/*
	 * Constructor has same name as class name
	 * Constructor is neither void or return type
	 * constructor instantiate instance properties
	 * There are two types of constructor
	 * 			user define constructor(you can have as many as user defined constructor as you need)
	 * 			default constructor
	 * 				is user did not create a constructor then Java will provide a default constructor, you do not see it
	 */
	
	//constructor doesnt pick up static static variable
	// instance is class level
	public static void main(String[] args) {
	
		ConstructorBasics cb = new ConstructorBasics();
		cb.fullNameTest("Aoyon", "Ahmed");
	}

	public String fullNameTest (String firstName, String lastName) {
		String fullName=firstName + " "+lastName;
		System.out.println(fullName);
		return fullName;
		 
	}
}
