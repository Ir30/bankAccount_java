package com.nestjavatraining.utiliy;
import java.util.ArrayList;
import java.util.Scanner;
import com.nestjavatraining.entity.Account;
import com.nestjavatraining.service.AccountService;
public class AccountUtility {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account newAccount = new Account();
		ArrayList<Account> accountList=new ArrayList();
		while(true) {
			
			System.out.println("1.Create Account\n2.Login\n3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:{
					System.out.println("Enter Your Name:");
					String name = sc.next();
					System.out.println("Enter Username: ");
					String username = sc.next();
					System.out.println("Enter Password:");
					String password = sc.next();
					newAccount = AccountService.createAccount(name,username,password);
					accountList.add(newAccount);
					break;
				}
				case 2:{
					System.out.println("Enter username: ");
					String username = sc.next();
					System.out.println("Enter Password: ");
					String password = sc.next();
					
					boolean b=false;
					for(Account ac:accountList) {
						
						if((ac.getUsername().equals(username))&& (ac.getPassword().equals(password))){
							System.out.println("Login Successfull");
							b=true;
							int option;
							do {
								System.out.println("1.View Account\n2.Deposit Money\n3.Withdraw Money\n4.Logout");
								option = sc.nextInt();
								
								switch(option) {
									case 1:{
										AccountService.displayAccount(ac);
										break;
									}
									
									case 2:{
										System.out.println("Enter the amount: ");
										float amount = sc.nextFloat();
										AccountService.investMoney(amount, ac);
										break;
									}
									case 3:{
										System.out.println("Enter the amount: ");
										float amount = sc.nextFloat();
										AccountService.withdrawMoney(amount,ac);
										break;
									}
									case 4:{
										System.out.println("logout succesfully");
										break;
									}
									default:{
										System.out.println("Invalid Choice");
									}
								}	
							}
							while(option!=4);
							
						}
						
					}
					if(!b) {
						System.out.println("Invalid Credentilas");
					}
					break;
				}
				
				case 3:{
					System.exit(0);
					break;
				}
				default:{
					System.out.println("Enter a valid choice");
				}
			}
		}
	}

}
