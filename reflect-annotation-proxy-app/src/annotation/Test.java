package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.util.Arrays;

public class Test {

    @org.junit.Test
    public void parseBook(){
         Class c = Book.class;

         if(c.isAnnotationPresent(MyAnnotation.class)){
             MyAnnotation bookk = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
             System.out.println(bookk.value());
             System.out.println(bookk.price());
             System.out.println(Arrays.toString(bookk.authors()));
         }
    }
}
@MyAnnotation(value = "<三毛流浪记>",price = 99.5,authors = "三爷")
class Book{

    @MyAnnotation(value = "变形金刚",price = 599,authors = "威震天")
    public void book1(){

    }
}