/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.*;

/**
 *
 * @author Daljit
 */
class Student{

public String name;
public int roll;

public Student(String name,int roll)
{
    this.name = name;
    this.roll = roll;
}
 public String getDetails() {
       return
               "name = " + this.name + '\n' +
                       "roll number = " + this.roll + '\n';
   }

}

public class calculateArea {
public static void main(String[] args) {
       List<Integer> random = new ArrayList<Integer>();
       random.add(1);
       random.add(2);
       random.add(3);
       random.add(4);
       random.add(5);
       random.add(6);

       iterate(random);
   }

   public static void iterate(List<Integer> num) {
   ListIterator<Integer> it = num.listIterator(num.size());
   while(it.hasPrevious()) {
       if(it.hasPrevious()) {
           System.out.println(it.previous());
       }
       it.previous();
   }
}

  
}

