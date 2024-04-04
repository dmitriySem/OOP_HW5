package service;

import model.StudyGroup;
import model.Teacher;
import model.User;

import java.io.Serializable;
import java.util.List;

public class StudyGroupService implements Serializable {

    private StudyGroup group;

    public StudyGroupService(DataService dataService) {
        Teacher teacher = (Teacher) dataService.getFreeTeacchers().get(0);

        this.group = new StudyGroup(teacher, dataService.getFreeStudents());

    }

    public StudyGroup getGroup() {
        return group;
    }
}
