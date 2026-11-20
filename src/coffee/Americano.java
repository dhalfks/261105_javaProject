package coffee;

public class Americano extends Coffee {

	private static final int EXTRA_PRICE = 0;
    private final boolean extraWater;

    public Americano(boolean extraWater) {
        super("아메리카노", 3000);
        this.extraWater = extraWater;
    }

    @Override
    public int getPrice() {
        return basePrice + (extraWater ? EXTRA_PRICE : 0);
    }

    @Override
    public String getDescription() {
        return extraWater ? name + "(물 추가)" : name;
    }

}
