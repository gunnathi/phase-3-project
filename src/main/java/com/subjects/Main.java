package com.subjects;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {
	
	public static void main(String[] args) {
		
		Curb m2=new Curb();
		String password="admin123";
			//m2.CreateTables();
			boolean again=true;
		      while(again) 
		      {
				System.out.println("**************************************************");
				System.out.println("**************************************************");
				System.out.println("*******Welcome to Sports e-commerce shoes******************");
				System.out.println("**************************************************");
				System.out.println("**************************************************");	          		
			    while(true){
			    	
			    	        System.out.println("Enter username");
			    
			    	        Scanner scan=new Scanner(System.in);
			    	        
			    	       	String u=scan.nextLine();
			    	       	System.out.println("Enter password");
			    	       	String z=scan.nextLine();
			    	       	
			    	       	if(u.equals("admin123") && z.equals(password)) {
			    	       		System.out.println("You have logged in successfully as admin");
			    	       		break;
			    	       		}
			    	       	    
			    	       	else
			    	       		System.out.println("retry again ");
			    }
			    
			    
				
				
		        
		        System.out.println("Please select from the below options"); 
		        System.out.println("--------------------------------------");
		        System.out.println("1.Manage products");
		        System.out.println("2.Manage customers");
				System.out.println("3.See purchase report");
				System.out.println("4.Change login password");
			
				
		        
		        Scanner scan=new Scanner(System.in);
		        int option=scan.nextInt();
		        System.out.flush(); 
		        switch(option)
		        {  
		        	
						 
			             
		        	
		        	case 1:
		        	{
		        		
		                System.out.println("Select from the below options");
						System.out.println("--------------------------------------"); 
		                System.out.println("1.Add products and categorize them");
		                System.out.println("2.Delete the products");
		                System.out.println("3.Update products");
						System.out.println("4.Display Products List");
		                
		        		int option1=scan.nextInt();
		        		
		        		switch(option1)
		        		{
		        			case 1:
			        		{
			        			System.out.println("Enter the product name you want to add");
			        			
			        			System.out.println("Enter product name");	
			        			scan.nextLine();
			        			String ch=scan.nextLine();
			        			
			        			System.out.println("Enter category to which you want to add the product/n "+"1.Sports 2.Casual 3.Boots 4.Indoor"); 		        			
			        			int c=scan.nextInt();
			        			String s1="";
			        			if(c==1) 
			        				s1="Sports";
			        			else if(c==2)
			        				s1="Casual";
			        			else if(c==3)
			        				s1="Boots";
			        			else if(c==4)
			        				s1="Indoor";
  			
			        			System.out.println("Enter colour of the product ");
			        			scan.nextLine();
			        			String h=scan.nextLine();
			        			
			        			System.out.println("Enter size of the product ");
			        			scan.nextInt();
			        			
			        			int q=scan.nextInt();
			        			scan.nextLine();
			        			System.out.println("Enter price of the product ");
			        			scan.nextInt();
			        			
			        			int r=scan.nextInt();
			        			scan.nextLine();
			        			m2.insertProduct(s1, h, ch, q, r);
			        			//m2.listTeachers();
			        			break;		        			
			        		}
			        		
		        			case 2:
			        		{   		        			
			        			m2.listProducts();
			        			System.out.println("Enter Product Id to be deleted from the above list");			        			
			        			scan.nextLine();
			        			int ch=scan.nextInt();			        			
			        			m2.deleteProduct(ch);
			        			break;	
			        		}
			        	        		
			        		case 3:
			        		{        			
			        		    
			        		     m2.updateProducts();
			        		     break;
			        		     
			        		}
							case 4:
							{
			        		    m2.listProducts();
			        		    break;
							}	
						
		        		    default:
			            		System.out.println("Option is invalid");
			            		scan.nextLine();
			            		
			            		break;    
			        		
		        		}
		        		break;
		        		
}
		        	
		        	case 2:
					{
		                System.out.println("Select from the below options");
						System.out.println("--------------------------------------"); 
		                System.out.println("1.Add customers and categorize them");	               	               
						System.out.println("2.Delete the customers");
						System.out.println("3.Update the customers");
						System.out.println("4.Display the customersList");
		                
                       int option2=scan.nextInt();
		        		
		        		switch(option2)
		        		{
		        			case 1:
			        		{
			        			System.out.println("Enter the customer name you want to add");
			        			
			        			System.out.println("Enter customer name");	
			        			scan.nextLine();
			        			String ch=scan.nextLine();
			        			
			        			System.out.println("Enter customer emailid to which you want to add"); 		        			
			        			String z=scan.nextLine();
			        			System.out.println("Enter customer mobilenumber which you want to add"); 		        			
			        			String z1=scan.nextLine();
			        		
			        			
			        			m2.insertCustomer(ch,z1,z);
			        			System.out.println("Updated List of Customers");	
			        			m2.listCustomers();
			        			break;		        			
			        		}
			        		
		        			case 2:
			        		{   		        			
			        			m2.listCustomers();
			        			System.out.println("Enter Customer Id to be deleted from the above list");			        			
			        			scan.nextLine();
			        			int ch=scan.nextInt();			        			
			        			m2.deleteCustomer(ch);
			        			break;	
			        		}
			        	        		
			        		case 3:
			        		{        			
			        		    
			        		     m2.updateCustomers();
			        		     break;
			        		     
			        		}
							case 4:
							{
			        		    m2.listCustomers();
			        		    break;
							}	
						
		        		    default:
			            		System.out.println("Option is invalid");
			            		scan.nextLine();
			            		
			            		break;    
			        		
		        		}
		        		
		        		
		        
		        
		    
		     
		     
	}
		        	case 3:{
		        		      m2.listPurchasesByDate();
		        		      break;
		        			}
		        	
		        	
		        	case 4:{
		        		     password=m2.changepassword();
		        		     
		        			}
		      }
		       
	    		
	    		System.out.println("Do you want to continue again Y or N??");
		        
		        scan.nextLine();
		        String temp=scan.nextLine();
		        if (temp.equalsIgnoreCase("Y"))
		        	again=true;
		        else
		        	again=false;
		      
	}
		      System.out.println("Thanks for using the application");
	    		System.exit(0);
}
}












