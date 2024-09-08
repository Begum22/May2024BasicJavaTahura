package constructor;

public class Students {
	int id;
	String firstName;
	String lastName;
	

	public Students(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println(id + " " +  firstName + "  "+ lastName );
	}

	public static void main(String[] args) {
	
		Students Salman = new Students(1, "Salman", "Shahriar");
		 double SalmanseleniumFee=Salman.courseJava(500.00);
		 double SalmanjavaFee=  Salman.courseSelenium(1000.00);
		 double SalmantotalFee=SalmanseleniumFee + SalmanjavaFee;
		 System.out.println("Total  due  " + SalmantotalFee);
		 
		 Students Tahura = new Students(2, "Tahura", "Begum");
		 double TahuraseleniumFee=Tahura.courseJava(600.00);
		 double TahurajavaFee=  Tahura.courseSelenium(2000.00);
		 double TahuratotalFee=TahuraseleniumFee + TahurajavaFee;
		 System.out.println("Total  due  " + TahuratotalFee);
		 
	}
	
	public double courseSelenium (double tuitionFee) {
		System.out.println("Selenium fee "+ tuitionFee);
		return tuitionFee;
	}
	
	public double courseJava (double fee) {
		System.out.println("Java fee "+ fee);
		return fee;
	
	}
}
