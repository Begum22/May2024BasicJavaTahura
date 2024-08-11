package dataType;

public class IntegerDataType {
	/*
	 * My queen $100
	 *   buy apple, milk, pen
	 *   bring change back
	 * 
	 */

	public static void main(String[] args) {
	   long queenGave=100;
	   //int is the data type
	   //queenGave is the variable name
	   //100 is the value
	   //primitive data for full number --
	      //short ==16 bits
	      //int   ==32 bits
	      //long  ==64 bits
	   
	   short apple=50;
	   int milk=12;
	   long pen=30;
	   //if you have mix data type then just declare super data type
	   long totalSpent=apple+milk+pen;
	   System.out.println(totalSpent);
	   
	   long changeBack=queenGave - totalSpent;
	   System.out.println(changeBack);

			   
	   /*
	    * Primitive data for decimal number
	    * lets buy 3 TVs and 2 PC and tell me how much is average for each item 
	    *    float ==32 bits
	    *    double ==64 bits
	    */
	   float TV=600.50f;
	   double PC=800.99;
	   float TVCost=TV*3;
	   double PCCost=PC*2;
	   double totalCost= TVCost + PCCost;
	   System.out.println(totalCost);

	   double Average= totalCost / 5;
	   System.out.println(Average);
	}

}
