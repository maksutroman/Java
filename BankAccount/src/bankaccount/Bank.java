/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class Bank {
    private Account[] accounts;     // all the bank accounts at this bank
    private int numOfAccounts = 2;      // the number of bank accounts at this bank
    public Bank() {
    accounts = new Account[2];
    numOfAccounts = 0;
    }
    public int openNewAccount(String customerName, double openingBalance) {

    Account b = new Account(customerName, openingBalance);
    accounts[numOfAccounts] = b;
    numOfAccounts++;
    return b.getAccountNum();
}
    public void withdrawFrom(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].withdraw(amount);
            System.out.println("Amount withdrawn successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
    }
    public void depositTo(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].deposit(amount);
            System.out.println("Amount deposited successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
}
    public void printAccountInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account number not found.");
}
    public void printAccountInfo(int accountNum, int n) {
    for (int i =0; i<numOfAccounts; i++) {
                        if (accountNum == accounts[i].getAccountNum()  ) {
                            System.out.println(accounts[i].getAccountInfo());
                            return;
                        }
                    }
    System.out.println("Account number not found.");
    }



    
}
