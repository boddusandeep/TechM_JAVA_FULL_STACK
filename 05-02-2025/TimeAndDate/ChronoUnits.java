package TimeAndDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnits {
	public static void main(String args[]){ 
		
		LocalDate t=LocalDate.now();
		System.out.println(t);
		
		LocalDate nextweek=t.plus(1,ChronoUnit.WEEKS);
		System.out.println(nextweek);
	}

}
