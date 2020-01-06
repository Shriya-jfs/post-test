package onlineTrackingSystem;

public class Customer   {
	public int customerId;
	public String customerName;
	
	
	public Customer(int customerId,String customerName) {
		super();
		this.customerId=customerId;
		this.customerName=customerName;
	}

	


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

}
