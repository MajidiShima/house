public class bedroom {
    private String name;
    private wall wall1;
    private wall wall2;
    private wall wall3;
    private wall wall4;
    private ceiling ceiling;
    private bed bed;
    private  lamp lamp;


    public bedroom(String name, wall wall1, wall wall2, wall wall3, wall wall4, ceiling ceiling, bed bed, lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }




    public String getName() {
        return name;
    }

    public wall getWall1() {
        return wall1;
    }

    public wall getWall2() {
        return wall2;
    }

    public wall getWall3() {
        return wall3;
    }

    public wall getWall4() {
        return wall4;
    }

    public ceiling getCeiling() {
        return ceiling;
    }

    public bed getBed() {
        return bed;
    }

    public lamp getLamp() {
        return lamp;
    }

    public void makeBed(){

        System.out.println("Bedroom -> make");
        bed.make();

    }
}

