package Exercises;

public abstract class Exercise {
    private Integer oneRepMax;

    public Exercise(Integer oneRepMax) {
        this.oneRepMax = oneRepMax;
    }

    public Exercise() {}

    public double getOneRepMax() {
        return oneRepMax;
    }

    public void setOneRepMax(Integer oneRepMax) {
        this.oneRepMax = oneRepMax;
    }

    public abstract double addLevel(double lastOneRepMax);

    public String printWeekOne(double oneRepMax) {
        return  " - Week 1:\t" +
                "5 x " + oneRepMax*0.65 + "kg\t" +
                "5 x " + oneRepMax*0.75 + "kg\t" +
                "5+ x " + oneRepMax*0.85 + "kg\n";
    }

    public String printWeekTwo(double oneRepMax) {
        return  " - Week 2:\t" +
                "3 x " + oneRepMax*0.70 + "kg\t" +
                "3 x " + oneRepMax*0.80 + "kg\t" +
                "3+ x " + oneRepMax*0.90 + "kg\n";
    }

    public String printWeekThree(double oneRepMax) {
        return  " - Week 3:\t" +
                "5 x " + oneRepMax*0.75 + "kg\t" +
                "3 x " + oneRepMax*0.85 + "kg\t" +
                "1+ x " + oneRepMax*0.95 + "kg\n";
    }

    public String printWeekFour(double oneRepMax) {
        return  " - Week 4:\t" +
                "5 x " + oneRepMax*0.40 + "kg\t" +
                "5 x " + oneRepMax*0.50 + "kg\t" +
                "5 x " + oneRepMax*0.60 + "kg\n";
    }
}
