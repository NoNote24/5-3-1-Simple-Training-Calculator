package Exercises;

public class LowerBodyExercise extends Exercise {
    private Integer oneRepMax;

    public LowerBodyExercise(Integer oneRepMax) {
        super(oneRepMax);
    }

    public LowerBodyExercise() {
    }

    public double addLevel(double lastOneRepMax) {
        return lastOneRepMax+5;
    }
}
