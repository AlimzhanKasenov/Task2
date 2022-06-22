package SpringBoot.Task2.DB;

import SpringBoot.Task2.Model.Student;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id = 11L;
    static {
        students.add(new Student(1L, "Maxim", "Reshetnikov", 96, "A"));
        students.add(new Student(2L, "Stas", "Glazynov", 86, "B"));
        students.add(new Student(3L, "Alan", "Kytimyrat", 56, "D"));
        students.add(new Student(4L, "Erlan", "Toibayev", 75, "B"));
        students.add(new Student(5L, "Vasily", "Terkin", 36, "F"));
        students.add(new Student(6L, "Ruslan", "Boranbayev", 77, "B"));
        students.add(new Student(7L, "Aigerim", "Koshegulova", 69, "C"));
        students.add(new Student(8L, "Raigul", "Umiralinova", 66, "C"));
        students.add(new Student(9L, "Asel", "Shakenova", 43, "F"));
        students.add(new Student(10L, "Togzhan", "Sartbayeva", 91, "A"));
    }

    public static ArrayList getListUsers(){
        return students;
    }

    public static void addStudent(String name, String surname, int exam){
        String newMark = "";
        if (exam >= 90){
            newMark = "A";
        }else if (exam >= 75 & exam <= 89){
            newMark = "B";
        }else if (exam >= 60 & exam <= 74){
            newMark = "C";
        }else if (exam >= 50 & exam <= 59){
            newMark = "D";
        }else {
            newMark = "F";
        }
        students.add(new Student(id, name, surname, exam, newMark));
        id++;
    }
}
