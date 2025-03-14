import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BinTests {

    @Test
    public void test1makeHistogram() {
        Bins testBin = new Bins(2);
        Integer expected = 11;
        Integer actual = testBin.makeHistogram().size();
        assertEquals(expected, actual);
    }


}
