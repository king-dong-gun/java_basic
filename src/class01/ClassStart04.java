package class01;

public class ClassStart04 {
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

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + ", 나이: " + students[0].age + ", 점수: " + students[0].grade);
        System.out.println("이름: " + students[1].name + ", 나이: " + students[1].age + ", 점수: " + students[1].grade);
    }
}
