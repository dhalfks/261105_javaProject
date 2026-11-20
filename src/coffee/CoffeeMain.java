package coffee;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        CoffeeOrderController controller = new CoffeeOrderController(scanner, 10);
        controller.run();
        scanner.close();

	}

}
