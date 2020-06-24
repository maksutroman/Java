/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author maksu
 */
public class Developer {
    protected String name;
    protected String city;
    protected String position;
    protected int age;
    protected int salery;
    protected String[] skills = new String[5];
    
    static class Team{
        public Team(){};
    }
        
        public Developer( String name, String city, String position, int age, int salery){
           this.name = name;
           this.city = city;
           this.position = position;
           this.age = age;
           this.salery = salery;
           this.skills = skills;
           
        }
        
        public Developer() throws IOException{
BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Name: ");
      this.name=buffered.readLine();              
System.out.print("City: ");
      this.city=buffered.readLine();             
 System.out.print("Position: ");
      this.position=buffered.readLine();            
  System.out.print("Salery: ");
this.salery= Integer.parseInt(buffered.readLine());
  System.out.print("Age: ");
this.age= Integer.parseInt(buffered.readLine());
        }
        
        public void DevInfo(){
            System.out.println("Name " + this.name + "\n" + 
                    "City " + this.city + "\n" + 
                    "Position " + this.position + "\n" + 
                    "Age " + this.age + "\n" + 
                    "Salery " + this.salery + "\n");
            //for(int i = 0; i > 5; i++){
            //if (skills[i] != ""){
             //    System.out.println("Skills " + this.skills);
            //}
            //else
            //    System.out.println("No skills");
            //}
        }
        
        public String getName(){
            return this.name;
        }
        
        public String getCity(){
            return this.city;
        }
        
        public String getPosition(){
            return this.position;
        }
        
        public int getAge(){
            return this.age;
        }
        
        public int getSalery(){
            return this.salery;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public void setCity(String city){
            this.city = city;
        }
        
        public void setPosition(String position){
            this.position = position;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setSalery(int salery){
            this.salery = salery;
        }
        
        public void CompareSalery(Developer dev){
           if(this.salery > dev.getSalery()){
               System.out.println(this.name + "higher then" + dev.getName());
           }
           else if(this.salery < dev.getSalery()){
               System.out.println(dev.getName() + "higher then" + this.name);
           }
            else {
               System.out.println(dev.getName() + " = " + this.name);
           }
           
            
        }
}