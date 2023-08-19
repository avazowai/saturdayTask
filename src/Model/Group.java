package Model;

import Model.Student;

import Enum.GroupNAme;

import java.util.Arrays;

public class Group {
    private GroupNAme name;
    private Student[] students;
    private String count;

    public Group(GroupNAme name, Student[] students, String count) {
        this.name = name;
        this.students = students;
        this.count = count;
    }

    public GroupNAme getName() {
        return name;
    }

    public void setName(GroupNAme name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name=" + name +
                ", students=" + Arrays.toString(students) +
                ", count='" + count + '\'' +
                '}';
    }
}
