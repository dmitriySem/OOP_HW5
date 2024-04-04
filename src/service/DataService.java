package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();
//    private List<User> freeStudents = new ArrayList<>();
//    private List<User> freeTeacchers = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (type == Type.STUDENT)
            userList.add(new Student(firstName, secondName, lastName, id));
        if (type == Type.TEACHER)
            userList.add(new Teacher(firstName, secondName, lastName, id));
    }

    public List<User> getStudentList(){
        List<User> result = new ArrayList<>();
        for (User user:userList){
            if (user instanceof Student)
                result.add(user);
        }
        return result;
    }

    public List<User> getTeacherList(){
        List<User> result = new ArrayList<>();
        for (User user:userList){
            if (user instanceof Teacher)
                result.add(user);
        }
        return result;
    }

//    private void removeUsers(List<User> users){
//        if (users.isEmpty())
//            System.out.println("User list is empty");
//
//        if(freeStudents.isEmpty() && !userList.isEmpty())
//            freeStudents.addAll(userList);
//        freeStudents.removeAll(users);
//    }
//
//    public List<User> getFreeStudents(){
//        return freeStudents;
//    }
//
//    public List<User> getFreeTeacchers() {
//        return freeTeacchers;
//    }

    private  int getFreeId(Type type){

        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user:userList){
            if (user instanceof Teacher && !itsStudent)
                lastId = ((Teacher) user).getTeacherId() +1;
            if (user instanceof Student && itsStudent)
                lastId = ((Student) user).getStudentId() +1;
        }
        return lastId;

    }
}
