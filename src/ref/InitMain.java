package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("InitData1= " + data.value1); // 맴버 변수는 초기화 하지않으면 자동으로 0으로 초기화
        System.out.println("InitData2= " + data.value2);
    }
}
