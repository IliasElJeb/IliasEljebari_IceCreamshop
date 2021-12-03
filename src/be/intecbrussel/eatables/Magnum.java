package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum() {

    }

    public Magnum(MagnumType magnumType) {
    this.type = magnumType;
    }

    @Override
    public void eat() {
        System.out.println("I am eating a magnum with " + type);
    }

    public MagnumType getType(){
        return type;
    }
}

