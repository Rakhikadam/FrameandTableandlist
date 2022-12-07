package table;

public class tableist {
    String Rollno;
    String name;
    String colour;

    public tableist(String rollno, String name, String colour) {
        Rollno = rollno;
        this.name = name;
        this.colour = colour;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
