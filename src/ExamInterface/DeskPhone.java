package ExamInterface;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber){
        this.myNumber=myNumber;
    }


    @Override
    public void powerOn() {

        System.out.println("No action taken ,desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("No ringing " + phoneNumber + " on the deskPhone");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskPhone  ");
            isRinging = false;
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
