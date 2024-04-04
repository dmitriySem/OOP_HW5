package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<User> students;

    public StudyGroup() {

    }

    public StudyGroup(Teacher teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
    }


    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
