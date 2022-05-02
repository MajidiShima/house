public class Wall {

    private String direction;

    private int high;
    private int with;
    private int color;

    public Wall(String direction, int high, int with, int color) {
        this.direction = direction;
        this.high = high;
        this.with = with;
        this.color = color;
    }
    public String getDirection(){
        return direction;
    }

    public int getHigh() {
        return high;
    }

    public int getWith() {
        return with;
    }

    public int getColor() {
        return color;
    }
}
