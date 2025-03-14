import java.util.HashMap;


public class Bins {
    private Integer minNum; //minimum number for the bin
    private Integer maxNum; //maximum number for the bin
    private HashMap<Integer, Integer> histogram;//may need to look into hashmap or hashcode more for this one

    public Bins(Integer minNum) {
        this.minNum = minNum;
        this.maxNum = minNum * 6;
        this.histogram = new HashMap<>(this.maxNum - this.minNum);
    }

    public Bins() {
        this.minNum = 1;
        this.maxNum = 6;
        this.histogram = new HashMap<>(this.maxNum - this.minNum);
    }
    //make containers that span from min possible num to max possible num, then -
    //take input and sort it into the container that matches the input
    //if the result of a 2 die roll is 3, add the result to the bin for 3
    //if the result is 8, add it to the bin for 8, etc.

    public HashMap<Integer, Integer> makeHistogram() {
        //for (int i = minNum; i < histogram.length; i++) {
            for (int i = this.minNum; i <= this.maxNum; i++) {
                this.histogram.put(i, 0);
            }
        //}
        return this.histogram;
        //return null;
    }





}
