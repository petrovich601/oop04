import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Drink> implements Vending{
    private List<T> drinks = new ArrayList<>();

    public void intProduct(List<T> drinks) {
        this.drinks = drinks;
    }
    public HotDrink getProduct(String name){
        for (Drink p : drinks) {
            if (p.getDrink().equals(name)){
                return (HotDrink) p;
            }
        }
        return new HotDrink("product is  undefined", 0, 0);

    }

    @Override
    public void intProduct() {

    }

}