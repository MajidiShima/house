package abstactInterface;

public abstract class Bird extends AbstrAnimal{


    public Bird(String name) {
        super(name);
    }
    public abstract void fly();


    @Override
    public void eating() {
        System.out.println(getName()+"is packing ");

    }

    @Override
    public void move() {
        System.out.println("I can fly .");
    }
}
