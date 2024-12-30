package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String[] StdName = {"학생1", "학생2"};
        int[] StdAge = {15, 16};
        int[] StdScore = {90, 80};

        for (int i = 0; i < StdName.length; i++) {
            System.out.println("이름: " + StdName[i] + " 나이: " + StdAge[i] + " 성적: " + StdScore[i]);
        }

    }
}
