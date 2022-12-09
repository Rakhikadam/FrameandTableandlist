package calling_List;
//PhonecallActivity class .it is not working.
public class callList {
    String profile;
    String name;
    String number;

    public callList(String profile, String name, int number) {
        this.profile = profile;
        this.name = name;
        this.number = String.valueOf(number);
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
