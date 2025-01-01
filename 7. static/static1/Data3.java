package static1;

public class Data3 {
    public String name;
    public static int count; // static 클래스 내에서 여러개의 인스턴스에서 같은 값으로 사용하기 위한 공용 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
