
public class daysInMonth {
	public static void main(String[] args) {
		
		int mnt = Integer.parseInt(args[0]);
		String Month = "";
		int Days = 0;
		
		if (mnt < 1 || mnt > 12) 
			System.out.println("Incorret month. Please enter a month between 1 and 12.");
		
		switch (mnt) 
		{
		case 1:
            Month = "January";
            Days = 31;
            break;
        
		case 2:
            Month = "February";
            Days = 28;
            break;
            
		case 3:
            Month = "March";
            Days = 31;
            break;
            
        case 4:
            Month = "April";
            Days = 30;
            break;
            
        case 5:
            Month = "May";
            Days = 31;
            break;
            
        case 6:
            Month = "June";
            Days = 30;
            break;
            
        case 7:
            Month = "July";
            Days = 31;
            break;
            
        case 8:
            Month = "August";
            Days = 31;
            break;
            
        case 9:
            Month = "September";
            Days = 30;
            break;
            
        case 10:
            Month = "October";
            Days = 31;
            break;
            
        case 11:
            Month = "November";
            Days = 30;
            break;
            
        case 12:
            Month = "December";
            Days = 31;	
		}
		
		System.out.println("Number of days in " + Month + " are " + Days );
		
	}

}
