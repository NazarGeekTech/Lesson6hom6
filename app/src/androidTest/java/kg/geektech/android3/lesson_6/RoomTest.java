package kg.geektech.android3.lesson_6;

import android.content.Context;

import androidx.room.Room;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import kg.geektech.android3.lesson_6.data.AppDatabase;
import kg.geektech.android3.lesson_6.data.Student;
import kg.geektech.android3.lesson_6.data.StudentDao;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class RoomTest {

    private AppDatabase database;
    private StudentDao studentDao;

    @Before
    public void setUp() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        database = Room.inMemoryDatabaseBuilder(appContext, AppDatabase.class).build();
        studentDao = database.studentDao();
    }

    @Test
    public void countStudentTest() {
        List<Student> testStudents = StudentRoomHelper.createStudents(4);
        studentDao.insertStudents(testStudents);

        List<Student> dbStudents = studentDao.getStudents();
        assertEquals(dbStudents.size(), testStudents.size());
    }

    @After
    public void clear() {
        database.close();
    }
}
