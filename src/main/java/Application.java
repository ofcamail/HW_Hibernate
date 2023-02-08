import dao.EmployeeDAOImpl;
import model.Employee;
public class Application {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee("Мурашкина", "Мурашка", "w", 33, 2);
        employeeDAO.add(employee1);
        System.out.println(employeeDAO.getById(1));
        employeeDAO.updateEmployee(employee1);

        employeeDAO.getAllEmployee().forEach(System.out::println);
        employeeDAO.deleteEmployee(employeeDAO.getById(2));


    }
}
