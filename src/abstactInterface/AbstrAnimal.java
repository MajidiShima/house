package abstactInterface;

public abstract class AbstrAnimal {
    private String name;

    public AbstrAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eating();

    public abstract void move();
}
