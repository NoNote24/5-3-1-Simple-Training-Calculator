package Exercises;

public class Deadlift extends LowerBodyExercise {
    private Integer OneRepMax;

    public Deadlift(Integer oneRepMax) {
        super(oneRepMax);
    }

    public String printDeadliftW1(){
        return this.getClass().getSimpleName() + this.printWeekOne(this.getOneRepMax());
    }

    public String printDeadliftW2(){
        return this.getClass().getSimpleName() + this.printWeekTwo(this.getOneRepMax());
    }

    public String printDeadliftW3(){
        return this.getClass().getSimpleName() + this.printWeekThree(this.getOneRepMax());
    }

    public String printDeadliftW4(){
        return this.getClass().getSimpleName() + this.printWeekFour(this.getOneRepMax());
    }
}
