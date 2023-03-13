package homework.homework8.exercise3;

import java.util.ArrayList;

public class Register {
    ArrayList<Contract> register = new ArrayList<>();

    public void saveInRegister(Contract contract)
    {
        register.add(contract);
    }

    public void printInformation(int number)
    {
        register.get(number-1).print();
    }
}