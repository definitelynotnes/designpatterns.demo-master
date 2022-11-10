package com.bootcamp.patterns.chainofresponsibility.interfaces;

import com.bootcamp.patterns.chainofresponsibility.bean.Cash;

public interface CashDispenser{
    void chain(CashDispenser cashDispenser);
    void dispense(Cash cash);
}
