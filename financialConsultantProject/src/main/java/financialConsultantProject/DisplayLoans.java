package financialConsultantProject;

import java.util.*;

public class DisplayLoans {

	
		static ArrayList<String> listOfLoans = new ArrayList<String>();
		static {
			listOfLoans.add("--------House Loan----------");
			listOfLoans.add("--------Personal Loan----------");
			listOfLoans.add("--------Gold Loan----------");
			listOfLoans.add("--------Vehicle Loan----------");
			listOfLoans.add("--------Agri Loan----------");
			listOfLoans.add("--------Education Loan----------");
		}
		
		public static void Display() {
			for(String displayloans : listOfLoans) {
				System.out.println(displayloans);
			}
		}

}
