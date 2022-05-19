package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class DemoApplicationTests {

/*

	@Autowired
	private EmployeeService employeeService;
*/

	@Test
	public void contextLoads() {
	}

	/*@Test //test1
	public void testWhenEmployeeAdded_thenRetrieveEmployeesReturnsSizeOne() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		List<Employee> emp = employeeService.retrieveEmployees();

		// then
		assertEquals(1, emp.size());
	}

	@Test //test2
	public void testWhenEmployeeAdded_thenAnotherAddedThenRetrieveEmployeesReturnsSizeTwo() {
		// given
		Employee employee1 = new Employee();
		employee1.setEmployeeName("Alex");
		employee1.setEmployeeSalary(1000);
		employee1.setEmployeeTitle("dev");
		employeeService.saveEmployee(employee1);
		Employee employee2 = new Employee("Sam", "dev", 1000);
		employeeService.saveEmployee(employee2);

		// when
		List<Employee> emp = employeeService.retrieveEmployees();

		// then
		assertEquals(2, emp.size());
	}

	@Test //test3
	public void testWhenEmployeeAdded_thenRetrieveEmployeesListContainsEmployeeThatWasAdded() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		List<Employee> emp = employeeService.retrieveEmployees();
		for(Employee e : emp){
			System.out.println(e.getEmpId());System.out.println(e.getEmployeeName());System.out.println(e.getEmployeeTitle());System.out.println(e.getEmployeeSalary());
		}

		// then
		assertTrue(emp.contains(employee1));
	}

	@Test //test4
	public void testWhenEmployeeAdded_thenRetrieveEmployeesReturnsSameEmployeeThatWasAdded() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		List<Employee> emp = employeeService.retrieveEmployees();
		for(Employee e : emp){
			System.out.println(e);
		}

		// then
		assertEquals(employee1,emp.get(0));
	}

	@Test //test5
	public void testWhenEmployeeAdded_thenDeleteEmployeeReturnsSizeZero() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		List<Employee> empInRepo = employeeService.retrieveEmployees();
		employeeService.deleteEmployee(empInRepo.get(0).getEmpId());
		List<Employee> emp = employeeService.retrieveEmployees();

		// then
		assertEquals(0, emp.size());
	}


	@Test //test6
	public void testWhenFindByName_thenReturnEmployee() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		List<Employee> empInRepo = employeeService.getEmployeeByName("Alex");

		// then
		assertEquals(employee1,empInRepo.get(0));
	}

	@Test //test6
	public void testWhenFindById_thenReturnEmployee() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		Employee empInRepo = employeeService.getEmployee(1);

		// then
		assertEquals(employee1,empInRepo);
	}

	@Test //test7
	public void testWhenEmployeeAdded_thenUpdateTitleForThatEmployee() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);

		// when
		Employee empInRepo = employeeService.getEmployee(1);
		empInRepo.setEmployeeTitle("test");
		employeeService.updateEmployee(empInRepo);

		// then
		assertEquals("test",empInRepo.getEmployeeTitle());
	}

	@Test //test7
	public void testWhenTwoEmployeesAdded_thenOneEmployeeDeletedCorrectEmployeeWasDeleted() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);
		Employee employee2 = new Employee("Sam", "dev", 1000);
		employeeService.saveEmployee(employee2);

		// when
		employeeService.deleteEmployee(employee1.getEmpId());
		List<Employee> empInRepo = employeeService.retrieveEmployees();

		// then
		assertFalse(empInRepo.contains(employee1));
	}

	@Test //test8
	public void testWhenTwoEmployeesWithSameNameAdded_thenGetEmployeeByNameReturnsListSizeTwo() {
		// given
		Employee employee1 = new Employee("Alex", "dev", 1000);
		employeeService.saveEmployee(employee1);
		Employee employee2 = new Employee("Alex", "test", 2000);
		employeeService.saveEmployee(employee2);

		// when
		List<Employee> emp = employeeService.getEmployeeByName("Alex");

		// then
		assertEquals(2,emp.size());
	}
*/
}
