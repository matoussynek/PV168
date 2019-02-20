/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pv168ex1;

/**
 *
 * @author Matous Synek
 */
public class Student {
    private final Person person;
    private final String id;
    private static long ID_SETTER = 0;
    public Student( Person p){
        person = p;
        id = ++ID_SETTER + "s";
    }
    public Person getPerson(){
        return person;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return id + " - " + person;
    }
}
