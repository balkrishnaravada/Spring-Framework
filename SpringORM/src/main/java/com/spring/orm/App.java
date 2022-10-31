package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao student=context.getBean("studentDao",StudentDao.class);
      /*  
        Student s1=new Student(101,"Tabish Khan","Thane");
       Student s2=new Student(102,"Ankit Yadav","Mumbai");
       Student s3=new Student(103,"Raj Kadam","Navi Mumbai");
       Student s4=new Student(104,"Supriya Jadhav","Kalyan");
       Student s5=new Student(105,"Shyam Singh","Mumbai");
        int r;
         r=student.insert(s2);
         r=student.insert(s3);
         r=student.insert(s4);
         r=student.insert(s5);
        System.out.println("number of rows inserted: "+r);
        */
        
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go)
        {
        System.out.println("Press 1 for add new Student ");
        System.out.println("Press 2 for display all Students ");
        System.out.println("Press 3 to get detail of single Student ");
        System.out.println("Press 4 for delete Student ");
        System.out.println("Press 5 for update Student ");
        System.out.println("Press 6 for exit ");
        
        try
        {
        	int input=Integer.parseInt(br.readLine());
        	
        	switch(input)
        	{
        	case 1:
        		//add new student
        		System.out.println("Enter Student ID: ");
        		int sId=Integer.parseInt(br.readLine());
        		System.out.println("Enter Student Name: ");
        		String sName=br.readLine();
        		System.out.println("Enter Student City: ");
        		String sCity=br.readLine();
        		
        		Student s1=new Student(sId,sName,sCity);
        		
        		int r=student.insert(s1);
        		System.out.println(r+" Student Added");
        		System.out.println("*********************************************************************************************************");
        		System.out.println();
        		break;
        	case 2:
        		//display all students
        		
        		List<Student> allStudents=student.getALLStudents();
        		
        		for(Student s:allStudents)
        		{
        			System.out.println("Student ID: "+s.getId()+"  Student Name: "+s.getName()+ "   Student City: "+s.getCity());
        		}
        		System.out.println("*********************************************************************************************************");
        		System.out.println();
        		break;
        	
        	case 3:
        		//display single student
        		System.out.println("Enter Student ID: ");
        		int sid=Integer.parseInt(br.readLine());
        		
        		Student s=student.getStudent(sid);
        		System.out.println("Student ID: "+s.getId()+"  Student Name: "+s.getName()+ "   Student City: "+s.getCity());
        		System.out.println("*********************************************************************************************************");
        		System.out.println();
        		
        		break;
        		
        	case 4:
        		//delete student
        		System.out.println("Enter Student ID: ");
        		int studentId=Integer.parseInt(br.readLine());
        		boolean result=student.deleteStudent(studentId);
        		if(result==true)
        		{
        			System.out.println(studentId+" deleted");
        		}
        		break;
        		
        	case 5:
        		//update student
        		System.out.println("Enter Student ID: ");
        		int studId=Integer.parseInt(br.readLine());
        		System.out.println("Enter Student Name: ");
        		String studName=br.readLine();
        		System.out.println("Enter Student City: ");
        		String studCity=br.readLine();
        		
        		Student s2=new Student(studId,studName,studCity);
        		
        		student.updateStudent(s2);
        		System.out.println(" Student Updated");
        		System.out.println("*********************************************************************************************************");
        		System.out.println();
        		break;
        	case 6:
        		//Exit
        		go=false;
        		break;
        		
        	
        	}  	
        	
        }
        catch(Exception e)
        {
        	System.out.println("Entered incorrect input.Press Correct Input(1-6)");
        	System.out.println(e.getMessage());
        }
        }
        System.out.println("Thank you for using our application...see you soon!!!");
    }
}
