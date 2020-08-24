package com.subjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.customers.Customers;
import com.products.Products;
import com.purchase.Purchase;


public class Curb {
	
	public void CreateTables() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
				
		Products p1 = new Products("Sports", "black", "Nike",8 ,670);
		Products p2 = new Products("Sports", "white", "Jordon",9 ,1000);
		Products p3 = new Products("Sports", "grey", "NBA",7 ,540);
		Products p4 = new Products("Sports", "red", "Adidas",6 ,670);
		Products p5 = new  Products("Casual", "red", "Fila",4 ,670);
		Products p6 = new Products("Casual", "black", "Puma",10 ,670);
		Products p7 = new Products("Casual", "white", "VanHeusen",9 ,1000);
		Products p8 = new Products("Casual", "grey", "USPolo",7 ,540);
		Products p9 = new Products("Boots", "marron", "Bokkasin",4 ,670);
		Products p10 = new  Products("Boots", "red", "Miller",4 ,1250);
		Products p11 = new Products("Boots", "pink", "Adibas",8 ,670);
		Products p12 = new Products("Boots", "gold", "N99",9 ,1000);
		Products p13 = new Products("Indoor", "grey", "DasAuto",7 ,45877);
		Products p14 = new Products("Indoor", "silver", "Nissan",4 ,6570);
		Products p15 = new  Products("Indoor", "brown", "NBSports",4 ,574);
		Products p16 = new  Products("Indoor", "red", "GreyNicolos",4 ,670);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		session.save(p6);
		session.save(p7);
		session.save(p8);
		session.save(p9);
		session.save(p10);
		session.save(p11);
		session.save(p12);
		session.save(p13);
		session.save(p14);
		session.save(p15);
		session.save(p16);
		
		
		
		Customers te1 = new Customers("Pardhu","9490246965", "saraldevi124.id");
	    Customers te2 = new Customers("gopinath", "9490212345", "gopina345.id");
		Customers te3 = new Customers("lasya", "9090246964", "lasya456.id");
		Customers te4 = new Customers("sweety", "6490246935", "swettu000.id");
		Customers te5 = new Customers("divya", "7490246925", "divya2111.id");
		Customers te6 = new Customers("rishitha", "8490245965", "ri98.id");
		Customers te7 = new Customers("deepu", "9190243965", "de09.id");
		Customers te8 = new Customers("kavya", "9290206965", "kavya543.id");
		Customers te9 = new Customers("swetha", "9390226965", "swetha654.id");
		Customers te10 = new Customers("vivek", "8550226965", "vivek.id");
		Customers te11 = new Customers("kattula", "9190243965", "de09.id");
		Customers te12 = new Customers("bojja", "9540206965", "bojja.id");
		Customers te13 = new Customers("chilipi", "9356226965", "chilipi.id");
		Customers te14 = new Customers("tulasi ","85503626965", "tulasi.id");
		
		
		session.save(te1);
		session.save(te2);
		session.save(te3);
		session.save(te4);
		session.save(te5);
		session.save(te6);
		session.save(te7);
		session.save(te8);
		session.save(te9);		
		session.save(te10);
		session.save(te11);
		session.save(te12);
		session.save(te13);
		session.save(te14);
		
		
		//Purchase( String purchaseDate, Products products, Customers customers)
	
		
		  Purchase s1=new Purchase("1-07-2020",p1,te1);
		  Purchase s2=new Purchase("5-07-2020",p2,te2);
		  Purchase s3=new Purchase("11-07-2020",p3,te3);			  
		  Purchase s4=new Purchase("15-07-2020",p4,te4);		  
		  Purchase s5=new Purchase("20-07-2020",p5,te5);
	      Purchase s6=new Purchase("18-07-2020",p6,te6);
		  Purchase s7=new Purchase("15-08-2020",p7,te7); 		
		  Purchase s8=new Purchase("16-08-2020",p8,te8);
		  Purchase s9=new Purchase("21-08-2020",p9,te9);
		  Purchase s10=new Purchase("23-08-2020",p10,te10);
		  Purchase s11=new Purchase("25-08-2020",p11,te11); 		
		  Purchase s12=new Purchase("19-08-2020",p12,te12);
		  Purchase s13=new Purchase("17-08-2020",p13,te13);
		  Purchase s14=new Purchase("29-08-2020",p14,te14);
		
  
   	  
		  
		  
		  
		  session.save(s1); 
	  session.save(s2); session.save(s3); session.save(s4);
		  session.save(s5); session.save(s6); session.save(s7); session.save(s8);
		  session.save(s9);session.save(s10);	session.save(s11); session.save(s12);
		  session.save(s13);session.save(s14);	  	 	  	 	
		
		  
		 
			

		transaction.commit();
		session.close();
		factory.close();
	}
	

/*---------------------------------------- INSERTS --------------------------------------*/
	
	public void insertProduct(String category, String colour, String productName, int size, int price) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Products te1 = new Products(category, colour, productName,size,price);
		session.save(te1);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
	public void insertCustomer(String customerName, String cusPhoneNum,String cusEmailId) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Customers te1 = new Customers(customerName, cusPhoneNum, cusEmailId);
		session.save(te1);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
/*---------------------------------------- DELETES --------------------------------------*/
	public void deleteProduct(int ProductId) 
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			String q1 = "DELETE from products WHERE ProductId = '" + ProductId +"'";
			
			
            int x = statement.executeUpdate(q1); 
			
            System.out.println("Updates products list is below");
			this.listProducts();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	
	
	public void deleteCustomer(int customerId) 
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			String q1 = "DELETE from customers WHERE customerId = '" + customerId +"'";
			
			
            int x = statement.executeUpdate(q1); 
			
            System.out.println("Updates customers list is below");
			this.listCustomers();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	
	/*----------------------------------------Lists --------------------------------------*/
	public void listProducts()
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select ProductId,Category,ProductName,colour,price,size from products";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\nProducts Details are : ");
			System.out.println("-----------------------------");
			System.out.print("ProductId\t"+" Category\t"+" ProductName\t"+" colour\t"+" size\t"+" price\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("ProductId")+"\t\t"+resultSet.getString("Category")+"\t\t"+resultSet.getString("ProductName")+"\t\t"+resultSet.getString("colour")+"\t\t"+resultSet.getInt("size")+"\t\t"+resultSet.getInt("price")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	
	public void listCustomers()
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select customerId,cusEmailId,cusPhonenum,customerName from customers";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\nCustomers Details are : ");
			System.out.println("-----------------------------");
			System.out.print("customerId\t"+" cusEmailId\t"+" cusPhonenum\t"+" customerName\t"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("customerId")+"\t\t"+resultSet.getString("cusEmailId")+"\t\t"+resultSet.getString("cusPhonenum")+"\t\t"+resultSet.getString("customerName")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	public void listPurchasesByDate()
	{
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			
			System.out.println("Enter To Date from which you want to see purchase orders");
			Scanner scan=new Scanner(System.in);
			String d=scan.nextLine();
			System.out.println("Enter the category  which you want to filter out");
			String y=scan.nextLine();
			
			//Step3
			Statement statement=connection.createStatement();
			
			
			String sql="SELECT * FROM ((purchase INNER JOIN products ON Products.ProductId=Purchase.products_ProductId) INNER JOIN customers ON Customers.customerId=Purchase.customers_customerId ) WHERE Purchase.purchaseDate>='"+d+"' AND Products.Category='"+y+"' ORDER BY Purchase.purchaseDate ASC";
			
		
				
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			//System.out.println("Query executed");
			
			//Step5
			System.out.println("-----------------------------");
			System.out.println("\nPurchase details are : ");
			System.out.println("-----------------------------");
			System.out.print("PurchaseId\t"+" Purchasedate\t"+" ProductId\t"+" ProductName\t"+"Category\t"+"Colour\t"+"Price\t"+"Size\t"+"customerId\t"+"cusEmailId\t"+"cusPhoneNum\t"+"customerName"+"\n");
			while(resultSet.next()) {
				
				System.out.print(resultSet.getInt("PurchaseId")+"\t\t"+resultSet.getString("purchaseDate")+"\t\t"+resultSet.getInt("ProductId")+"\t\t"+resultSet.getString("ProductName")+"\t\t"+resultSet.getString("Category")+"\t\t"+resultSet.getString("colour")+"\t\t"+resultSet.getInt("price")+"\t\t"+resultSet.getInt("size")+"\t\t"+resultSet.getInt("customerId")+"\t\t"+resultSet.getString("CustomerName")+"\t\t"+resultSet.getString("cusEmailId")+"\t\t"+resultSet.getString("cusPhoneNum")+"\n");								
			}
			//System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	
	/*---------------------------------------- UPDATES --------------------------------------*/
	public void updateProducts()
	{
		this.listProducts();
		System.out.println("Enter productId to be updated from abovelist");
		Scanner scan=new Scanner(System.in); 
		int id=scan.nextInt();
		System.out.println("Enter category to be updated");	
		scan.nextLine();
		String category=scan.nextLine();		
		//System.out.println("Enter emailId  to be updated");
		//scan.nextLine(); 
		//String emailId=scan.nextLine();
		
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/phase-3";
			String username="root";
			String password="Unnathi_1998";
			connection=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful");
			
			
			//Step3
			Statement statement=connection.createStatement();
			
			String q1 = "UPDATE products set category = '" + category +  
                    "' WHERE ProductId = '" +id +  "'"; 
            int x = statement.executeUpdate(q1); 
			
			
            System.out.println("Updates products list is below");
			this.listProducts();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				//System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	
	
	
	

	



public void updateCustomers()
{
	this.listCustomers();
	System.out.println("Enter customerId to be updated from abovelist");
	Scanner scan=new Scanner(System.in); 
	int id=scan.nextInt();
	System.out.println("Enter customerEmailid to be updated");	
	scan.nextLine();
	String emailid=scan.nextLine();		
	//System.out.println("Enter emailId  to be updated");
	//scan.nextLine(); 
	//String emailId=scan.nextLine();
	
	Connection connection=null;
	
	try {
		//Step1
		Class.forName("com.mysql.jdbc.Driver");
		//System.out.println("Driver Loaded");
		
		//Step2
		String url="jdbc:mysql://localhost:3306/phase-3";
		String username="root";
		String password="Unnathi_1998";
		connection=DriverManager.getConnection(url, username, password);
		//System.out.println("Connection Successful");
		
		
		//Step3
		Statement statement=connection.createStatement();
		
		String q1 = "UPDATE customers set cusEmailId = '" + emailid +  
                "' WHERE customerId = '" +id +  "'"; 
        int x = statement.executeUpdate(q1); 
		
		
        System.out.println("Updates products list is below");
		this.listCustomers();
		
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	} catch (SQLException e) {
		System.out.println(e);
	}finally {
		try {
			//Step6
			connection.close();
			//System.out.println("Connection closed");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}

public String changepassword() {
	 boolean i=true;
	 String Newpwd="";
	while(i) {
		System.out.println("Enter the current password");
		Scanner scan=new Scanner(System.in);
		String pwd=scan.nextLine();
		
		if (pwd.equalsIgnoreCase("admin123")) 
		{
			System.out.println("Enter new password");
			String Newpwd1=scan.nextLine();
			System.out.println("your password has been changed successfully. New password is:"+Newpwd);
			i=false;
			Newpwd=Newpwd1;
			break;
		}
		else 
		{
			System.out.println("Entered password is Incorrect. Please try again");
			continue;
		}
	}

	
	return Newpwd;
	
}



}


