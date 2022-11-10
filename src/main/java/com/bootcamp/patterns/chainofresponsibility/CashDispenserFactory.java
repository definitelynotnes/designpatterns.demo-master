package com.bootcamp.patterns.chainofresponsibility;

import com.bootcamp.patterns.chainofresponsibility.interfaces.CashDispenser;

public class CashDispenserFactory {
    private static CashDispenserFactory INSTANCE;
    
    private CashDispenserFactory() {
    }
    
    public static CashDispenserFactory instance() {
        if(INSTANCE == null) {
            INSTANCE = new CashDispenserFactory();
        }
        return INSTANCE;
    }
    
    public CashDispenser getCashDispenser(CashDispenserType type) {
        CashDispenser cashDispender = null;
        switch(type) {
            case ONE_THOUSAND_CASH_DISPENSER:
                cashDispender = new OneThousandCashDispenser();
                break;
                
            case FIVE_HUNDRED_CASH_DISPENSER:
                cashDispender = new FiveHundredCashDispenser();
                break;
                
            case ONE_HUNDRED_CASH_DISPENSER:
                cashDispender = new OneHundredCashDispenser();
                break;
        }
        return cashDispender;
    }
    
}
