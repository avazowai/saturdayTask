package Service;

import Interface.StudentInterface;
import Model.PeakSoft;
import Model.Student;

public class StudentService implements StudentInterface {
    private PeakSoft peaksoft ;


    public StudentService(){
        this.peaksoft = peaksoft;
    }



    @Override
    public Student[] getAllStudents() {
        return new Student[0];
    }

    @Override
    public Student searchStudentByName(String name) {
        return null;
    }

    @Override
    public Student[] sortBystudentName(String ascDesc) {
        return new Student[0];
    }

    @Override
    public void deleteGroupById(int id) {

    }

    @Override
    public String createStudent(Student student) {
        return null;
    }
}
