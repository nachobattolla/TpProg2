import java.util.ArrayList;
import java.util.Date;

public class FaceToFaceMeeting {
    Date start;
    Date finish;
    Citizen[] meeting;

    public FaceToFaceMeeting(Date start, Date finish, Citizen[] meeting){
        this.start = start;
        this.finish = finish;
        this.meeting = meeting;
    }
}
