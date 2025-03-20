package basics_day_01;

import java.util.Calendar;
import java.util.Date;

public class PastTime {
	
	public static void main(String[] args) {
		
        Calendar calendar = Calendar.getInstance();
        
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        
        Date pastDate = calendar.getTime();
        
        System.out.println("Past Date (3 days ago): " + pastDate.toString());
    }
	
	

}
