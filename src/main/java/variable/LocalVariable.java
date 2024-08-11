package variable;

public class LocalVariable {

	public static void main (String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.castingVote();
		lv.humanGrowUp();
		
	}
		public void castingVote(){
			int age = 16;
			
			if (age>=18) {
				System.out.println("You are able to vote");
		
			}else
			{
				System.out.println("You are not old enough to vote");
				}
				
		
	}

		//Public void gradeFour() 
		
		public void humanGrowUp() {
			// age =<6 == toddler
			// age >=7 == infant
			// age >=12 == teenager
			// age >=19 == adult
			int age=17;
			if (age ==6) {
				System.out.println("you are toddler");
			}else if (age==7) {
				System.out.println("you are infant");
			}else if (age ==13) {
				System.out.println("you are a teenager");
			}else {
				System.out.println("you are human");
			}
			
		}
			
		
}
