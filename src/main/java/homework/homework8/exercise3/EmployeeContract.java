package homework.homework8.exercise3;

import java.util.Date;

public class EmployeeContract extends Contract{
    private String nameOfEmployee;
    private Date dateOfEnding;

    public EmployeeContract() {
    }

    public EmployeeContract(String nameOfEmployee, Date dateOfEnding) {
        this.nameOfEmployee = nameOfEmployee;
        this.dateOfEnding = dateOfEnding;
    }

    public EmployeeContract(int numberOfDocument, Date dataOfDocument, String nameOfEmployee, Date dateOfEnding) {
        super(numberOfDocument, dataOfDocument);
        this.nameOfEmployee = nameOfEmployee;
        this.dateOfEnding = dateOfEnding;
    }

    public EmployeeContract(int numberOfDocument, Date dataOfDocument) {
        super(numberOfDocument, dataOfDocument);
    }


    @Override
    public String toString() {
        return "EmployeeContract{" +
                "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", dateOfEnding=" + dateOfEnding +
                "} " + super.toString();
    }

    @Override
    public void print() {
        System.out.println("КОНТРАКТ С СОТРУДНИКОМ\n" +
                super.toString() +
                "\nИмя сотрудника: " + this.nameOfEmployee +
                "\nДата окончания: " + this.dateOfEnding + "\n");
    }
}
