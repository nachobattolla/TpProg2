
public abstract class User {

    int cuil;
    int phoneNumber;

    public User(int cuil, int phoneNumber) {
        this.cuil = cuil;
        this.phoneNumber = phoneNumber;
    }

    abstract void SelfRecordingOfSymptoms();
}


