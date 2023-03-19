

class HotDrink extends Drink {

    int temperature;

    public HotDrink(String drink, int cost, int temperature) {
        super(drink, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + drink + '\'' +
                ", cost=" + cost + ", temperature=" +
                temperature + '}';
    }

}