package polymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new ConsoleLogger(),new FileLogger(),new DatabaseLogger(),new EmailLogger()};
//		for (BaseLogger logger:loggers) {
//			logger.log("Log mesajı");
//		}

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}
}
