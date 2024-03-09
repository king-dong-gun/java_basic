package class01.ex;

public class MovieReviewMain01 {
    public static void main(String[] args) {
        MovieReview inception;
        inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프!!";

        MovieReview aboutTime;
        aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!!";

        MovieReview[] movieReview = new MovieReview[] {inception, aboutTime};

        for (int i = 0; i < movieReview.length; i++) {
            MovieReview movieReviews = movieReview[i];
            System.out.println("영화 제목: " + movieReviews.title + "\n영화 리뷰: " + movieReviews.review);
        }




    }
}
