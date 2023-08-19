package Interface;

import Model.Group;
import Model.Student;

public interface GroupInterface {

    void deleteGroupById(int id);
    String createGroup(Group group);
    Student updateById (int id, Group group);
    Student findById (int id);
}
