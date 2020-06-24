/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop;

/**
 *
 * @author maksu
 */
public class Midle extends Junior{
    
    private String rang;
    
    public Midle(String name, String city, String position, int age, int salery, String fixLevel, String WriteCode, String rang) {
        super(name, city, position, age, salery, fixLevel, WriteCode);
        this.rang = rang;
    }
     public void DevInfo(){
            System.out.println("Name " + this.name + "\n" + 
                    "City " + this.city + "\n" + 
                    "Position " + this.position + "\n" + 
                    "Age " + this.age + "\n" + 
                    "Salery " + this.salery + "\n"+ 
                    "Fix level " + this.fixLevel + "\n" +
                    "Write Code " + this.WriteCode + "\n" +
                    "Rang " + this.rang + "\n");
}
}