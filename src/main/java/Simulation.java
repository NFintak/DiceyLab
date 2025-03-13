public class Simulation {
    private Integer numOfThrows;
    private Integer sumOfThrows;

    public Simulation(Integer diceToRoll, Integer numOfThrows) {
        Dice dice = new Dice(diceToRoll);
        this.numOfThrows = numOfThrows;
        this.sumOfThrows = 0;
    }

    public Integer runSimulation(Dice dice, Integer numOfThrows) {
        for (int i = 0; i < numOfThrows; i++) {
            sumOfThrows += dice.tossAndSum();
        }
        return sumOfThrows;
    }

    public void printResults() {
        //need to work on bins class before adding this in
    }

}


//public static void main(String[] args) {

//}