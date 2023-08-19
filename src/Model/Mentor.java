package Model;

import Enum.GenderName;

public class Mentor {
    private int id;
    private static int idd;
    private String name;
    private GenderName gender;
    private String email;
    private String group;

    public Mentor(String name, GenderName gender, String email, String group) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.group = group;
        this.id=idd++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderName getGender() {
        return gender;
    }

    public void setGender(GenderName gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Model.Mentor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
