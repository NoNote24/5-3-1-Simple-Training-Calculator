package Exercises;

public class BenchPress extends UpperBodyExercise {
    private Integer OneRepMax;

    public BenchPress(Integer oneRepMax) {
        super(oneRepMax);
    }

    public String printBenchPressW1(){
        return this.getClass().getSimpleName() + this.printWeekOne(this.getOneRepMax());
    }

    public String printBenchPressW2(){
        return this.getClass().getSimpleName() + this.printWeekTwo(this.getOneRepMax());
    }

    public String printBenchPressW3(){
        return this.getClass().getSimpleName() + this.printWeekThree(this.getOneRepMax());
    }

    public String printBenchPressW4(){
        return this.getClass().getSimpleName() + this.printWeekFour(this.getOneRepMax());
    }
}
