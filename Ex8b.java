/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8b;

/**
 *
 * @author shrimeenatchi
 */
public class duplicate {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String : ");
        StringBuffer sd=new StringBuffer();
        String s=obj.next();
        sd.append(s);
        for (int i=0;i<sd.length();i++)
        {
           for (int j=i+1;j<sd.length();j++)
           {
               if (sd.charAt(i)==sd.charAt(j))
               {
                   sd.delete(j, j+1);
               }
           }
        }
        System.out.println("String After Removing the Duplicate Characters : "+sd);
    }
}
