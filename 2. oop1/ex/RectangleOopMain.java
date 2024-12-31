package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle ruler = new Rectangle();

        ruler.width = 5;
        ruler.height = 8;

        int area = ruler.calculateArea();

        int perimeter = ruler.calculatePerimeter();

        boolean square = ruler.isSquare();


    }
}
