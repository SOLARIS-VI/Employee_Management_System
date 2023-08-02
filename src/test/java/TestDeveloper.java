import static org.junit.Assert.assertEquals;
import org.junit.*;

import TechStaff.Developer;

public class TestDeveloper {
    @Test
    public void testDeveloperGetters() {
        Developer developer = new Developer("Alice Johnson", "EF12345", 55000);

        assertEquals("Alice Johnson", developer.getName());
        assertEquals("EF12345", developer.getNiNumber());
        assertEquals(55000, developer.getSalary(), 0.001);
    }

    @Test
    public void testDeveloperRaiseSalary() {
        Developer developer = new Developer("Alice Johnson", "EF12345", 55000);
        developer.raiseSalary(4000);

        assertEquals(59000, developer.getSalary(), 0.001);
    }

    @Test
    public void testDeveloperPayBonus() {
        Developer developer = new Developer("Alice Johnson", "EF12345", 55000);

        assertEquals(550, developer.payBonus(), 0.001);
    }
}
