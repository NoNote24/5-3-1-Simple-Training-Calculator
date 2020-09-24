package Exercises;

public class MilitaryPress extends UpperBodyExercise {
    private Integer OneRepMax;

    public MilitaryPress(Integer oneRepMax) {
        super(oneRepMax);
    }

    public String printMilitaryPressW1(){
        return this.getClass().getSimpleName() + this.printWeekOne(this.getOneRepMax());
    }

    public String printMilitaryPressW2(){
        return this.getClass().getSimpleName() + this.printWeekTwo(this.getOneRepMax());
    }

    public String printMilitaryPressW3(){
        return this.getClass().getSimpleName() + this.printWeekThree(this.getOneRepMax());
    }

    public String printMilitaryPressW4(){
        return this.getClass().getSimpleName() + this.printWeekFour(this.getOneRepMax());
    }
}
