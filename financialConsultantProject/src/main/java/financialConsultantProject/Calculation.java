package financialConsultantProject;

public class Calculation {

	public static int amount,interestamount;
	
	public static int calculationOfHouseLoan(int amount) {
		int interestamount = 0;
		if(amount == 1000000) {
			interestamount = (amount * 2)/100;
		}
		else if(amount == 2500000) {
			interestamount = (amount * 3)/100;
		}
		else if(amount == 5000000) {
			interestamount = (amount * 5)/100;
		}
		return interestamount;
	}
	
	public static int calculationOfEducationLoan(int amount) {
		if(amount >0 && amount <= 500000) {
			interestamount = (amount * 2)/100;
		}
		return interestamount;
	}
	
	public static int calculationOfPersonalLoan(int amount) {
		if(amount > 0 && amount <= 1000000) {
			interestamount = (amount * 3 )/100;
		}
		return interestamount;
	}
	
	public static int calculationOfGoldLoan(String goldType, int quantityOfGold) {
		if(goldType == "22K") {
			amount = (quantityOfGold * 3000);
			interestamount = (amount * 1)/100;
		}
		else if(goldType == "24K") {
			amount = (quantityOfGold * 3500);
			interestamount = (amount * 1)/100;
		}
		return interestamount;
	}
	
	public static int calculationOfAgriLoan(int acre) {
		if(acre >0 && acre <=100) {
			amount = acre * 7000;
			interestamount = (amount * 1 )/100;
		}
		return interestamount;
	}
	
	public static int calculationOfVehicleLoan(String vehicleType) {
		if(vehicleType == "twowheeler") {
			amount = 200000;
			interestamount = (amount *3)/100;
		}
		else if(vehicleType == "fourwheeler") {
			amount = 500000;
			interestamount = (amount * 3)/100;
		}
		else if(vehicleType == "others") {
			amount = 700000;
			interestamount = (amount * 3)/100;
		}
		return interestamount;
	}
}
