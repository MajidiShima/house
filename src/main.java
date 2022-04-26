// TODO: 4/26/2022 Use CamelCase for the names of your Classes (Use Shift + F6)
public class main {
    public static void main(String[] args) {


        wall wall1 = new wall("west", 5, 4, 33);
        wall wall2 = new wall("East", 5, 4, 12);
        wall wall3 = new wall("south", 5, 4, 33);
        wall wall4 = new wall("north", 5, 4, 12);
        ceiling ceiling = new ceiling("Modern", "shaya");
        bed bed = new bed("clasic", 2, 3, 4, 2);

        lamp lamp = new lamp("Zari", true, 125);
        bedroom bedroom = new bedroom("shima's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        lamp.gettingRate();

    }
}