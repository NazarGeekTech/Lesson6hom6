package kg.geektech.android3.lesson_6.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert
    void insertStudent(Student student);

    @Insert
    void insertStudents(List<Student> students);

    @Query("SELECT * FROM Student")
    List<Student> getStudents();
}
