package variable;

public class TypesOfVariables {
 /*
  * three types of variables in Java
  * static 
  * instance
  * local
  */
		static String lastName = "Begum";
		String firstName;
	
	public static void main (String [] args) {
		//method calling== class naming
		TypesOfVariables tov= new TypesOfVariables();
		tov.Maryam();
		tov.Tahura();
		
		
	}
    public void Maryam() {
    	double bankAccount=50000.00;
    	firstName="Maryam";
    	System.out.println(firstName+"  "+ lastName);
    	System.out.println(firstName+" has $"+ bankAccount);
    	
    }
    
    public void Tahura() {
    	double savingAccount=5000.00;
    	firstName="Tahura";
    	System.out.println(firstName+"  "+ lastName);
    	System.out.println(firstName+" has $"+ savingAccount);
    }
}
