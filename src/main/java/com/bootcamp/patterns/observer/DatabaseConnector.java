package com.bootcamp.patterns.observer;

import com.bootcamp.patterns.observer.interfaces.Channel;

public class DatabaseConnector implements Channel{

    @Override
    public void receive(String news) {
        System.out.println("News successfully saved in the DB.");
        
    }

}
