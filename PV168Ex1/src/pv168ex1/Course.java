/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pv168ex1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Matous Synek
 */
public class Course {
    private final Teacher teacher;
    private final List<Student> students;
    private final String id;
    private final String name;
    private final String room;
    public Course(Teacher t, List<Student> s, String i, String n, String r){
        teacher = t;
        students = s;
        id = i;
        name = n;
        room = r;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public List<Student> getStudents(){
        return Collections.unmodifiableList(students);
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getRoom(){
        return room;
    }
}
