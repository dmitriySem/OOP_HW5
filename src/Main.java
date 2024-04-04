import Controler.Controler;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        controler.createStudent("Dima", "Semenov", "Vicktorovoch");
        controler.createStudent("Sasha", "Semenov", "Dmitr");
        controler.createTeacher("Natasha", "Semenova", "Nik");
//        controler.getAllStudent();
//        controler.getAllTeacher();

        controler.createGroup("1A");
        controler.getAllGroup();

    }
}
