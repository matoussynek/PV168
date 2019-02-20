/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pv168ex1;

import java.util.Date;

/**
 *
 * @author Matous Synek
 */
enum Gender{
    MALE,FEMALE,
}
public class Person {
    private final String firstName;
    private final String lastName;
    private final Date birth;
    private final Gender gender;
    public Person(String f, String l, Date b, Gender g){
        firstName = f;
        lastName = l;
        birth = b;
        gender = g;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getBirthDate(){
        return birth.getMonth() + "/" + birth.getDay() + "/" + birth.getYear();
    }
    public String getGender(){
        return gender.toString();
    }
    @Override
    public String toString(){
        return lastName +", " + firstName;
    }
}
