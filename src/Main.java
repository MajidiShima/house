
public class Main {

    public static void main(String[] args) {


        Wall wall1 = new Wall("west", 5, 4, 33);
        Wall wall2 = new Wall("East", 5, 4, 12);
        Wall wall3 = new Wall("south", 5, 4, 33);
        Wall wall4 = new Wall("north", 5, 4, 12);
        Ceiling ceiling = new Ceiling("Modern", "shaya");
        Bed bed = new Bed("clasic", 2, 3, 4, 2);

        Lamp lamp = new Lamp("Zari", true, 125);
        Bedroom bedroom = new Bedroom("shima's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        lamp.gettingRate();

    }
}