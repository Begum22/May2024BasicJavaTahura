package accessModifier;

public class TypesOfAccessModifier {

	/*
	 * mainly 4 types of access modifier
	 *    private
	 *    default
	 *    protected
	 *    public
	 */
	
	public static void main(String[] args) {
		TypesOfAccessModifier toam = new TypesOfAccessModifier();
		toam.tahuraBedroom();
		toam.bathroom();
		toam.kitchenRoom();
		toam.livingroom();
		

	}

	private void tahuraBedroom(){ 
		System.out.println("private method");
	}
	void bathroom() {
		System.out.println("default method");
	}
	protected static void kitchenRoom() {
		System.out.println("protected method");
	}
    public void livingroom() {
    	System.out.println("public method");
    	
    }
	
}

