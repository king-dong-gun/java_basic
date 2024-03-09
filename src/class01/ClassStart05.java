package class01;

public class ClassStart05 {
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

        Student[] students = new Student[]{student1, student2}; // new Stuedent[] 생략 가능

        for (int i = 0; i < students.length; i++) {

            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 점수: " + students[i].grade);
        }
        for (int i = 0; i < students.length; i++) {
            Student student = students[i]; // students 배열 객체를 student 변수에 저장
            System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 점수: " + student.grade);
        }
        for (Student student : students) {  // 향상된 for 문   >>>  단축키 iter
            System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 점수: " + student.grade);
        }
    }
}
