package oppEx2;

public class Main {

	public static void main(String[] args) {
		
		Date d1 = new Date(2025, 1, 1);
	      System.out.println(d1);  
	      d1.setYear(1998);
	      d1.setMonth(04);
	      d1.setDay(19);
	      System.out.println(d1);
	      
	      System.out.println("it was : "+d1.getDay());
	      
	      
	      //System.out.println("Month is: " + d1.getMonth());
	      d1.setDate(20,1,2026);
	      System.out.println(d1);
	     


	}

}
