package homework.homework8.exercise3;

import java.util.Date;

public class PurcahaseContract extends Contract{
    private String typeOfProduct;
    private int numberOfProduct;

    public PurcahaseContract() {
    }

    public PurcahaseContract(String typeOfProduct, int numberOfProduct) {
        this.typeOfProduct = typeOfProduct;
        this.numberOfProduct = numberOfProduct;
    }

    public PurcahaseContract(int numberOfDocument, Date dataOfDocument, String typeOfProduct, int numberOfProduct) {
        super(numberOfDocument, dataOfDocument);
        this.typeOfProduct = typeOfProduct;
        this.numberOfProduct = numberOfProduct;
    }

    @Override
    public void print() {
        System.out.println("\nКОНТРАКТ НА ПОСТАВКУ ТОВАРОВ\n" +
                super.toString() +
                "\nТип товаров: " + this.typeOfProduct +
                "\nКоличествот товара: " + this.numberOfProduct + "\n");
    }
}
