package com.bootcamp.patterns.observer;

import com.bootcamp.patterns.observer.interfaces.Channel;

public class TvChannel implements Channel{

    @Override
    public void receive(String news) {
        System.out.println("TV Channel: " + news);
        
    }

}
