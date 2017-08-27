import java.util.List;

import com.vikasTutor.model.Customer;
import com.vikasTutor.service.CustomerService;
import com.vikasTutor.service.CustomerServiceImpl;


public class Demo {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		List<Customer> customers = customerService.getAllCustomer();
		System.out.println(customers.get(0).getFirstName());
	}

}
