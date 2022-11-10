package com.bootcamp.patterns.chainofresponsibility;

import java.util.Scanner;

import com.bootcamp.patterns.chainofresponsibility.bean.Cash;
import com.bootcamp.patterns.chainofresponsibility.interfaces.CashDispenser;

public class AutomatedTellerMachine {
    private CashDispenser oneThousandCashDispenser;
    private CashDispenser fiveHundredCashDispenser;
    private CashDispenser oneHundredCashDispenser;
    
    public AutomatedTellerMachine() {
        this.oneThousandCashDispenser = CashDispenserFactory.instance().getCashDispenser(CashDispenserType.ONE_THOUSAND_CASH_DISPENSER);
        this.fiveHundredCashDispenser = CashDispenserFactory.instance().getCashDispenser(CashDispenserType.FIVE_HUNDRED_CASH_DISPENSER);
        this.oneHundredCashDispenser = CashDispenserFactory.instance().getCashDispenser(CashDispenserType.ONE_HUNDRED_CASH_DISPENSER);
        
        this.oneThousandCashDispenser.chain(fiveHundredCashDispenser);
        this.fiveHundredCashDispenser.chain(oneHundredCashDispenser);
    }
    
    public void withdraw(int amount) {
        if(amount % 100 != 0) {
            throw new IllegalArgumentException("Amount should be in multiples of 100s.");
        }
        this.oneThousandCashDispenser.dispense(new Cash(amount));
    }
    
    public static void main(String[] args) {
        AutomatedTellerMachine atm = new AutomatedTellerMachine();
        try {
            Scanner scanner = new Scanner(System.in);
            String reply = "y";
            while (reply.equalsIgnoreCase("y")) {
                System.out.println("Enter amount to dispense: ");
                int amount = scanner.nextInt();
                atm.withdraw(amount);
                System.out.println("Continue (y/n)? ");
                reply = scanner.next();
                System.out.println("-----------------------------");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
