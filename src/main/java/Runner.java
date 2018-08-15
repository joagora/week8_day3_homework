import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {

        Course courseVicker = new Course("Vicker weaving", LevelType.ADVANCED);
        DBHelper.save(courseVicker);
        Instructor instructorMike = new Instructor("Mike");
        DBHelper.save(instructorMike);
        Lesson lessonWeaving = new Lesson("Introduction to weaving", 3, courseVicker);
        DBHelper.save(lessonWeaving);
        Mentor mentorRobert = new Mentor("Robert");
        DBHelper.save(mentorRobert);
        Student studentRaphael = new Student("Raphael", 28, 2, mentorRobert, courseVicker);
        DBHelper.save(studentRaphael);
    }
}
