package Model;

import Enum.GenderName;

public class Student {
    private int id;
    private static int idd;
    private String name;
    private GenderName gender;
    private String email;

    public Student(String name, GenderName gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.id = idd++;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    @Override
    public String toString() {
        return "Model.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
