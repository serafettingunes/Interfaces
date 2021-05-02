package interfaces;

public class CustomerManager {
// javada �st clas� static veremezsin
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {

		this.loggers = loggers;
	}

	public void add(Customer customer) {
		
		Utils.runLoggers(loggers, customer.getFristName());
	}

	public void delete(Customer customer) {
		Utils.runLoggers(loggers, customer.getFristName());
	}
}
