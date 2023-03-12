package homework.homework8.exercise3;

import java.util.Date;

public class FinancialInvoice extends Contract{
    private int finalSum;
    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int finalSum, String departmentCode) {
        this.finalSum = finalSum;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(int numberOfDocument, Date dataOfDocument, int finalSum, String departmentCode) {
        super(numberOfDocument, dataOfDocument);
        this.finalSum = finalSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void print() {
        System.out.println("ФИНАНСОВАЯ НАКЛАДНАЯ\n" +
                super.toString() +
                "\nИтоговая сумма за месяц: " + this.finalSum +
                "\nКод департамента: " + this.departmentCode + "\n");
    }
}
