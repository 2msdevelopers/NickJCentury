
public class CenturyList {

	public CenturyList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int count = 0;
		int startYear = 186;
		int endYear = 186;
		
		for (int i=startYear; i<= endYear; i++) {
			
			//blankLine("counter "+ count++);
			Year year = new Year(i);
			year.displayYear();
			year.displayCentury();
			blankLine();
		}	
	}

	private static void blankLine() {
		System.out.println();
	}
	
	private static void blankLine(String string) {
		System.out.println(string);
	}

}
