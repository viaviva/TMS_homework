package homework.homework7.exercise2;

import java.util.Random;

public class TreatmentPlan {
    private int code;
    Random random = new Random();

    public TreatmentPlan() {
        this.code = random.nextInt(3);
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "TreatmentPlan{" +
                "code=" + code +
                '}';
    }
}
