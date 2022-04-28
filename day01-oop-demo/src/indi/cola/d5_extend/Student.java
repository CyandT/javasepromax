package indi.cola.d5_extend;

public class Student extends People{
      public void searchId(){
          System.out.println(super.getName());
          System.out.println(getName()+"成绩为89");
      }
}
