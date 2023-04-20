package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Student;
import utility.JpaUtil;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //calling getEntityManager to get the 
		//object of entity manager
		
		 EntityManager em=JpaUtil.getEntityManager();
	
		 em.getTransaction().begin();
		 char choice='A';
		 Scanner scanner=new Scanner(System.in);
		/* Student student=null;
do
		 {
			System.out.println("Enter name of student");
			String name=scanner.next();
			System.out.println("Enter phone number");
			long phone=scanner.nextLong();
			System.out.println("enter email id");
			String email=scanner.next();
			 System.out.println("do you want to continue y/Y");
			 choice=scanner.next().charAt(0);
			 student=new Student(name, phone, email);
			 em.persist(student);
			 
			 
		 }while(choice=='Y'|| choice=='y');
	System.out.println("fetching student object by primary key");	 
//fetching student object based on key column
	System.out.println("Enter student id");
	long id=scanner.nextLong();
// Object find(class name,primary key value)
   Student stuObj=em.find(Student.class,id);
   System.out.println(stuObj.getStudentId()+ " "+
   stuObj.getStudentEmail()+" "+stuObj.getStudentName() +""+stuObj.getStudentPhone());


   //update the student data
   System.out.println("Enter student id for update phone number");
   long idForUpdate=scanner.nextLong();

   Student stuObj1=em.find(Student.class,idForUpdate);
   System.out.println("Enter new phone number");
   long ph=scanner.nextLong();
   stuObj1.setStudentPhone(ph);
   em.persist(stuObj1);
   
   //remove any object  based on primary key value
   System.out.println("Enter student id for delete");
   long idForDelete=scanner.nextLong();

   Student stuObj2=em.find(Student.class,idForDelete);
   
   em.remove(stuObj2);*/
	//selecting all records from student table
		 System.out.println("All records from student table");
		 
		 //JPQL query
		 /*
		  * JPQL is object oriented version of SQL
		  * JPQL map the query with entities and it's attribute
		  * JPA transfer the JPQL query into SQL query
		  * we can able to fetch , update, insert and delete records using 
		  * JPQL
		  * 
		  * 
		  * select * from Student
		  * createQuery() is the method of EntityManager interface
		  * 
		  */
		 //Query createQuery(String jpql)
		Query query= em.createQuery("select s from Student s");
		//Query is an interface whichcontains many methods
		//List<Object> getResultList()
	List<Student> listOfStudent=	query.getResultList();
	for(Student student:listOfStudent)
	{
		System.out.println(student);
	}
		 
	//select sutentdent_name from student table where s.student_phone=1234
Query query2=	em.createQuery("select s.studentName from Student s where s.studentPhone=:p1");

//setParameter(String parameterName, value as object
  query2.setParameter("p1", 1234567.00);
    List<String> name= query2.getResultList();
		System.out.println("The name is"+ " "+name);
		
		
		//count() sum() avg() max() min()
	Query query3=	em.createQuery("select count(s) from Student s");
	
   //query3.getResultList();
		 
	System.out.println( query3.getResultList());	 
		 
		 
		 
	Query query4=	 em.createQuery("update  Student s set s.studentPhone=:p1 where s.studentId=:p2 ") ;
		 
		   query4.setParameter("p1", 123L);
		   query4.setParameter("p2", 1L);
		   int status =query4.executeUpdate();
		   if(status>0)
		   {
			   System.out.println("updated");
		   }
		 
		 
   em.getTransaction().commit();
		 }

}
