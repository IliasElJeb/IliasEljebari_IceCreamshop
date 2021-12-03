package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;


public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }


    public double getMagnumStandardPrice() {

        return magnumStandardPrice;
    }

    public double getMagnumPrice(MagnumType type) {
        switch (type) {
            case ALPINENUTS:
                return getMagnumStandardPrice() * 1.5;
            case BLACKCHOCOLADE:
                return getMagnumStandardPrice() * 1.2;
            case WHITECHOCHOLADE:
                return getMagnumStandardPrice() * 1.3;
            case ROMANTICSTRAWBERRIES:
                return getMagnumStandardPrice() * 2.0;
            default:
                return getMagnumStandardPrice();
        }
    }

}
