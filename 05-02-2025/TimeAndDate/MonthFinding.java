package TimeAndDate;

import java.time.LocalDateTime;
import java.time.Month;

public class MonthFinding {
	
	public static void main(String args[]) {

		 LocalDateTime l=LocalDateTime.now();
		 System.out.println(l);
		 Month m=l.getMonth();
		 System.out.println(m);
		 
		 int day=l.getDayOfMonth();
		 System.out.println(day);
		 
		 
	}

}
