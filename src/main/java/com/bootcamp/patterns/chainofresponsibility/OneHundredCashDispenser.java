package com.bootcamp.patterns.chainofresponsibility;

import com.bootcamp.patterns.chainofresponsibility.bean.Cash;
import com.bootcamp.patterns.chainofresponsibility.interfaces.CashDispenser;

public class OneHundredCashDispenser implements CashDispenser{
    private static final int ONE_HUNDRED_NOTE = 100;
    
    private CashDispenser cashDispenser;
    
    @Override
    public void chain(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
        
    }

    @Override
    public void dispense(Cash cash) {
        final int amount = cash.getAmount().intValue();
        if(amount >= ONE_HUNDRED_NOTE) {
            final int numberOfNotes = amount / ONE_HUNDRED_NOTE;
            final int remainingAmountToDispense = amount % ONE_HUNDRED_NOTE;
            
            System.out.println(String.format("Dispensing %sx %s note", numberOfNotes, ONE_HUNDRED_NOTE));
            
            if(remainingAmountToDispense > 0) {
                cashDispenser.dispense(new Cash(remainingAmountToDispense));
            }
        }   else {
            cashDispenser.dispense(cash);
        }
    }

}
