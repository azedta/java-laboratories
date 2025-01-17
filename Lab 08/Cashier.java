public class Cashier {
	
	private ArrayQueue<Customer> queue = new ArrayQueue<Customer>();
	private Customer currentCustomer;
	private int totalCustomerWaitTime = 0;
	private int customersServed = 0;
	private int totalItemsServed = 0;
	
	public void addCustomer(Customer c) {
		queue.enqueue(c);
	}
	
	public int getQueueSize() {
		return queue.size();
	}
	
	public void serveCustomers(int currentTime) {
		if (queue.isEmpty() && currentCustomer == null) {
			return;
		}
		if (currentCustomer == null) {
			currentCustomer = queue.dequeue();
			totalCustomerWaitTime += currentTime - currentCustomer.getArrivalTime();
		}
		currentCustomer.serve();
		totalItemsServed++;
		if (currentCustomer.getNumberOfItems() == 0) {
			currentCustomer = null;
			customersServed++;
		}
	}
	
	public int getTotalCustomerWaitTime() {
		return totalCustomerWaitTime;
	}
	
	public int getTotalCustomersServed() {
		return customersServed;
	}
	
	public int getTotalItemsServed() {
		return totalItemsServed;
	}
	
	@Override
	public String toString() {
		return String.format("wait time: %d customers served: %d times served: %d%n", totalCustomerWaitTime, customersServed, totalItemsServed);
	}
	

}
