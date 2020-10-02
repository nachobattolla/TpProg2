public class Administrator extends User {

    public Administrator(int cuil, int phoneNumber) {
        super(cuil, phoneNumber);
    }

    public void banCitizen(Citizen citizen) {
        citizen.isBan = true;
    }

    public void unbanCitizen(Citizen citizen) {
        citizen.isBan = false;
    }

}




