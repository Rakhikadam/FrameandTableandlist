package messagelist;

public class msg {
    String message;
    String name;
    String number;
    String mail;

    public msg(String message, String name, String number, String mail) {
        this.message = message;
        this.name = name;
        this.number = number;
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}