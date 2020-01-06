package onlineTrackingSystem;

public class NormalOrder extends Order {
	public NormalOrder() {
		
	}
	 public NormalOrder(int orderId,String orderName,double orderQuantity) {
			this.orderId=orderId;
			this.orderName=orderName;
			this.orderQuantity=orderQuantity; 

	 }
	
	public void confirm() {
		System.out.println("The order is confirmed");
	}
	
	public void close() {
		System.out.println("The order is closing");
	}
	
	public void dispatch() {
		System.out.println("The order has been dispatched");
	}
	
	public void recieve() {
		System.out.println("The order has been recieved by the customer");
	}
	@Override
	public String toString() {
		return "NormalOrder [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity
				+ "]";
	}
	
}