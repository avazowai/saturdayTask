package Model;

import Model.Student;

public class PeakSoft {

    private String address;
    private Mentor[] mentors;
    private Group[] groups;
    private Student [] students;


    public PeakSoft( String address, Mentor[] mentors, Group[] groups, Student[] [] Mystudents) {

        this.address = address;
        this.mentors = mentors;
        this.groups = groups;
       Student = new Student [Mystudents.length*Mystudents[0].length];
       int index = 0;

        for (int i = 0; i < Mystudents.length; i++) {
            for (int j = 0; j < Mystudents.length ; j++) {
                student[index]v= Mystudents[i] [j];
                index++;
            }

        }
    }





    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}