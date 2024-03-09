package ref;

public class NullMain02 {
    public static void main(String[] args) {
        Data data = null; // Data data = new Data();
        data.value = 10; //NullPointException 예외발생 >> 여기서 밖으로 빠져나감
        System.out.println("1. data = " + data.value); // data에는 null이 들어있다.
    }
}
