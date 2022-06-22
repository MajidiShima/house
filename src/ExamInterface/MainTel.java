package ExamInterface;

public class MainTel {
    public static void main(String[] args) {
        ITelephone shimasPhone;
        shimasPhone = new DeskPhone(123456);
        shimasPhone.powerOn();
        shimasPhone.callPhone(123456);
        shimasPhone.answer();

        shimasPhone=new mobilePhone(12454);
        shimasPhone.powerOn();
        shimasPhone.callPhone(12454);
        shimasPhone.answer();


    }
}
