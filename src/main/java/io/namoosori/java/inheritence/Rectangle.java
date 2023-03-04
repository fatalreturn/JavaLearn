package io.namoosori.java.inheritence;

public class Rectangle extends Shape {
    private int width;
    private int height;
    Rectangle r = new Rectangle();
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
