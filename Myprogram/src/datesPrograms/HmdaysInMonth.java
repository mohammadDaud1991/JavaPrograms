package datesPrograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class HmdaysInMonth {
public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	Date d=cal.getTime();
	System.out.println(d);
	
	SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy");
	String sdfs=df.format(d);
	System.out.println(sdfs);
	
	String dt=DateFormat.getInstance().format(d);
	System.out.println(dt);
	
	String dmmmy=DateFormat.getDateInstance().format(d);
	System.out.println(dmmmy);
	
	String dmmmyt=DateFormat.getDateTimeInstance().format(d);
	System.out.println(dmmmyt);
	
	LocalDate ld=LocalDate.parse("2019-02-05");
	System.out.println(ld.lengthOfMonth());
	System.out.println(ld.getYear());
	
}
}
