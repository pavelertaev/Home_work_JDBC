import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO  employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee("pav","ert","men",30,1);

        employeeDAO.create(employee1);
        employeeDAO.readALl().forEach(System.out::println);
        employeeDAO.delete(employee1);
        employeeDAO.updateAge(employee1);
    }
        }



