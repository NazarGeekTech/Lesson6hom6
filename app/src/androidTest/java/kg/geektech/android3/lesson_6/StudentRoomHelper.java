package kg.geektech.android3.lesson_6;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.android3.lesson_6.data.Student;

public class StudentRoomHelper {
    public static List<Student> createStudents(int count) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            studentList.add(
                new Student("Student_" + i)
            );
        }
        return studentList;
    }
}
