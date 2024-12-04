package lu.uni.programming1;
// https://coast.uni.lu/teaching-material/programming/illustrations/associations-case-study#14
// craftdocs://open?blockId=D508A7A0-E1FB-43E3-9B33-8E68BC1FD5D9&spaceId=0871f15a-0a50-391d-26fc-752863c2eeac

import java.math.BigDecimal;

public class Launcher {

	public static void main(String[] args) {
		Customer groot = new Customer("Groot", new Address("Main Str.", 4321, "X.ord"));
		Article selfieToaster = new Article("selfie toaster", new BigDecimal("22.99"));
		Article inflatableToast = new Article("inflatable toast", new BigDecimal("0.79"));
		Article toastDispenser = new Article("toast dispenser", new BigDecimal("79.50"));
		OrderItem[] items = new OrderItem[] {
			new OrderItem(inflatableToast.getId(), 10),
			new OrderItem(selfieToaster.getId(), 1),
			new OrderItem(toastDispenser.getId(), 2, 10)
		};
		Order order = new Order(groot, items);

		System.out.println(order);
	}

}
