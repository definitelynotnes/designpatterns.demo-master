package com.bootcamp.patterns.adapter;

public class NewTrickAdapter implements NewTrick{
    private OldTrick dogWithOldTrick;

    public NewTrickAdapter(OldTrick dogWithOldTrick) {
        this.dogWithOldTrick = dogWithOldTrick;
    }
    @Override
    public void doTrick() {
        this.dogWithOldTrick.doTrick();
        
    }
}
