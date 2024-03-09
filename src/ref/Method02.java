package ref;

public class Method02 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {  // 객체 생성과 초기값 설정을 위한 메소드
        Student student = new Student();  // 객체 생성
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;  // 호출 반환 >> 메소드 밖에서 돌려줘야하기 때문
    }
    static void printStudent(Student student) {  //
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 점수: " + student.grade);
    }
}


