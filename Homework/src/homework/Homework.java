/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Task 1"); 
        /////////////Task 1/////////////////////////////////
        //1. Дано одновимірний масив. Знайти найбільший 
        //та найменший елементи масиву та поміняти їх у масиві місцями. (random)
         int[] arr = new int[10];    
         int minIndex = 0, maxIndex = 0;
         
         for (int i = 0; i < arr.length; i++){
             arr[i] = (int)(Math.random() * 50 + 1);
         }
    
         for (int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
         }
         int max = arr[0], min = arr[0];
         System.out.println();        
          for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
            if(arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);
        System.out.println("Min ind: " + minIndex + "\nMax ind: " + maxIndex);
                
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
            
        for (int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
         } 
        System.out.println("\nTask 2");    
        //////////////Task 2////////////////////////
        //2.Дано одновимірний масив. Знайти суму елементів
        //з непарними індексами. (random)
        int[] mass = new int[10]; 
        int sum = 0;
         for (int i = 0; i < mass.length; i++){
             mass[i] = (int)(Math.random() * 10 + 1);
         }
    
         for (int i = 0; i < mass.length; i++){
             System.out.print(mass[i] + " ");
             if (i%2==1)
             {
                 sum+=mass[i];
             }
         }
          System.out.print("\nSum = " + sum);
          System.out.println("\nTask 3");    
        //////////////Task 3////////////////////////
        //3. Дано 2 одновимірних масиви(А і В) по К елементів кожен.
        //Утворити третій масив(С) із К * 2 елементів, переписуючи у нього 
        //спочатку всі елементи масиву А по порядку, а потім елементи масиву В. (random)
        int k = 15;
        int[] massA = new int[k]; 
        int[] massB = new int[k]; 
         for (int i = 0; i < massA.length; i++){
             massA[i] = (int)(Math.random() * 50 + 1);
         }
         System.out.println("\nMass A");  
         for (int i = 0; i < massA.length; i++){
             System.out.print(massA[i] + " ");
         }
          System.out.println("");  
         for (int i = 0; i < massB.length; i++){
             massB[i] = (int)(Math.random() * 50 + 1);
         }
         System.out.println("Mass B");
         for (int i = 0; i < massB.length; i++){
             System.out.print(massB[i] + " ");
         }
         int[] massC = new int[k*2];
         for (int i = 0; i < massA.length; i++){           
                 massC[i]=massA[i];                       
         }
          for (int j = massA.length; j < massC.length; j++){                       
                 massC[j]=massB[j-massA.length];                             
         }
         System.out.println("\nMass C");
         for (int i = 0; i < massC.length; i++){
             System.out.print(massC[i] + " ");
         }
         
    }
    
}
