package coffee;

public class Mocha extends Coffee {
	private static final int EXTRA_PRICE = 800;
    private final boolean extraChocolate;

    public Mocha(boolean extraChocolate) {
        super("모카", 4500);
        this.extraChocolate = extraChocolate;
    }

    @Override
    public int getPrice() {
        return basePrice + (extraChocolate ? EXTRA_PRICE : 0);
    }

    @Override
    public String getDescription() {
        return extraChocolate ? name + "(초콜릿 추가)" : name;
    }
}
