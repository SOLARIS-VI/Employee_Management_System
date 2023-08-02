import static org.junit.Assert.assertEquals;
import org.junit.*;

import TechStaff.DatabaseAdmin;

public class TestDatabaseAdmin {
    @Test
    public void testDatabaseAdminGetters() {
        DatabaseAdmin dbAdmin = new DatabaseAdmin("Bob Smith", "GH12345", 60000);

        assertEquals("Bob Smith", dbAdmin.getName());
        assertEquals("GH12345", dbAdmin.getNiNumber());
        assertEquals(60000, dbAdmin.getSalary(), 0.001);
    }

    @Test
    public void testDatabaseAdminRaiseSalary() {
        DatabaseAdmin dbAdmin = new DatabaseAdmin("Bob Smith", "GH12345", 60000);
        dbAdmin.raiseSalary(4500);

        assertEquals(64500, dbAdmin.getSalary(), 0.001);
    }

    @Test
    public void testDatabaseAdminPayBonus() {
        DatabaseAdmin dbAdmin = new DatabaseAdmin("Bob Smith", "GH12345", 60000);

        assertEquals(600, dbAdmin.payBonus(), 0.001);
    }
}
