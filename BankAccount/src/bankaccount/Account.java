/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class Account {
    // 1. What variables make up a bank account?

    private String name; // every bank account has a name
    private double balance; // every bank account has money	
    private String accountNum;
    Scanner in = new Scanner(System.in);

    public void openNewAccount() {
        System.out.println("Enter a customer name");
        name = in.next();
        System.out.println("Enter a opening balance");
        balance = in.nextDouble();
        System.out.print("Enter Account No: ");
        accountNum = in.next();
    }

    public void printAccountInfo() {
        System.out.println("Account number : " + accountNum + " \nName" + name + " \nBalance: " + balance);
    }

    public void withdraw() {
        long amounntwidthraw;
        System.out.println("Enter Amount U Want to withdraw : ");
        amounntwidthraw = in.nextLong();
        if (balance >= amounntwidthraw) {
            balance = balance - amounntwidthraw;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }

    }

    /**
     * Method: Deposit ------------------------- Puts money into the bank
     * account!
     */
    public void deposit() {

        long amountdepos;
        System.out.println("Enter Amount U Want to Deposit : ");
        amountdepos = in.nextLong();
        balance = balance + amountdepos;
    }

    boolean search(String account) {
        if (accountNum.equals(account)) {
            printAccountInfo();
            return (true);
        }
        return (false);
    }
//	public boolean transfer(BankAccount other, double amount) {
//		if(this.money >= amount) {
//			this.money -= amount;
//			other.money += amount;
//			return true;
//		}
//		return false;
//	}
//	
//	/**
//	 * Method: To String
//	 * -------------------------
//	 * Returns a string that contains the bankAccounts info (except password)
//	 */
//	public String toString() {
//		String str = "";
//		String dollarFormat = String.format("%10.2f", this.money).trim();
//		str = this.name + ": $" + dollarFormat;
//		return str;
//	}
//
//	/**
//	 * Method: Check Password
//	 * -------------------------
//	 * Returns true if the given password matches the actual password.
//	 */
//	
//    
}
