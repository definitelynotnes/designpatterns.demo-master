package com.bootcamp.patterns.observer;

import com.bootcamp.patterns.observer.interfaces.Channel;

public class YoutubeChannel implements Channel{

    @Override
    public void receive(String news) {
        System.out.println("Youtube Channel: " + news);
        
    }

}
