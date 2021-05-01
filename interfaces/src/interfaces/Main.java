package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {
				new DatabaseLogger(),
				new FileLogger()
		};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer osman = new Customer(1,"Osman","Aşar");
		
		customerManager.add(osman);
	}

}
