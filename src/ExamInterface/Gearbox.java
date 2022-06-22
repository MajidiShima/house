package ExamInterface;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;//chi mige
    private int maxGear;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);//chera intori shpde
        this.gears.add(neutral);
        for (int i=0;i<maxGear;i++){
            addGear(i,i*5.3);
        }

    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }


    public void addGear(int number, double ratio) {

        if ((number > 0) && (number <= maxGear)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }


    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + "selected. ");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    private class Gear {   //this is inner Class;
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);

        }

    }


}
