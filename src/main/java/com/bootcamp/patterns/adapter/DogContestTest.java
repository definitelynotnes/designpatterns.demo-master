package com.bootcamp.patterns.adapter;

public class DogContestTest {

    public static void main(String[] args) {
        NewTrick labrador = new NewDog();
        DogContest dogContest = new DogContest();
        dogContest.join(labrador);
        dogContest.perform();
        
        NewTrick pom = new FancyDog();
        dogContest.join(pom);
        dogContest.perform();
        
        OldTrick aspin = new Aspin();
        NewTrickAdapter newTrickAdapter = new NewTrickAdapter(aspin);
        dogContest.join(newTrickAdapter);
        dogContest.perform();
    }

}
