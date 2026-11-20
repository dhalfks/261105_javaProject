package coffee;

abstract class Coffee {
	protected String name;
    protected int basePrice;

    public Coffee(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract int getPrice();

    public abstract String getDescription();
}
