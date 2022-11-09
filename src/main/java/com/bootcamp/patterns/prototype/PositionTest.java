package com.bootcamp.patterns.prototype;

public class PositionTest {

    public static void main(String[] args) {
        try {
            Position originalPosition = new Position(8, 88);
            Position clonedPosition = (Position)originalPosition.clone();

            System.out.println("originalPosition: " + originalPosition);
            System.out.println("clonedPosition: " + clonedPosition);
            System.out.println("== " + (originalPosition == clonedPosition));
            System.out.println("equals() " + (originalPosition.equals(clonedPosition)));

        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
