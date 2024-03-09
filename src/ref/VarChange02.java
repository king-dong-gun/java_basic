package ref;

public class VarChange02 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        // 참조값이 같으므로 dataA = dataB 인것을 알수있음
        System.out.println("dataA 참조값 >> " + dataA);
        System.out.println("dataB 참조값 >> " + dataB);
        System.out.println("dataA >> " + dataA.value);
        System.out.println("dataB >> " + dataB.value);
        System.out.println("-------------------------");
        // dataA 변경
        dataA.value = 20;
        System.out.println("dataA 참조값 >> " + dataA);
        System.out.println("dataB 참조값 >> " + dataB);
        System.out.println("dataA >> " + dataA.value);
        System.out.println("dataB >> " + dataB.value);
        System.out.println("-------------------------");

        // dataB 변경
        dataA.value = 30;
        System.out.println("dataA 참조값 >> " + dataA);
        System.out.println("dataB 참조값 >> " + dataB);
        System.out.println("dataA >> " + dataA.value);
        System.out.println("dataB >> " + dataB.value);


    }
}
