package com.bootcamp.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.patterns.observer.interfaces.Channel;

public class NewsAgency {
    private String news;
    private List<Channel> channels;
    
    public NewsAgency() {
        channels = new ArrayList<>();
    }
    public void addObserver(Channel channel) {
        channels.add(channel);
    }
    
    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }
    
    public void broadcast(String news) {
        this.news = news;
        for (Channel channel : channels) {
            channel.receive(news);
        }
    }
    
    public String getNews() {
        return news;
    }
    
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        TvChannel tvChannel = new TvChannel();
        DatabaseConnector databaseConnector = new DatabaseConnector();
        
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(tvChannel);
        newsAgency.addObserver(youtubeChannel);
        newsAgency.addObserver(databaseConnector);
        newsAgency.broadcast("Lunch time!");
        
        newsAgency.removeObserver(databaseConnector);
        newsAgency.broadcast("Almost!");
    }
}
