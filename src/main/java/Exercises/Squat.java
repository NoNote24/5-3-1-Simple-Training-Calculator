package Exercises;

public class Squat extends LowerBodyExercise {
    private Integer OneRepMax;

    public Squat(Integer oneRepMax) {
        super(oneRepMax);
    }

    public String printSquatW1(){
        return this.getClass().getSimpleName() + this.printWeekOne(this.getOneRepMax());
    }

    public String printSquatW2(){
        return this.getClass().getSimpleName() + this.printWeekTwo(this.getOneRepMax());
    }

    public String printSquatW3(){
        return this.getClass().getSimpleName() + this.printWeekThree(this.getOneRepMax());
    }

    public String printSquatW4(){
        return this.getClass().getSimpleName() + this.printWeekFour(this.getOneRepMax());
    }
}
