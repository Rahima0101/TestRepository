package dataTypes;

public class Elself_Demo {

	public static void main(String[] args) {
		
		/* Else if syntax
		 * 
		 * if (condition)
		 * { code to be executed
		 * }else if (condition)
		 * }
		 * Code to be executed 
		 * } else
		 * {
		 * Code to be executed 
		 * } 
		 */
		
		int age = 16;
		
		
		if(age >= 18 && age <= 80) {
			
			System.out.println( "It is high time to get married");
		}else if (age> 80 && age >= 129)
		{
			System.out.println("Pray to God you are in good health");
		}
		else
		{
			System.out.println("You are too young !! \n wait for a while");
		}
		
		
		
	

}
