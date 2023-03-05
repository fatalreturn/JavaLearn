package io.namoosori.java.override;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        //super.draw();
        System.out.println("Drawing Rectangle");
    }
}
