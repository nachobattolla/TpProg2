
import java.util.ArrayList;

public class Citizen extends User {

    boolean isBlock;
    ArrayList<Request> recivedRequest;
    int counterRequest;

    public Citizen(int cuil, int phoneNumber, boolean isBlock, ArrayList<Request> recivedRequest, int counterRequest) {
        super(cuil, phoneNumber);
        this.isBlock = isBlock;
        this.recivedRequest = recivedRequest;
        this.counterRequest = counterRequest;
    }

    public boolean reciveMeetingRequest(){
        return true;
    }

    @Override
    void SelfRecordingOfSymptoms() {

    }
}
