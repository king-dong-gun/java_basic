package ref.ex;

import java.util.Scanner;

public class ProductOrderMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문하실 수량을 입력하세요 >> ");
        int inPutData = scanner.nextInt();
        scanner.nextLine(); // 버퍼없애기

        ProductOrder[] orders = new ProductOrder[inPutData];
        for (int i = 0; i < orders.length; i++) {
            System.out.println(i+1 + "의 주문정보를 입력하세요.");
            System.out.print("상품명 >> ");
            String productName = scanner.nextLine();
            System.out.print("가격 >> ");
            int price = scanner.nextInt();
            System.out.print("수량 >> ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 버퍼없애기

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액은 " + totalAmount + "원 입니다.");
    }
    // 입력한 상품명, 가격, 갯수를 저장하는 메소드
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    // 저장된 상품명, 가격, 갯수를 리턴하는 메소드
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 갯수: " + order.quantity);
        }
    }
    // 총 가격을 리턴하는 메소드
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
