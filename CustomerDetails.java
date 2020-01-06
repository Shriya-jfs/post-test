package onlineTrackingSystem;

import java.util.List;
import java.util.ArrayList;

public class CustomerDetails  {
	static List customerList=new ArrayList();
	
	public static void main(String[] args) {
		try {
			Customer customer=new Customer(1,"Riya");
			addCustomerDetails(customer);
			System.out.println(customer);
			findCustomerDetails(1);
			Customer updatedCustomerList=new Customer(1,"Pooja");
			
			System.out.println(updatedCustomerList);
			deleteCustomerDetails(2);
		}
		catch(CustomerException customerException)
		{
			System.out.println(customerException);
		}
	}
	
		public static void addCustomerDetails(Customer customer) {
			try {
				customerList.add(customer);
				System.out.println("Customer details added successfully");
			}
			catch(CustomerException customerException) 
			{
				System.out.println(customerException);
			}
		}
			
			public static void findCustomerDetails(int customerId) {
				
					CustomerDetails customer=(CustomerDetails)customerList.get(customerId);
					if(customer!=null) {
						System.out.println("Found customer");
					
					}
					else {
						System.out.println("Customer not found");
					}
						
				}
			public static void updatedCustomerList(Customer customer) {
				
				if(customer!=null) {
					customerList.add(customer);
					System.out.println("Updated customer list is : " + customer);
				}
				else {
					System.out.println("Update unsuccessful");
				}
		}
			public static void deleteCustomerDetails(int customerId ) {
				CustomerDetails customer=(CustomerDetails)customerList.get(customerId);
				if(customer!=null) {
					customerList.remove(customerId);
					System.out.println("Customer removed");
				}
				else {
					System.out.println("Removal unsuccessful");

			}
	}
}