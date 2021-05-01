package inharitance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer customer = new IndividualCustomer();
		customer.id = 1;
		customer.firstName = "Osman";
		customer.lastName = "Aşar";
		customer.identity = "213123123213";
		customer.customerNumber = "sadsfwef";
		
		CorparateCustomer cor = new CorparateCustomer();
		cor.id = 2;
		cor.customerNumber = "sad";
		cor.companyName = "ONC";
		cor.taxNumber = "cxvvxcv";
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber = "sendika1";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {customer,cor,sendika};
		
		customerManager.addMultiple(customers);
	}

}
