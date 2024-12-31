package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가(오버로딩)
    MemberConstruct(String name, int age) {
        this(name, age, 0);
    }


    // 이하 생성자

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출\nname=" + name + " , age=" + age + " ,grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
