package ir.javacup.toyfactory;

public class Toy {
    private double basePrice;
    private ToySize size;

    public Toy(double basePrice, ToySize size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public ToySize getSize() {
        return size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        if (size == ToySize.SMALL) {
            return basePrice;
        } else if (size == ToySize.MEDIUM) {
            return basePrice * 1.5;
        } else {
            return basePrice * 2;
        }
    }


    public double getPrice(double discount) {
        return getPrice() - (getPrice() * discount / 100);
    }
}
