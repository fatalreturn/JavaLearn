package io.namoosori.graphiceditor.step03;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int)(Math.random() * 3);
            if (randomNumber == 0) {
                shapes[i] = new Rectangle();
            } else if (randomNumber == 1) {
                shapes[i] = new Ellipse();
            } else {
                shapes[i] = new Line();
            }
        }
        //for each 구문 (향상된 for문)
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
