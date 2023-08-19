package Service;

import Interface.GroupInterface;
import Model.Group;
import Model.Mentor;
import Model.Student;

import java.util.Arrays;

public class MentorService implements GroupInterface {
    @Override
    public void deleteGroupById(int id) {
boolean trueorfalse = false;
        Mentor [] oldMentors = Arrays.copyOf(peaksoft.getMentors(),)
    }

    @Override
    public String createGroup(Group group) {
        return null;
    }

    @Override
    public Student updateById(int id, Group group) {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
