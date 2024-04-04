package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    private String name;
    private Teacher teacher;
    private List<User> students;

    public StudyGroup() {

    }

    public StudyGroup(String name, Teacher teacher, List<User> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group: \n" +
                "name='" + name + '\'' +
                "\nteacher=" + teacher +
                "\nstudents:\n" + students +
                '}';
    }
}
