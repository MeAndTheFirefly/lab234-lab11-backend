package camt.se234.lab11.dao;

import camt.se234.lab11.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> students;
    public StudentDaoImpl(){
        students = new ArrayList<>();
        students.add(new Student("123","A","temp",2.33));
        students.add(new Student("5506","James","Talor",5.0));
        students.add(new Student("5035","Andrew","Dope",4.0));
        students.add(new Student("5515","Mark","Xiao",4.0));
        students.add(new Student("5788","Kevin","Space",2.33));
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }
}
