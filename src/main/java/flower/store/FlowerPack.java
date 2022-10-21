package flower.store;

import lombok.Getter;

public class FlowerPack {
    @Getter
    private Flower flower;
    private int quantity;

    FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
