/*******************
Name: Benny Fields III

Date: 26 March 2018

Notes: This program creates an array object and 
       displays the data of three employees. The 
       program also asks the user to input employee
       information which then will store it in the
       array. The program will then display all 
       entered employee information by listing them.   
*******************/

/*
Details of Employees for program:

Details of 1 Employee:
Id : 1001
Name : Davis
Age : 40
Salary : 65000
 

Details of 2 Employee:
Id : 1002
Name : McKnight
Age : 35
Salary : 41000

Details of 3 Employee:
Id : 1003
Name : Daniels
Age : 28
Salary : 27000
*/

//Employee.java and start of program

import java.util.Scanner;

class Employee {
	
	int Id;
	String Name;
	int Age;
	long Salary;

	void GetData() {                    // Defining GetData()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id: ");
		Id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Name: ");
		Name = sc.nextLine();
		
		System.out.println("Enter Employee Age: ");
		Age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Employee Salary: ");
		Salary = Integer.parseInt(sc.nextLine());

	}

	void PutData() {                  // Defining PutData()
		  
		  System.out.print("\n" + Id + "\t" + Name + "\t" + Age + "\t" + Salary);  
   
	}

	public static void main(String args[]) {
	  
	      Employee[] Emp = new Employee[3];

	      int i;

	      for(i = 0; i < 3; i++)
	    	  Emp[i] = new Employee();	   // Allocating memory to each object

	      for(i = 0; i < 3; i++) {
	    	  
	    	  System.out.print("\nEnter details of " + (i + 1) + " Employee\n");
	    	  Emp[i].GetData();
	      }

	      System.out.print("\nDetails of Employees\n");
	      
	      for(i = 0; i < 3; i++)
	    	  Emp[i].PutData();

	}

}