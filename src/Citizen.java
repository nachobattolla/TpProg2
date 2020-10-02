
import java.util.ArrayList;

public class Citizen extends User {

    boolean isBan;
    ArrayList<Invitation> receivedInvitations;
    ArrayList<FaceToFaceMeeting> acceptedRequest;
    int rejections;

    public Citizen(int cuil, int phoneNumber) {
        super(cuil, phoneNumber);
        this.receivedInvitations = new ArrayList<Invitation>();
        this.acceptedRequest = new ArrayList<FaceToFaceMeeting>();
        this.isBan = false;
        this.rejections = 0;
    }

    public boolean receiveMeetingRequest(){ // aceptar o rechazar invitacion para facetofaceMeeting; - Nacho B

        return true;
    }

    void sendRequest(Citizen sendTo, Invitation invitation){
        sendTo.receivedInvitations.add(invitation);
    }

    public void acceptedRequest(Invitation invitation){
        receivedInvitations.remove(invitation);
        acceptedRequest.add(invitation.meeting);
    }

    public void rejectedRequest(Invitation invitation){
        receivedInvitations.remove(invitation);
        invitation.transmitter.rejections ++;

    }

}
