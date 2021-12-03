package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamAppV2 {

    public static void main(String[] args) {

        PriceList priceList = new PriceList(3.30, 2.20, 1.29);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList);

        Flavor[] balls = {Flavor.MOKKA, Flavor.STRACIATELLA, Flavor.VANILLA};

        Cone cone = iceCreamSeller.orderCone(balls);
        Magnum magnum = iceCreamSeller.orderMagnum(MagnumType.MILKCHOCOLADE);
        IceRocket iceRocket = iceCreamSeller.orderIceRocket();

        Eatable[] eatable = {cone, magnum, iceRocket};
        for (Eatable value : eatable) {
            value.eat();
        }

        System.out.println(iceCreamSeller.getProfit());

    }

}


