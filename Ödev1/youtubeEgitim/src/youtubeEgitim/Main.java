package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
	/*	CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Aydın");
		
		Person person = new Person();
		person.setFirstName("oğuzhan");
		person.setLastName("pala");
		person.setNatioanlIdendity("");
		
		Company company = new Company();
		company.setTaxNumber("100000");
		company.setCompanyName("Arçelik");
		company.setId(1);
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		CustomerManager customerManager = new CustomerManager(customer); // örneğini oluşturmak,instance oluşturmak
		customerManager.save();
		customerManager.delete();
		*/
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
	}
	
	

}
