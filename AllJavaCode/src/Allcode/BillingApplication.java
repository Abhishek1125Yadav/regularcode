package Allcode;

import java.util.*;

class Customer{
	
	private int id;
	private String name;
	private int no;
	
	Customer(){
		
		
	}
	
	Customer(int id, String name, int no){
		
		this.id = id;
		this.name = name;
		this.no = no;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	
	
	
}

class Product{
	
	private int pid;
	private String pname;
	private int pqty;
	private int prate;
	
	Product(){
		
		
	}
	
	Product(int pid, String pname, int pqty, int prate){
		
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.prate = prate;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public int getPrate() {
		return prate;
	}

	public void setPrate(int prate) {
		this.prate = prate;
	}
	
	
	
}

class Bill{
	
	private Customer customer;
	private Product product[];
	
	public void setCustomer(Customer customer) {
		
		this.customer = customer;
		
	}
	
	public Customer getCustomer() {
		
		return customer;
		
	}
	
	public void setProduct(Product product[]) {
		
		this.product = product;
		
	}
	
	public Product[] getProduct() {
		
		return product;
		
	}
	
	public void showData(Customer c, Product p[]) {
		
		System.out.println("Customer ID : " + c.getId());
		System.out.println("Cutomer Name : " + c.getName());
		System.out.println("Customer No : " +c.getNo());
		System.out.println("");
		
		for(int i = 0 ; i <= p.length - 1 ; i++) {
			
			System.out.println(p[i].getPid() + "  \t  " + p[i].getPname() + "  \t  " + p[i].getPqty() + "  \t  " + p[i].getPrate());
			
		}
		
	}


}

public class BillingApplication {
	
	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		Customer c1 = new Customer();
		Product p1[] = new Product[4];
		
		System.out.println("Enter Customer Name and Product");
		
		System.out.println("Enter Customer ID");
		int id = data.nextInt();
		
		data.nextLine();
		System.out.println("Enter Customer Name");
		String name = data.nextLine();
		
		System.out.println("Enter Customer Number");
		int no = data.nextInt();
		
		c1 = new Customer(id,name,no);
		
		for(int i = 0 ; i <= p1.length - 1 ; i++) {
			
			System.out.println("Enter Product ID");
			int pid = data.nextInt();
			
			data.nextLine();
			System.out.println("Enter Product Name");
			String pname = data.nextLine();
						
			System.out.println("Enter product Quantity");
			int pqty = data.nextInt();
			
			System.out.println("Enter Product Rate");
			int prate = data.nextInt();
			
			p1[i] = new Product(pid, pname, pqty, prate);
			
		}
		
		
		Bill b = new Bill();
		b.showData(c1, p1);
		
		
	/*	System.out.println("Customer ID : " + c1.getId());
		System.out.println("Customer Name : " + c1.getName());
		System.out.println("Customer Mobile No : " + c1.getNo());
		
			for(int i = 0 ; i <= p1.length - 1 ; i++) {
				
				System.out.println(p1[i].getPid() + "  \t  " + p1[i].getPname() + "  \t  " + p1[i].getPqty() + "  \t  " + p1[i].getPrate());
				
			}
		
		*/
	}

}
