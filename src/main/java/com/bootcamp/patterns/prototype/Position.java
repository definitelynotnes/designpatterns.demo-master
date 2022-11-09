package com.bootcamp.patterns.prototype;

public class Position {
    private int x;
    private int y;

    public Position() {
        this(0, 0);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null.");
        }
        this.x = position.getX();
        this.y = position.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Position(this);
    }

    @Override
    public boolean equals(Object otherObject) {
        Position otherPosition = (Position)otherObject;
        if (!(otherObject instanceof Position)) {
            return false;
        }
        return this.getX() == otherPosition.getX() && this.getY() == otherPosition.getY();
    }
}
