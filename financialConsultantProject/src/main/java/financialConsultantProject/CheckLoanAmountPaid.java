package financialConsultantProject;

import java.util.*;

public class CheckLoanAmountPaid {
	static int price = 0;
	public static boolean amountPaidorNot(int amount, int lienamount) {
		boolean isValid = false;
		for(int i =1;i<=12;i++) {
			amount = amount - lienamount;
			System.out.println("Month -"+i);
			System.out.println("Lien Amount -"+lienamount);
			System.out.println("Balance Amount -"+amount);
		}
		if(amount == 0) {
			isValid = true;
		}
		return isValid;
	}
}
