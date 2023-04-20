package model;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class Main {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		//EntityTransaction getTramsaction()
		//begin
		//commit
		//rollback
//EntityTransaction transaction= em.getTransaction();
  //transaction.begin();
  Scanner scannerObj=new Scanner(System.in);
  //reading the employee id
  Employee empObj=null;
  Task taskObj=null;
  Address addressObj=null;
  char choice='A';
  do {
	  em.getTransaction().begin();
	 // System.out.println("Enter task id");
	//	int taskId=Integer.parseInt(scannerObj.nextLine());
		
	  Address address=new Address();
		
		System.out.println("Enter task name");
		String taskName=scannerObj.nextLine();
		
		System.out.println("task location");
		String taskLocation=scannerObj.nextLine();
		
		//scannerObj.next();
		
		taskObj=new Task();
		
		//taskObj.setTaskId(taskId);
		taskObj.setTaskName(taskName);
	taskObj.setAddress(address);
 // System.out.println("enter employee id");
		//int id=Integer.parseInt(scannerObj.nextLine());//1
		
		//reading employee name
		System.out.println("enter employee name");
		String name=scannerObj.nextLine();//bvc
		
		//raeding employee phone
		
		System.out.println("Enter the employee phone number");
		long phone=scannerObj.nextLong();//3455
		//create  first object of employee
		empObj=new Employee();
		//initialize all the properties by calling setter method
		//empObj.setEmpId(id);
		empObj.setEmpName(name);
		empObj.setEmpPhone(phone);
		empObj.setTask(taskObj);
		
		
		//to save the employee object to persistence conetxt 
		//we user void persist(Object obj)
		em.persist(empObj);
		
		//em.persist(taskObj);
		em.getTransaction().commit();
		System.out.println("Enter your choice");
	choice=scannerObj.next().charAt(0);
		
  }while(choice=='y'|| choice=='Y');
		System.out.println("first record of employee inserted");
		
		
		
		
		
		
		
		
		
		
		
System.out.println("connected");
	}

}
