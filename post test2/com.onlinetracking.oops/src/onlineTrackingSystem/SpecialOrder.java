package onlineTrackingSystem;

public  class SpecialOrder extends Order{
	public SpecialOrder() {
		
	}
	 public SpecialOrder(int orderId,String orderName,double orderQuantity) {
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
@Override
public String toString() {
	return "SpecialOrder [orderId=" + orderId + ", orderName=" + orderName + ", orderQuantity=" + orderQuantity + "]";
}

}
