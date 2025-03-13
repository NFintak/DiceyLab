

public class Simulation {
    private Integer numOfThrows;
    private Integer sumOfThrows;
    private Integer numOfDice;
    //private ArrayList<Integer> diceResults = new ArrayList<>();

    public Simulation(Integer diceToRoll, Integer numOfThrows) {
        Dice dice = new Dice(diceToRoll);
        Bins bins = new Bins(diceToRoll, diceToRoll * 6);
        this.numOfDice = diceToRoll;
        this.numOfThrows = numOfThrows;
        this.sumOfThrows = 0;
    }

    public Integer runSimulation(Dice dice, Integer numOfThrows) {
        for (int i = 0; i < numOfThrows; i++) {
            Integer currentThrow = dice.tossAndSum();
            sumOfThrows += currentThrow;
            //diceResults.add(currentThrow);
        }
        return sumOfThrows;
    }

    public void printResults() {
        System.out.println("***\n");
        System.out.println("Simulation of " + numOfDice + " dice tossed for " + numOfThrows + " times.\n");
        System.out.println("***\n");

        //need to work on bins class before adding this in
    }

}


//public static void main(String[] args) {

//}