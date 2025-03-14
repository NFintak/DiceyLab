import java.util.ArrayList;

public class Simulation {
    private Integer numOfThrows;
    private Integer sumOfThrows;
    private Integer numOfDice;
    private ArrayList<Integer> diceResults = new ArrayList<>();
    public Dice dice = new Dice();
    public Bins bins = new Bins();

    public Simulation(Integer diceToRoll, Integer numOfThrows) {
        this.dice = dice;
        this.bins = bins;
        this.numOfDice = diceToRoll;
        this.numOfThrows = numOfThrows;
        this.sumOfThrows = 0;
    }

    public Integer runSimulation(Dice dice, Integer numOfThrows) {
        for (int i = 0; i < numOfThrows; i++) {
            Integer currentThrow = dice.tossAndSum();
            sumOfThrows += currentThrow;
            diceResults.add(currentThrow);
        }
        return sumOfThrows;
    }

    public void printResults() {
        StringBuilder stringBuilder = new StringBuilder();
        String finalPrint = stringBuilder.append("***\n")
                .append("Simulation of " + numOfDice + " dice tossed for " + numOfThrows + " times.\n")
                .append("***\n").toString();
        for ( : this.bins)

        //need to work on bins class before adding this in
        //if using a hashMap to make histogram
        //use .toString on the saved throws in the ArrayList and compare it to the key for the
        //hashMap, if it matches, increment the value associated with that key
    }

}


//public static void main(String[] args) {

//}