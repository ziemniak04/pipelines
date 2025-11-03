import org.junit.jupiter.api.Test;
import se2526.HRCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HRCalculatorTest {

    @Test
    public void testValidMaxHR() {
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }

    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }

    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }
    @Test
    public void testWorkoutZone_Below() {
        assertEquals("Below zone", HRCalculator.getWorkoutZone(30, 100));
    }

    @Test
    public void testWorkoutZone_FatBurn() {
        assertEquals("Fat burn", HRCalculator.getWorkoutZone(30, 120));
    }

    @Test
    public void testWorkoutZone_Cardio() {
        assertEquals("Cardio", HRCalculator.getWorkoutZone(30, 140));
    }

    @Test
    public void testWorkoutZone_Anaerobic() {
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(30, 160));
    }

    @Test
    public void testWorkoutZone_RedLine() {
        assertEquals("Red line", HRCalculator.getWorkoutZone(30, 190));
    }

}
