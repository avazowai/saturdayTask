package Interface;


import Model.Mentor;
import Model.Student;

public interface MentorInterface {
    Mentor getMentorByName(String name);
    Mentor[] getAllMentors();
    void deleteMentorById(int id);
    String createMentor (Mentor mentor);
    Student updateById (int id, Mentor mentor);
    Student findById (int id);






}
