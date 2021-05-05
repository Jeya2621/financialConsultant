package financialConsultantProject;

import java.util.*;

public class LoanApplication {

	static ArrayList<loginPage> detailLists=new ArrayList<loginPage>();
	
	 public static void displayLoans (String name,String fatherName1,int age,String gender1,String email1,long mobileNo1,long adharNo1,String address1) {
	 loginPage login4=new loginPage();
	 login4.name=name;
	 login4.fatherName=fatherName1;
	 login4.Age=age;
	 login4.gender=gender1;
	 login4.email=email1;
	 login4.address=address1;
	 login4.mobileNo=mobileNo1;
	 login4.adharNo=adharNo1;
	 detailLists.add(login4);
	 
	 }
	 
	 
	public static boolean ValidDiplayApplicationForm(String name,String FatherName,int age,String gender,String email,long mobileno,long adharno,String address) {
	boolean isExists=false;

	for(loginPage lists:detailLists) {
	if(lists.name.equalsIgnoreCase(name) && lists.fatherName.equalsIgnoreCase(FatherName)&&lists.Age==age&&lists.gender.equalsIgnoreCase(gender)&&lists.email.equalsIgnoreCase(email)&&lists.mobileNo==mobileno&&lists.adharNo==adharno&&lists.address.equalsIgnoreCase(address)) {
	isExists=true;
	}
	
	}return isExists;
	
	}


	public static void main(String[] args)
	{
	displayLoans("Jeya","SivaKumar",21,"female","jeya04632@gmail.com",7305166720l,987678654321l,"4/230,Mettu Street,Kovilpatti.");
	
	}

}
