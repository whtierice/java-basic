package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // final 변수는 최초 한번만 할당 가능
        // data1 = 20;

        // final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류

    }

    static void method(final int parameter) {
        // parameter = 20; // 컴파일 오류
        // 매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
    }
}
