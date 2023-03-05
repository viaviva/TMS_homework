package homework.homework7.exercise2;

public class Patient {
    private String name;
    private String doctor;
    private TreatmentPlan treatmentPlan;

    public Patient() {
    }

    public Patient(String name) {
        this.name = name;
        this.treatmentPlan = new TreatmentPlan();
    }

    public void appointment()
    {
        switch (treatmentPlan.getCode())
        {
            case 1:
                doctor = "SURGEON";
                Surgeon.treat();
                break;
            case 2:
                doctor = "DENTIST";
                Dentist.treat();
                break;
            default:
                doctor = "THERAPIST";
                Therapist.treat();
                break;
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", doctor='" + doctor + '\'' +
                ", treatmentPlan=" + treatmentPlan +
                '}';
    }
}
