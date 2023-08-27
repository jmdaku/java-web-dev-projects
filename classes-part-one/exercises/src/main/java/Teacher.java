import java.util.ArrayList;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    private void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }
    private void setLastName(String aLastName) {
        lastName = aLastName;
    }
    private void setSubject(String aSubject) {
        subject = aSubject;
    }
    private void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSubject() {
        return subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }


}
