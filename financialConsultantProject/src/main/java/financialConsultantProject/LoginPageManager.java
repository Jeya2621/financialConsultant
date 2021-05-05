package financialConsultantProject;

import java.util.*;

public class LoginPageManager {	
	 static ArrayList<loginPage> login = new ArrayList<loginPage>();
		static {
			loginPage login1 = new loginPage();
			login1.username = "Jeya";
			login1.password = "jeya123";
			login.add(login1);
			
			
			loginPage login2 = new loginPage();
			login2.username = "Nandhini";
			login2.password = "nandhini123";
			login.add(login2);
		
		
		}

		
		
		public static boolean validLogin(String username, String password) {
			boolean isExists=false;
			for(loginPage Login : login) {
				if(Login.username.equalsIgnoreCase(username) && Login.password.equalsIgnoreCase(password)) {
					//System.out.println("Successfully Logged In");
					isExists=true;
					break;
				}
				//return isExists;
			}return isExists;
		}
		
		public static boolean NewUserRegistration(String username, String password) {
			loginPage login3 = new loginPage();
			login3.username = username;
			login3.password = password;
			login.add(login3);
			return true;
		}
		public static void showUser() {
			for(loginPage list:login) {
				System.out.println(list.username +" "+list.password+" ");
			}
		}
		
		public static void main(String[] args) {
			
			NewUserRegistration("Yuvaraj","yuvaraj123");
			showUser();
			
			
			validLogin("jeya","jeya123");
			
			System.out.println("****************************************************");
			System.out.println("******************Loan Types************************");
			System.out.println("*****************************************************");
			
			DisplayLoans.Display();
			
			System.out.println("******************************************************");
			
		}
	}


	
	


