package ref;

public class NullMain {
    public static void main(String[] args) {
        InitData data = null;
        System.out.println("data= " + data);

        data = new InitData();
        System.out.println("data= " + data); // 참조값 반환

        data = null;
        System.out.println("data= " + data);

    }
}
