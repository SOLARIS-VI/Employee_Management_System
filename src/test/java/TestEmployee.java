import static org.junit.Assert.assertEquals;
import org.junit.*;

import Staff.Employee;

public class TestEmployee {
    @Test
    public void testEmployeeGetters() {
        Employee employee = new Employee("John Doe", "AB12345", 50000);

        assertEquals("John Doe", employee.getName());
        assertEquals("AB12345", employee.getNiNumber());
        assertEquals(50000, employee.getSalary(), 0.001);
    }

    @Test
    public void testEmployeeRaiseSalary() {
        Employee employee = new Employee("John Doe", "AB12345", 50000);
        employee.raiseSalary(5000);

        assertEquals(55000, employee.getSalary(), 0.001);
    }

    @Test
    public void testEmployeePayBonus() {
        Employee employee = new Employee("John Doe", "AB12345", 50000);

        assertEquals(500, employee.payBonus(), 0.001);
    }
}
