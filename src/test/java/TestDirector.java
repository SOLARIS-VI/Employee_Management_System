import static org.junit.Assert.assertEquals;
import org.junit.*;

import Management.Director;

public class TestDirector {
    @Test
    public void testDirectorGetters() {
        Director director = new Director("Mike Johnson", "IJ12345", 80000, "Management", 1000000);

        assertEquals("Mike Johnson", director.getName());
        assertEquals("IJ12345", director.getNiNumber());
        assertEquals(80000, director.getSalary(), 0.001);
        assertEquals("Management", director.getDeptName());
        assertEquals(1000000, director.getBudget(), 0.001);
    }

    @Test
    public void testDirectorRaiseSalary() {
        Director director = new Director("Mike Johnson", "IJ12345", 80000, "Management", 1000000);
        director.raiseSalary(10000);

        assertEquals(90000, director.getSalary(), 0.001);
    }

    @Test
    public void testDirectorPayBonus() {
        Director director = new Director("Mike Johnson", "IJ12345", 80000, "Management", 1000000);

        assertEquals(1600, director.payBonus(), 0.001); // 2% of 80000 = 1600
    }
}
