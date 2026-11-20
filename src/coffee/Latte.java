package coffee;

public class Latte extends Coffee {
	private static final int EXTRA_PRICE = 700;
    private final boolean extraMilk;

    public Latte(boolean extraMilk) {
        super("라떼", 4000);
        this.extraMilk = extraMilk;
    }

    @Override
    public int getPrice() {
        return basePrice + (extraMilk ? EXTRA_PRICE : 0);
    }

    @Override
    public String getDescription() {
        return extraMilk ? name + "(우유 추가)" : name;
    }
}
