package Exercises;

public class UpperBodyExercise extends Exercise {
    private Integer oneRepMax;

    public UpperBodyExercise(Integer oneRepMax) {
        super(oneRepMax);
    }

    public UpperBodyExercise() {
    }

    public double addLevel(double lastOneRepMax) {
        return lastOneRepMax+2.5;
    }
}
