import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO  employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        City moscow = cityDAO.read(4);

        Employee employee = new Employee();
        employee.setCity(moscow);
        employee.setAge(30);
        employee.setGender("pav");
        employee.setFirst_name("er");
        employee.setLast_name("av");

        employeeDAO.create(employee);
        List<Employee> employees= employeeDAO.readALl();
        employees.forEach(System.out::println);
        cityDAO.readAll().forEach(city -> System.out.println(city.getEmployees().stream().map(Employee::getLast_name).toList()));
        employeeDAO.delete(employee);
        employeeDAO.readALl().forEach(System.out::println);
    }
        }



