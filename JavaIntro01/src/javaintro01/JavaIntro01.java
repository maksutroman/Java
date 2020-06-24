
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author maksu
 */
public class JavaIntro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //System.out.println("Hello word!");
       //JOptionPane.showMessageDialog(null, "Hello World!");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //System.out.println("Enter number => ");
       //System.out.println("Enter second number => ");
       //System.out.println("Result = " + a);
       
       
        //System.out.println("Enter first number => ");
        //int number1 = Integer.parseInt(br.readLine());
        
        
        //System.out.println("Enter second number => ");
        //int number2 = Integer.parseInt(br.readLine());
       
        //if(number1 > number2)
           // System.out.println("number1 > number2");
        //else if(number1 < number2)
            //System.out.println("number1 < number2");
          //else
            //JOptionPane.showMessageDialog(null, "number1 = number2");
        
        //Дано 3 числа. Визначити чи є серед них додатні. (random)
        //int a=3, b=4, c=5;
        //if (a>0&&b>0&&c>0)
            //System.out.println("всі числа додатні");
        //else
            //System.out.println("не всі числа додатні");
        
        
        //Написати програму яка пропонує ввести три оцінки з клавіатури (від 2 до 5) 
        //підраховує середній бал. Якщо середній бал рівний 2, тоді виводиться BAD, 
        //3 - SO-SO, 4 - GOOD, 5 - EXCELLENT. (switch)
        
        //System.out.println("Enter first number => ");
        //int number1 = Integer.parseInt(br.readLine());
        //System.out.println("Enter second number => ");
        //int number2 = Integer.parseInt(br.readLine());
        //System.out.println("Enter therd number => ");
        //int number3 = Integer.parseInt(br.readLine());
        //int res = (number1+number2+number3)/3;
        //switch(res){
           // case 2: System.out.println("BAD" +res); break;
            //case 3: System.out.println("SO-SO" +res); break;
            //case 4: System.out.println("GOOD" +res); break;
            //case 5: System.out.println("EXCELLENT" +res); break;
        
       // }
        
        //Вивести на екран додатні парні числа, які не перевищують 200. - while
       //int x = 0;
        //while(x!=200){
        //System.out.print((x = x + 2) + " ");
       // }
        
        // Написати програму яка обчислює добуток п’яти чисел, які вводяться з клавіатури. - do..while
       // System.out.println("Enter first number => ");
       // int num1 = Integer.parseInt(br.readLine());
        //System.out.println("Enter second number => ");
        //int num2 = Integer.parseInt(br.readLine());
        //System.out.println("Enter 3 number => ");
        //int num3 = Integer.parseInt(br.readLine());
        //System.out.println("Enter 4 number => ");
       // int num4 = Integer.parseInt(br.readLine());
       // System.out.println("Enter 5 number => ");
       // int num5 = Integer.parseInt(br.readLine());
        // int sum2 = 0;
        //do{
       //     sum2 = num1 + num2 + num3 + num4 + num5;
       // }
        //while(sum2 > 0);
          //  System.out.println("Res => " + sum2);
        
        
            
            
                int y = 0;
                int z = 0;
                for(int i = 0; i<10; i++){
                    for(int j = 0; j<=10; j++){
                System.out.println(i + " * " + j  + " = " + i*j);
        if (j==10){
            System.out.println("\n");
        }
                    }
            }
            
            int[]A={1,2,3,4,5};
            int[]b={};
    }
}

