package oop01;

public class ValueData {
    int value;

    void add() {  // ⭐️add() 메소드에서는 static을 붙히지 않는다 -> 뒷 내용에서 계속
        value++;
        System.out.println("숫자 증가 value >> " + value);
    }
}
