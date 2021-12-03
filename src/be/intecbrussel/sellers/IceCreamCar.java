package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;


public class IceCreamCar implements IceCreamSeller {

    PriceList priceList;
    // Stock stock;
    double profit = 0;

    public IceCreamCar(PriceList priceList) {
        this.priceList = priceList;

    }

    @Override
    public Cone orderCone(Flavor[] ballsOrder) {
        return null;
    }

    private Cone prepareCone(Flavor[] ballsPrepare) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    private IceRocket prepareIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        return null;
    }

    private Magnum prepareMagnum(MagnumType type) {
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }

}

