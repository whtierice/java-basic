package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] movies = {inception, aboutTime};

        for (int i = 0; i < movies.length; i++) {
            System.out.println("영화 제목: " + movies[i].title + ", 리뷰: " + movies[i].review);
        }
    }
}