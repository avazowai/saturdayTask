import Model.Group;
import Model.Mentor;
import Model.PeakSoft;
import Model.Student;
import Service.GroupService;
import Service.MentorService;
import Service.StudentService;
import Enum.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        Student student = new Student ("Davran", GenderName.MALE,"Davran@");
        Student student2 = new Student ("Ainazik", GenderName.FEMALE,"Ainazik@");

        Student [] stud1 = {student,student2};

        Student student3 = new Student ("Mahmud", GenderName.MALE,"Mahmud@");
        Student student4 = new Student ("Almaz", GenderName.MALE,"Almaz@");

        Student [] stud2 = {student3,student4};

        Student student5 = new Student ("Mai", GenderName.MALE,"Mai@");
        Student student6 = new Student ("Nur", GenderName.MALE,"Nur@");

        Student [] stud3 = {student3,student4};

        Student student7 = new Student ("Madina", GenderName.FEMALE,"MAdina@");
        Student student8 = new Student ("Aigul", GenderName.FEMALE,"Aigul@");

        Student [] stud4 = {student7,student8};


        Group group1 = new Group(GroupNAme.JAVA11,stud1,"000");
        Group group2 = new Group(GroupNAme.JAVA10,stud2,"000");
        Group group3 = new Group(GroupNAme.JAVA9,stud3,"000");
        Group group4 = new Group(GroupNAme.JAVA8,stud3,"000");

        Group [] groupp = {group1,group2,group3};

        PeakSoft peaksoft = new PeakSoft(
                "vostok5",
                new Mentor[]{
                        new Mentor("Zulipa",GenderName.FEMALE,"zuli@gmail.com",group1),
                        new Mentor("Aidana",GenderName.FEMALE,"aidanaMentor@gmail.com",group2),
                        new Mentor("Bilal",GenderName.FEMALE,"bilalMentor@gmail.com",group3),
                        new Mentor("Kandybek",GenderName.MALE,"kandybekMentor@gmail.com",group4)},

        StudentService studentService = new StudentService(Peaksoft);
        MentorService mentorService = new MentorService(PeakSoft);
        GroupService groupService = new GroupService(PeakSoft);
        System.out.println(Arrays.toString(studentService.getAllStudents()));



    }
}
