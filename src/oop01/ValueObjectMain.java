package oop01;

public class ValueObjectMain {
    public static void main(String[] args) {

        // 객체 지향 프로그램
        ValueData vData = new ValueData();
        vData.add();  // ValueData 클래스의 메소드도 Main문에서 사용가능
        vData.add();
        vData.add();
        System.out.println("최종 숫자 >> " + vData.value);
    }
}
