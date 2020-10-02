public class Invitation {
    FaceToFaceMeeting meeting;
    Citizen transmitter;

    public Invitation(FaceToFaceMeeting meeting, Citizen transmitter) {
        this.meeting = meeting;
        this.transmitter = transmitter;
    }
}
