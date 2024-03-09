package ref;

public class VarChange {
    public static void main(String[] args) {
        // a = 10
        int a = 10;
        int b = a;
        System.out.println("a >> " + a);
        System.out.println("b >> " + b);
        // a = 20 변경
        a = 20;
        System.out.println("a 변경 >> " + a);
        System.out.println("a >> " + a);
        System.out.println("b >> " + b);
        // b = 30 변경
        b = 30;
        System.out.println("b 변경 >> " + b);
        System.out.println("a >> " + a);
        System.out.println("b >> " + b);
        // a -> b 대입
        b = a;
        System.out.println("a >> " + a);
        System.out.println("b >> " + b);




    }


}
