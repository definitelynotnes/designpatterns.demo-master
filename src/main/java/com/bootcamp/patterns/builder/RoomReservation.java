package com.bootcamp.patterns.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RoomReservation {
    private int numberOfAdults;
    private int numberOfKids;
    private int numberOfDays;

    public static void main(String[] args) {
        RoomReservation roomReservation = RoomReservation.builder().numberOfAdults(1).numberOfKids(1).numberOfDays(5).build();
    }
}
