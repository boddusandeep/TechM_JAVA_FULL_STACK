package TimeAndDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
	public static void main(String args[]) {
		ZonedDateTime d=ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println(d);
		ZoneId id = ZoneId.of("Europe/Paris"); 
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);

	}

}
