package coffee;

import java.util.Scanner;

public class CoffeeOrderController {

	private final Scanner scanner;
    private final Coffee[] orders;
    private int orderCount;

    public CoffeeOrderController(Scanner scanner, int maxOrders) {
        this.scanner = scanner;
        this.orders = new Coffee[maxOrders];
        this.orderCount = 0;
    }

    public void run() {
        while (orderCount < orders.length) {
            System.out.println("\n=== 커피 메뉴 ===");
            System.out.println("1. 아메리카노 (3,000원 / 물 추가 +0원)");
            System.out.println("2. 라떼 (4,000원 / 우유 추가 +700원)");
            System.out.println("3. 모카 (4,500원 / 초콜릿 추가 +800원)");
            System.out.println("0. 주문 완료 및 영수증 출력");
            System.out.print("선택: ");

            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }
            if (menu < 1 || menu > 3) {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("추가 옵션을 넣으시겠습니까? (y/n): ");
            boolean addOption = scanner.next().equalsIgnoreCase("y");

            Coffee coffee = createCoffee(menu, addOption);
            orders[orderCount++] = coffee; // 다형성: Coffee 타입 배열에 자식 객체 저장
            System.out.println("=> " + coffee.getDescription() + " 추가됨");
        }

        printReceipt();
    }

    private Coffee createCoffee(int menu, boolean addOption) {
        return switch (menu) {
            case 1 -> new Americano(addOption);
            case 2 -> new Latte(addOption);
            case 3 -> new Mocha(addOption);
            default -> throw new IllegalArgumentException("잘못된 메뉴입니다.");
        };
    }

    public void printReceipt() {
        System.out.println("\n========== 주문 영수증 ==========");
        if (orderCount == 0) {
            System.out.println("주문한 커피가 없습니다.");
            System.out.println("================================");
            return;
        }

        int totalPrice = 0;
        for (int i = 0; i < orderCount; i++) {
            Coffee coffee = orders[i];
            int price = coffee.getPrice();
            totalPrice += price;
            System.out.printf("%d. %s - %,d원%n", i + 1, coffee.getDescription(), price);
        }

        System.out.println("--------------------------------");
        System.out.printf("총 결제 금액: %,d원 (%d잔)%n", totalPrice, orderCount);
        System.out.println("================================");
    }

}
