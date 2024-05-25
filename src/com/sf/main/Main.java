package com.sf.main;
import com.sf.beans.Student;



public class Main {
    public static void main(String[] args){
        // get the location of xml
        String xmllocation = "com/sf/resources/ApplicationContext.xml";

        // application context obj
        ApplicationContext context = new FileSystemXmlApplicationContext(fileContext);

        Student std = (Student)context.getBean("StdID");
        std.display();
    }
}
