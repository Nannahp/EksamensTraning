package names;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName){
        String[] nameArray = fullName.split(" ");
        this.firstName = nameArray[0];
        if(nameArray.length>2){
            this.middleName = nameArray[1];
            this.lastName = nameArray[2];
        }
        else this.lastName = nameArray[1];
    }

    @Override
    public String toString() {
        if (middleName == null) {
            return "Full name: " + firstName + " " + lastName;
        }
        else
            return "Full name: " +firstName + " " + middleName + " " + lastName;
    }
}
