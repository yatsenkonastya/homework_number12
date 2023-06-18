package MobilePhone;

public class ModelSamsung extends MobilePhone implements Mobile{
    public ModelSamsung(){

    }
    public String message;
    @Override
    public void useInternet(){
        System.out.println("Turn on Internet to use it on Samsung");
    }
    @Override
    public void makePhoto(){
        System.out.println("Open 'Camera' to take a photo on Samsung");
    }
    @Override
    public void messages(){
        this.message = message;
        System.out.println("Open messages menu to send a message from Samsung");
    }
    @Override
    public void calls(){
        System.out.println("Please call to anybody to check a call quality on Samsung");
    }
}
