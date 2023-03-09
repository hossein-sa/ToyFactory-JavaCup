package ir.javacup.toyfactory;

public class Car extends Toy {
    public Car(double basePrice, ToySize size) {
        super(basePrice, size);
    }

    @Override
    public double getPrice() {
        if (getSize() == ToySize.SMALL) {
            return getBasePrice() * 2;
        } else if (getSize() == ToySize.MEDIUM) {
            return getBasePrice() * 2.5;
        } else {
            return getBasePrice() * 3;
        }
    }
}
