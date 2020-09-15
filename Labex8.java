/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex8;

import java.util.Scanner;

/**
 *
 * @author shrimeenatchi
 */
public class Labex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println("Enter a line of integers : ");
        s=obj.nextLine();
        String[] words=s.split("\\s");
        System.out.println("Integers in the String "+s+" are : ");
        for (String i : words)
        {
            System.out.println(i);
        }
        int a[]=new int[20];
        int sum=0;
        for (int i=0;i<words.length;i++)
        {
            a[i]=Integer.valueOf(words[i]);
            sum=sum+a[i];
        }
        System.out.println("Sum of all integers : "+sum);
    }
}
        // TODO code application logic here
    }
    
}
