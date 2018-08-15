package db;

import models.Lesson;
import models.LevelType;
import models.Student;
import org.hibernate.Session;

public class DBLesson {
    public static void addStudentToLesson(Student student, Lesson lesson) {
        lesson.addStudent(student);
        DBHelper.update(lesson);
    }

}
