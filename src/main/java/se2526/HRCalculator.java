package se2526;

public class HRCalculator {

    public static int calculateMaxHR(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age out of bounds");
        }
        return 220 - age;
    }

    public static String getWorkoutZone(int age, int bpm) {
        int maxHR = calculateMaxHR(age);
        double percent = (double) bpm / maxHR * 100;

        if (percent < 60) return "Below zone";
        else if (percent < 70) return "Fat burn";
        else if (percent < 80) return "Cardio";
        else if (percent < 90) return "Anaerobic";
        else return "Red line";
    }
}
