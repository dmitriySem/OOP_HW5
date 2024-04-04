package view;

import model.Student;
import model.StudyGroup;
import model.User;

public class StudentView {
    public void printOnConsole(User student){
        System.out.println(student);
    }

    public void printGroup(StudyGroup group){
        System.out.println(group);
    }

}
