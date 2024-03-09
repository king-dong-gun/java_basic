package class01;

public class ClassStart03 {
    public static void main(String[] args) {

        // Student 클래스를 기반으로한 student1, student2 객체 생성
        Student student1; // Student 타입을 받을 변수 선언
        student1 = new Student(); // 인스턴스 or 객체 >> student1는 Student 클래스에서 나온 인스턴스!!!!
        student1.name = "학생1";  // student1 객체의 name 맴버변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student(); // 인스턴스 or 객체
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        System.out.println(student1); // student1에 저장 되어있는 참조값
        System.out.println(student2); // student1에 저장 되어있는 참조값 // @ 앞은 클래스, 패키지 정보, @ 뒤는 16진수 참조값

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 점수: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 점수: " + student2.grade);
    }
}
