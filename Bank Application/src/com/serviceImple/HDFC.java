package com.serviceImple;

import java.util.Random;
import java.util.Scanner;

import com.model.Sachin;
import com.service.RBI;

public class HDFC implements RBI {
   Sachin j  = new    Sachin();
	Scanner sc = new Scanner(System.in);
	Random na = new Random();
	public void createAccount() {
		System.out.println("Enter account number");
		//j.setAccountNO(na.nextInt(3255607611));
		System.out.println("Enter accountholder name");
		j.setAccountHolderName(sc.next());
		System.out.println("Enter Address ");
		j.setAddress(sc.next());
		System.out.println("Enter Aadhar-no");
		j.setAdharNo(sc.nextLong());
		System.out.println("Enter Mobile-no");
		j.setMobNo(sc.nextLong());
		System.out.println("Enter pan-no ");
		j.setPanno(sc.next());
		System.out.println("Enter deposit ammount");
		j.setDepositAmount(sc.nextDouble());
		System.out.println("account created succfully");
		
		
	}

	@Override
	public void viewAccountDetails() {
		System.out.println("Enter your account number");
		if(sc.nextLong()==j.getAccountNO())
		{
		System.out.println("Account no :"+j.getAccountNO());
		System.out.println("Account holder name :"+j.getAccountHolderName());
		System.out.println("Adhar no :"+j.getAdharNo());
		System.out.println("mobile no :"+j.getMobNo());
		System.out.println("pan no :" +j.getPanno());
		}
		else
		{
			System.out.println("!!!account is not found!!");
		}
		
		
	}

	@Override
	public void WithdrawlMoney() {
		System.out.println("enter amount");
		if(j.getDepositAmount()>sc.nextDouble())
		{
		
double f =sc.nextDouble();
j.setViewBalance(j.getDepositAmount()-f);

	System.out.println("*****withdraw succefully*****");}
		else
		{
			System.out.println("!!!insufficent balance!!!");
		}
	
	}

	
	public void depositeMoney() {
System.out.println("Enter amount");
  double s= sc.nextDouble();
  j.setViewBalance(j.getDepositAmount()+s);
  
System.out.println("***deposit successfully***");
	}

	@Override
	public void updateDetails() {
		boolean b5 = true;
		while(b5)
		{
		System.out.println("enter 1 for change name");
		System.out.println("enter 2 for update address");
		System.out.println("enter 3 for update mobileno");
		System.out.println("enter 4 for update panno");
		System.out.println("enter 5 for update aadhar name");
		System.out.println("enter 6 for exit");
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("enter new name");
			String a=sc.next();
			j.setAccountHolderName(a);
			System.out.println("**new name updated successfully**");
			break;
		case 2:
			System.out.println("enter new address");
			 String b=sc.next();
			j.setAddress(b);
			System.out.println("**new address updated successfully***");
			break;
		case 3:
			System.out.println("enter new mobile no");
		long	k=sc.nextLong();
			j.setMobNo(k);
			System.out.println("**new mobile no updated successfully**");
			break;
		case 4:
			System.out.println("enter new panno");
			String a1=sc.next();
		j.setPanno(a1);
			System.out.println("**new panno updated successfully**");
			break;
		case 5:
			System.out.println("enter new aadhar no");
			long a4=sc.nextLong();
			j.setAdharNo(a4);
			System.out.println("**new aadhar no updated successfully..**");
			break;
		case 6:
			b5=false;
			break;

		default:
			System.out.println("**Your transection cannot be completed please try after sometime**");
			break;
		}
		}
	}


	public void viewAccountbalance() {
	
System.out.println( "your balance is :" +j.getViewBalance()); 

		
		
	
	

		
	}

}
