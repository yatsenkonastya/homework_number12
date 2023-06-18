package MobilePhone;

public class MobileCheck {
    public static void main(String[] arg) {
        ModelSamsung mobileOne = new ModelSamsung();
        ModelXiaomi mobileSecond = new ModelXiaomi();

        mobileOne.messages();
        mobileSecond.messages();
        System.out.println("----------------------------");

        mobileOne.useInternet();
        mobileSecond.useInternet();
        System.out.println("----------------------------");

        mobileOne.calls();
        mobileSecond.calls();
        System.out.println("----------------------------");

        mobileOne.makePhoto();
        mobileSecond.makePhoto();
        System.out.println("----------------------------");
    }
}
