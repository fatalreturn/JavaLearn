package io.namoosori.java.casting;

public class InheritanceAssist {
    public static void main(String[] args) {
        Shape shape = new Rectangle(); // up-casting
        shape.draw();

        //up-casting이 돼 있다는 전제 하에,
        // 다시 자식 클래스의 참조 변수로 부모 모습을 띄고 있던 그 인스턴스를 돌려놓는 기능
        Rectangle rect = (Rectangle) shape; // down-casting
        rect.draw();
    }
}
