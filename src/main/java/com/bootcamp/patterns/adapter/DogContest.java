package com.bootcamp.patterns.adapter;

public class DogContest {
    private NewTrick dogWithNewTrick;
    
    public void join(NewTrick dogwithNewTrick){
        this.dogWithNewTrick = dogwithNewTrick;
    }
    
    public void perform() {
        this.dogWithNewTrick.doTrick();
    }
}
