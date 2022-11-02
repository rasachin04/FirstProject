package com.admin;

import java.util.Scanner;

import com.service.RBI;
import com.serviceImple.HDFC;

public class Test {
public static void main(String[] args) {
	System.out.println("changes");
	
	RBI s = new HDFC();
	Scanner sc = new Scanner(System.in);
	boolean b=true;
	while(b)
	{
    System.out.println("***Welcome to HDFC Bank*****");
	System.out.println(" Enter 1 for creating new account");
	System.out.println(" Enter 2 for view account detail");
	System.out.println(" Enter 3 for Deposite money");
	System.out.println(" Enter 4 for Withdraw money");
	System.out.println(" Enter 5 for update details");
	System.out.println(" Enter 6 for view balance");
	System.out.println(" Enter 7 for Exit"); 
	
	int x=sc.nextInt();
	
	switch (x) {
	case 1:
		s.createAccount();
		break;
case 2:
		s.viewAccountDetails();
		break;

case 3:
	s.depositeMoney();
	break;

case 4:
	s.WithdrawlMoney();
	break;

case 5:
	s.updateDetails();
	break;

case 6:
	s.viewAccountbalance();
	break;

case 7:
	System.out.println("*****thank-you for banking with us *****");
	b=false;
	break;

	default:
		System.out.println("please enter valid input");
		break;
		
	}
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
}
}
