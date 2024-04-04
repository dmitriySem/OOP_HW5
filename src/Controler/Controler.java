package Controler;

import model.Student;
import model.Type;
import model.User;
import service.DataService;
import view.StudentView;

import java.util.List;

public class Controler {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }


    public void getAllStudent(){
        List<User> userList = dataService.getFreeStudents();
        for (User user:userList){
            studentView.printOnConsole(user);
        }
    }
}
