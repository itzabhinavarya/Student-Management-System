import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.*;

public class start{


public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Welcome to Student Management Application");
    System.out.println("-----------------------------------------");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
        System.out.println("<-----PRESS 1 TO ADD STUDENT DETAILS----->");
        System.out.println("<-----PRESS 2 TO DELETE STUDENT DETAILS----->");
        System.out.println("<-----PRESS 3 TO DISPLAY STUDENT DETAILS----->");
        System.out.println("<-----PRESS 4 TO UPDATE STUDENT DETAILS----->");
        System.out.println("<-----PRESS 5 TO EXIT APP----->");
        System.out.println("-----------------------------------------");

        Scanner sc = new Scanner(System.in);
//        InputStreamReader r=new InputStreamReader(System.in);
        
        
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();

        if (choice == 1) {

            // Adding Student Details
        	try{
        		System.out.println();
                System.out.print("Enter Student Name : ");
                String name = br.readLine();

                System.out.print("Enter Student Email : ");
                String email = br.readLine();

                System.out.print("Enter Student Phone No. : ");
                String phone = br.readLine();

                System.out.print("Enter Student City : ");
                String city = br.readLine();
                System.out.println();
                
             // Create Student Object to store student
                
                Student st = new Student(name,email,phone,city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if(answer) {
                	System.out.println();
                	System.out.println("-----------------------------------------");
                	System.out.println("Student Data Inserted Successfully");
                	System.out.println("-----------------------------------------");
                	System.out.println();
                }else {
                	System.out.println();
                	System.out.println("-----------------------------------------");
                	System.out.println("Oooops.....Failed....!!!!!");
                	System.out.println("Please Try Again......");
                	System.out.println("-----------------------------------------");
                	System.out.println();
                }
                
            }catch(Exception err){
                err.printStackTrace();
            }

        } else if (choice == 2) {
        	
        	try {
        		// Code for Deleting the  Student Details
            	System.out.println("Enter Student ID to Delete Record : ");
            	int userID = Integer.parseInt(br.readLine());

            
            	// Delete Student Function Call From StudentDao Class
            	
            	boolean answer = StudentDao.deleteStudent(userID);

            	if(answer) {
                	System.out.println();
                	System.out.println("-----------------------------------------");
                	System.out.println("Student Record Deleted Successfully");
                	System.out.println("-----------------------------------------");
                	System.out.println();
                }else {
                	System.out.println();
                	System.out.println("-----------------------------------------");
                	System.out.println("Something went Wrong....!!!!!");
                	System.out.println("Please Try Again......");
                	System.out.println("-----------------------------------------");
                	System.out.println();
                }
        	}catch(Exception err) {
        		
        		err.printStackTrace();
        		
        	}

        } else if (choice == 3) {
            // Code for Displaying the  Student Details
            
        	boolean answer = StudentDao.showAllStudent();
        	if(answer) {
            	System.out.println();
            	System.out.println("-----------------------------------------");
            	System.out.println("All details are shown as above.....");
            	System.out.println("-----------------------------------------");
            	System.out.println();
            }else {
            	System.out.println();
            	System.out.println("-----------------------------------------");
            	System.out.println("Something went Wrong....!!!!!");
            	System.out.println("Please Try Again......");
            	System.out.println("-----------------------------------------");
            	System.out.println();
            }
        
        
        
        } else if (choice == 4) {
            // Code for Updating the  Student Details
        try {
        	
        	
        	System.out.print("Enter new name of student : ");
        	String newName = br.readLine();
        	System.out.print("Enter new Email of student : ");
        	String newEmail = br.readLine();
        	System.out.print("Enter new Phone no. of student : ");
        	String newPhone = br.readLine();
        	System.out.print("Enter new City of student : ");
        	String newCity = br.readLine();
        	System.out.print("Enter Student ID : ");
        	int userId = Integer.parseInt(br.readLine());
        	
        	Student newSt = new Student(newName,newEmail,newPhone,newCity,userId);
            boolean answer = StudentDao.updateStudentDetails(newSt);
    		
            if(answer) {
            	System.out.println();
            	System.out.println("-----------------------------------------");
                System.out.println("Details Updated Successfully .... ");
            	System.out.println("-----------------------------------------");
            	System.out.println();
            }else {
            	System.out.println();
            	System.out.println("-----------------------------------------");
            	System.out.println("Something went Wrong....!!!!!");
            	System.out.println("Please Try Again......");
            	System.out.println("-----------------------------------------");
            	System.out.println();
            }
        	
        }catch(Exception err) {
        	err.printStackTrace();
        }

            
        } else if (choice == 5) {
        	System.out.println();
        	System.out.println("-----------------------------------------");
            System.out.println("Thankyou for using my application");
            System.out.println("See you soon..... Bye bye");
        	System.out.println("-----------------------------------------");
        	System.out.println();
            break;
        } else {
        	System.out.println();
        	System.out.println("-----------------------------------------");
            System.out.println("Invalid Choice .... ");
        	System.out.println("-----------------------------------------");
        	System.out.println();
        }

    }

}

}
