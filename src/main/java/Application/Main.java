package Application;

import Exercises.BenchPress;
import Exercises.Deadlift;
import Exercises.MilitaryPress;
import Exercises.Squat;
import sun.util.calendar.BaseCalendar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;

public class Main {
    private static Deadlift deadlift = new Deadlift(68);
    private static Squat squat = new Squat(57);
    private static MilitaryPress militaryPress = new MilitaryPress(26);
    private static BenchPress benchPress = new BenchPress(38);

    public static void main(String[] args) {
        deadlift.setOneRepMax((int) deadlift.addLevel(deadlift.getOneRepMax()));
        squat.setOneRepMax((int) squat.addLevel(squat.getOneRepMax()));
        militaryPress.setOneRepMax((int) militaryPress.addLevel(militaryPress.getOneRepMax()));
        benchPress.setOneRepMax((int) benchPress.addLevel(benchPress.getOneRepMax()));


        Date date = new Date();
        String path = "./src/main/out/Trainingsplan" +
                date.getTime() +
                ".txt";
        File file = new File(path);

        try {
            PrintWriter printWriter = new PrintWriter(file);
            // 1 RMs
            printWriter.println("*** One Rep Maxes ***");
            printWriter.println(deadlift.getClass().getSimpleName() + ": " + deadlift.getOneRepMax());
            printWriter.println(squat.getClass().getSimpleName() + ": " + squat.getOneRepMax());
            printWriter.println(militaryPress.getClass().getSimpleName() + ": " + militaryPress.getOneRepMax());
            printWriter.println(benchPress.getClass().getSimpleName() + ": " + benchPress.getOneRepMax() + "\n");

            System.out.println("Printed your 1REMS...");

            // Week 1
            printWriter.println("*** Week 1 ***");
            printWriter.print(deadlift.printDeadliftW1());
            printWriter.print(squat.printSquatW1());
            printWriter.println("Hip Thrust: ");
            printWriter.println("Adductors: ");
            printWriter.println();
            printWriter.print(militaryPress.printMilitaryPressW1());
            printWriter.print(benchPress.printBenchPressW1());
            printWriter.println("Rows: ");
            printWriter.println("Lat Pulls: ");
            printWriter.println("\n");

            // Week 2
            printWriter.println("*** Week 2 ***");
            printWriter.print(deadlift.printDeadliftW2());
            printWriter.print(squat.printSquatW2());
            printWriter.println("Hip Thrust: ");
            printWriter.println("Adductors: ");
            printWriter.println();
            printWriter.print(militaryPress.printMilitaryPressW2());
            printWriter.print(benchPress.printBenchPressW2());
            printWriter.println("Rows: ");
            printWriter.println("Lat Pulls: ");
            printWriter.println("\n");

            // Week 3
            printWriter.println("*** Week 3 ***");
            printWriter.print(deadlift.printDeadliftW3());
            printWriter.print(squat.printSquatW3());
            printWriter.println("Hip Thrust: ");
            printWriter.println("Adductors: ");
            printWriter.println();
            printWriter.print(militaryPress.printMilitaryPressW3());
            printWriter.print(benchPress.printBenchPressW3());
            printWriter.println("Rows: ");
            printWriter.println("Lat Pulls: ");
            printWriter.println("\n");

            // Week 4
            printWriter.println("*** Week 4 ***");
            printWriter.print(deadlift.printDeadliftW4());
            printWriter.print(squat.printSquatW4());
            printWriter.println("Hip Thrust: ");
            printWriter.println("Adductors: ");
            printWriter.println();
            printWriter.print(militaryPress.printMilitaryPressW4());
            printWriter.print(benchPress.printBenchPressW4());
            printWriter.println("Rows: ");
            printWriter.println("Lat Pulls: ");
            printWriter.println("\n");

            System.out.println("Yay! Printed your training plan to file! Enjoy your workout;-)");

            printWriter.close();
        } catch (Exception e) {
            System.out.println("Whoopsie!");
        }
    }

}
