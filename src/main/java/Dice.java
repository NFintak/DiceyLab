import java.util.Random;

public class Dice {
    private Integer numOfDice;
    private Integer sumOfCurrentThrow;
    private final java.util.Random randomNumber = new java.util.Random();


    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;
        this.sumOfCurrentThrow = 0;
    }

    public Integer tossAndSum() {
        for (int i = 0; i <= numOfDice; i++) {
            Integer currentRoll = randomNumber.nextInt(5) + 1;
            sumOfCurrentThrow += currentRoll;
        }
        return sumOfCurrentThrow;
    }

}
