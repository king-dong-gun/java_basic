package class01;

public class ClassStrart02 {
    // ClassStart01 배열로 변경

    public static void main(String[] args) {

        String[] studentsNames = {"학생1", "학생2"}; // 학생 이름 배열 생성
        int[] studentAges = {15,16}; // 학생 나이 배열 생성
        int[] studentGrades = {80,90}; // 학생 점수 배열 생성

        for(int i = 0; i < studentsNames.length; i++) {
            System.out.println("이름: " + studentsNames[i] + ", 나이: " + studentAges[i] + ", 성적: " +studentGrades[i]);
        } // 배열은 특정 학생의 인덱스가 제거해야할때 나머지 인덱스들도 정확하게 삭제해주어야 한다.
    }
}
