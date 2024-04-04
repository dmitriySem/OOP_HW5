package service;

import model.StudyGroup;
import model.Teacher;
import model.User;


public class GroupService {

    private StudyGroup group;


    public void createGroup(String name, DataService dataService){
        Teacher teacher = (Teacher) dataService.getTeacherList().get(0);
        this.group = new StudyGroup(name, teacher, dataService.getStudentList());
    }

    public StudyGroup getGroup() {
        return group;
    }
}
