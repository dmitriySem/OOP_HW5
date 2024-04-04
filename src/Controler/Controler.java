package Controler;

import model.Student;
import model.StudyGroup;
import model.Type;
import model.User;
import service.DataService;
import service.GroupService;
import view.StudentView;

import java.util.List;

public class Controler {
    private final DataService dataService = new DataService();
    private final GroupService groupService = new GroupService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void createGroup(String name){
        groupService.createGroup(name, dataService);
    }

    public void getAllGroup() {
        studentView.printGroup(groupService.getGroup());

    }


    public void getAllStudent(){
        List<User> userList = dataService.getStudentList();
        for (User user:userList)
            studentView.printOnConsole(user);
    }
    public void getAllTeacher(){
        List<User> userList = dataService.getTeacherList();
        for (User user:userList)
            studentView.printOnConsole(user);
    }
}
