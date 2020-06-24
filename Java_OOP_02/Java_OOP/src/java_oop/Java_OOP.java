/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop;

import java.io.IOException;

/**
 *
 * @author maksu
 */
public class Java_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Developer[] devTeem = new Developer[1];
       // for(int i = 0; i< devTeem.length; i++){
       //     devTeem[i] = new Developer();
       // }
 //  for(int i = 0; i< devTeem.length; i++){
      //      devTeem[i].DevInfo();
     //   }
     
       Developer tom = new Developer("Tom", "ddd", "lll", 25, 3000);
       Developer tom2 = new Developer();
       tom.DevInfo();
//     Junior jun = new Junior("Bil", "ddd", "lll", 25, 3000, "aaaa", "bbbb");
//     jun.DevInfo();
//     Midle mid = new Midle("Dick", "ddd", "lll", 25, 3000, "aaaa", "bbbb", "super");
//     mid.DevInfo();
     //Developer bom = new Developer("Bom", "ddd", "lll", 25, 2000, []);
     //tom.CompareSalery(bom);
    }
    Developer.Team team = new Developer.Team();
}
