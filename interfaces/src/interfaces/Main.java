package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new EmailLogger(),new DatebeseLogger (),new FileLogger()};
		
		CustomerManager cm=new CustomerManager(loggers );
		Customer engin=new Customer(1,"Engin","demiroð");
		
		cm.add(engin);

	}

}
