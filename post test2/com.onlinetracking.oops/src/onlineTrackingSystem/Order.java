package onlineTrackingSystem;

public abstract class Order {	
int orderId;
String orderName;
double orderQuantity;
public void confirm() {
	System.out.println("The order is confirmed");
}
	public void close() {
		System.out.println("The order is closing");
	}
}

