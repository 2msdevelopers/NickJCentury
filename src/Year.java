
public class Year {

	int year = 0;
	
	public int getCentury() {
		if (year < 100) {
			return 1;
		} else {
			return year /100;
		}
		
	}
	
	public void displayYear () {
		System.out.println("The Year is " + year);
	}
	
	public void displayCentury () {
		System.out.println("The Century is " + getCentury());
	}
	
	public long getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Year() {
		// TODO Auto-generated constructor stub
	}
	
	public Year(int startYear) {
		year = startYear;
	}
}
