package com.kgfsl.Eight;

import java.util.ArrayList;


class ArrayListExample{
    static ArrayList<Book> li=new ArrayList<Book>();
    public static void main(String args[]){
       
       
        createBook();
        display();
        update();
          display(); 
          delete();
          display();


    } 
public static void createBook(){
    
    Book b1=new Book(1,"soorya","IT");
    
    Book b2=new Book(2,"Subha","ECE");
    

    li.add(b1);
    li.add(b2);
    }

  public static void display(){
    for(Book bo:li)
    {
       System.out.println(bo.id+" "+bo.name+" "+bo.author);
}
  }
public static void update()
{
    Book b3=new Book(3,"priya","ECE");
 li.set(0,b3) ;
}
 public static void delete()
 {
   li.set(li);
 }


  //}


}