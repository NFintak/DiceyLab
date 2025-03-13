import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class DiceTests {

    @Test
    public void test1throwWithTwoDice() {
        Dice dice = new Dice(2);
        Integer actualNumber = dice.tossAndSum();
        assertTrue(1 < actualNumber);
        assertTrue(actualNumber < 13);
    }

    @Test
    public void test2throwWithFiveDice() {
        Dice dice = new Dice(5);
        Integer actualNumber = dice.tossAndSum();
        assertTrue(4 < actualNumber);
        assertTrue(actualNumber < 31);
    }

}
