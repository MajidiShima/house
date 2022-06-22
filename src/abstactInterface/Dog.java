package abstactInterface;

public class Dog extends AbstrAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eating() {
        System.out.println(getName()+"  i eating");

    }

    @Override
    public void move() {
        System.out.println(getName()+ "  i can move ");
    }
}
