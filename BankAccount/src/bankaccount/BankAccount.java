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
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int user_choice;
        Account[] account = new Account[2];
        do {
            //display menu to user
            //ask user for his choice and validate it (make sure it is between 1 and 6)
            System.out.println();
            System.out.println("1. Open a new bank account to all costomers");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display All\\n");

            System.out.println("0. Quit");
            System.out.println();
            System.out.print("Enter choice [1-5]: ");
            user_choice = in.nextInt();
            switch (user_choice) {
                case 1:
                    for (int i = 0; i < account.length; i++) {
                        account[i] = new Account();
                        account[i].openNewAccount();
                    }
                    System.out.println("Account was created and it has the following number: ");
                    break;
                case 2:
                    System.out.print("Enter Account No : ");
                    String accountNum = in.next();
                    boolean found = false;
                    for (int i = 0; i < account.length; i++) {
                        found = account[i].search(accountNum);
                        if (found) {

                            account[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No : ");
                    accountNum = in.next();
                    found = false;
                    for (int i = 0; i < account.length; i++) {
                        account[i].search(accountNum);
                        if (found) {
                            account[i].withdraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 4:
                    System.out.println("Enter a account number");
                    accountNum = in.next();
                    found = false;
                    for (int i = 0; i < account.length; i++) {
                        account[i].search(accountNum);
                        if (found) {
                            account[i].printAccountInfo();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 5:
                    for (int i = 0; i < account.length; i++) {
                        account[i].printAccountInfo();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:

                    System.out.println("Wrong choice.");
                    break;
            }

        } while (user_choice != '6');
    }

}
