package ref;

public class Method01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        initStundent(student1,"학생1", 15, 90 );
        initStundent(student2,"학생2", 16, 80 );

        printStudent(student1);
        printStudent(student2);

    } static void initStundent (Student student, String name, int age, int grade) { //전달한 학생 객체 필드에 값을 설정
        student.name = name;
        student.age = age;
        student.grade = grade;
}
    static void printStudent (Student student) {  // 전달한 학생 객체 필드의 값을 출력
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 점수: " + student.grade);
    }
}

