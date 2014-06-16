import com.atmecs.services.EmployeeService;


public class mainclass {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		try {
			employeeService.passTransferAmount(2, 3, 10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
