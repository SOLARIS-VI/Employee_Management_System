import static org.junit.Assert.assertEquals;
import org.junit.*;

import Management.Manager;

public class TestManager {
    @Test
    public void testManagerGetters() {
        Manager manager = new Manager("Jane Smith", "CD67890", 60000, "Engineering");

        assertEquals("Jane Smith", manager.getName());
        assertEquals("CD67890", manager.getNiNumber());
        assertEquals(60000, manager.getSalary(), 0.001);
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void testManagerRaiseSalary() {
        Manager manager = new Manager("Jane Smith", "CD67890", 60000, "Engineering");
        manager.raiseSalary(7000);

        assertEquals(67000, manager.getSalary(), 0.001);
    }

    @Test
    public void testManagerPayBonus() {
        Manager manager = new Manager("Jane Smith", "CD67890", 60000, "Engineering");

        assertEquals(600, manager.payBonus(), 0.001);
    }
}
