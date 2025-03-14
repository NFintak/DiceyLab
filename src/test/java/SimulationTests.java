import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulationTests {

    @Test
    public void test1makeBinsFromSim() {
        Simulation testSim = new Simulation(1, 0);
        Integer expected = 6;
        Integer actual = testSim.bins.makeHistogram().size();
    }

    @Test
    public void test1printSImResults() {
        Simulation testSim = new Simulation(1, 0);
        String expected = "***\n" + "Simulation of 1 die tossed for 0 times.\n" + "***\n" + "\n" + "1 :        0: 0.00 \n" + "2 :        0: 0.00 \n" +
                "3 :        0: 0.00 \n" + "4 :       0: 0.00 \n" + "5 :       0: 0.00 \n" + "6 :       0: 0.00 ";
        //String actual = testSim.printResults();
        //assertEquals(expected, actual);
    }

}
