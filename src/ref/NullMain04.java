package ref;

public class NullMain04 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 새로운 참조값 할당
        System.out.println("BigData.count = " + bigData.count); // 초기값 0
        System.out.println("BigData.data = " + bigData.data); // 초기값 null

        // NullPointException
        System.out.println("BigData.data.value = " + bigData.data.value);
        // bigData = x001 >> x001.data.value
        // data = x002 >> x002.value >> 최종결과!!
    }
}
