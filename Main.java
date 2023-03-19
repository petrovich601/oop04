import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Drink> drinks = new ArrayList<>(Arrays.asList(new HotDrink("espresso", 42, 70),
                new HotDrink("chocolate", 67, 75),
                new HotDrink("water", 15, 18),
                new HotDrink("tee", 65, 85),
                new HotDrink("1286", 90, 18)));
        vendingMachine.intProduct(drinks);
        System.out.println(vendingMachine.getProduct("1286").toString());


    }
}