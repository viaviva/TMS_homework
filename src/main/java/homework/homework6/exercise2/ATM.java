package homework.homework6.exercise2;

public class ATM
{
    int twenty;
    int fifty;
    int hundred;

    public ATM() {
    }

    void getMoney(int twenty, int fifty, int hundred)
    {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
        System.out.println("деньги приняты успешно!");
    }

    void giveMoney(int twenty, int fifty, int hundred)
    {

        this.twenty -= twenty;
        this.fifty -= fifty;
        this.hundred -= hundred;
        System.out.println("деньги снялись успешно! \n 100 X " + hundred + "\n50 X " + fifty + "\n20 X " + twenty);
    }

    int sum()
    {
        return twenty * 20 + fifty * 50 + hundred * 100;
    }

    int restOfMoney(int number, int value)
    {
        return number * value;
    }

    int division(int rest, int value)
    {
        return rest / value;
    }

    boolean dispenseMoney(int money)
    {
        int numOfTwenty;
        int numOfFifty;
        int numOfHundred;
        int rest = money;

        if (sum() != 0 && money <= sum() && money != 0)
        {
            numOfHundred = division(rest, 100);
            rest -= restOfMoney(numOfHundred, 100);
            numOfFifty = division(rest, 50);
            rest -= restOfMoney(numOfFifty, 50);
            numOfTwenty = division(rest, 20);
            rest -= restOfMoney(numOfTwenty, 20);

            if (rest != 0)
            {
                return false;
            }
            else
            {
                giveMoney(numOfTwenty, numOfFifty, numOfHundred);
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}
