package ref;

public class NullMain03 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("BigData.count = " + bigData.count); // 초기값 0
        System.out.println("BigData.data = " + bigData.data); // 초기값 null

        // NullPointException
        System.out.println("BigData.data.value = " + bigData.data.value);
        // ex >> bigData 참조값이 x001이라고 하면 참조값에 data=null를 대입해 <x001.null>이 되기 때문에 NullPointException
    }
}
