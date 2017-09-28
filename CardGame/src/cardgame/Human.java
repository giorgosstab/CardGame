/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author gtsax
 */
public abstract class Human 
{    
    String name;
    String surname;
    int age;
    
    public Human(String name,String surname, int age){
        
        this.name = name;
        //set this object's age with the provided age
        this.surname = surname;
        //set this object's height with the provided height
        this.age = age;
    }
    public void setName(String name) {
       this.name = name;
    }

    public String getName() {
       return name;
    }
    public void setSurname(String surname) {
       this.surname = surname;
    }

    public String getSurname() {
       return surname;
    }
    public void setAge(int age) {
       this.age = age;
    }

    public int getAge() {
       return age;
    }
    void introduceSelf()
    {
        
    }

}
