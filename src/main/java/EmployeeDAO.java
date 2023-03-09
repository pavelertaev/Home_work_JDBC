import java.util.List;

public interface EmployeeDAO {
    void create(Employee employee);

    Employee readByID(int id);

    List<Employee> readALl();
    void updateAge(Employee employee);

    void delete(Employee employee);

}
