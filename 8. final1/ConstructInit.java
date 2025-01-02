package final1;

public class ConstructInit {

    // 멤버변수에 final을 사용할 경우 해당 필드는 생성자를 통해서 한번만 초기화될 수 있음.
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
