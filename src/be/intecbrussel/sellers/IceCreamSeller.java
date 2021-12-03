package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {


    Cone orderCone(Flavor[] ballsOrder);
    IceRocket orderIceRocket();
    Magnum orderMagnum(MagnumType type);

}
