import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "angelonsky92";
        final String url = "jdbc:postgresql://localhost:5432/skypro";


        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            EmployeeDAO employeeDAO = new EmployeeDAOImpl(connection);

            City city = new City(1, "Moscow");


                Employee employee = new Employee(2,"pav", "pavel", "man", 30, city);
                employeeDAO.create(employee);


            List<Employee> list = new ArrayList<>(employeeDAO.readALl());
            list.forEach(System.out::println);
        } catch (SQLException e) {
            System.out.println("что то пошло не так");
        }

    }
        }



