public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
		int InputYear = Integer.parseInt(args[0]);
		while (InputYear >= year)
		{
			advance(InputYear);
		}
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance(int InputYear) {
		 if (dayOfWeek == 1 && year == InputYear)
		 {
			 System.out.println(dayOfMonth + "/" + month + "/" + year + " sunday");
		 }
		 else if (dayOfWeek != 1  && year == InputYear)
		 {
			 System.out.println(dayOfMonth + "/" + month + "/" + year);
		 }
		 
		 if (dayOfMonth < nDaysInMonth(month, year))
		 {
			 dayOfMonth++;
		 }
		 else
		 {
			 dayOfMonth = 1;
			 if (month < 12)
			 {
				 month++;
			 }
			 else
			 {
				 month = 1;
				 year++;
			 }
		 }
		 if (dayOfWeek < 7)
		 {
			 dayOfWeek++;
		 }
		 else
		 {
			 dayOfWeek = 1;
		 }
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			return 30;
		}
		else if (month == 2 && isLeapYear(year))
		{
			return 29;
		}
		else if (month == 2 && !isLeapYear(year))
		{
			return 28;
		}
		else
		{
			return 31;
		}
	}
}
