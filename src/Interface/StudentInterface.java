package Interface;

import Model.Group;
import Model.Student;

public interface StudentInterface {
   Student [] getAllStudents ();
   Student searchStudentByName (String name);
   Student [] sortBystudentName (String ascDesc);
    void deleteGroupById(int id);
    String createStudent (Student student);

}
