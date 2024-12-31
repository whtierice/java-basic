package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        System.out.println("넓이: " + width * height);
        return width * height;
    }

    int calculatePerimeter() {
        System.out.println("둘레 길이: " + (width + height) * 2);
        return (width + height) * 2;
    }

    boolean isSquare() {
        System.out.println("정사각형 여부: " + (width == height));
        return width == height;
    }
}
