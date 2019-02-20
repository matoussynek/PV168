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
public class Teacher {
    private final Person person;
    private final String id;
    private static long ID_SETTER = 0;
    public Teacher( Person p){
        person = p;
        id = ++ID_SETTER + "t";
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
