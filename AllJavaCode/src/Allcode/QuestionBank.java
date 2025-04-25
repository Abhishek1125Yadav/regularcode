package Allcode;

import java.util.*;

class Question{
	
	private int qid;
	private String qname;
	private String qop1;
	private String qop2;
	private String qop3;
	private String qop4;
	private String qans;
	
	Question(){
		
		
	}
	
	Question(int qid, String qname, String qop1, String qop2, String qop3, String qop4, String qans){
		
		this.qid = qid;
		this.qname = qname;
		this.qop1 = qop1;
		this.qop2 = qop2;
		this.qop3 = qop3;
		this.qop4 = qop4;
		this.qans = qans;
		
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getQop1() {
		return qop1;
	}

	public void setQop1(String qop1) {
		this.qop1 = qop1;
	}

	public String getQop2() {
		return qop2;
	}

	public void setQop2(String qop2) {
		this.qop2 = qop2;
	}

	public String getQop3() {
		return qop3;
	}

	public void setQop3(String qop3) {
		this.qop3 = qop3;
	}

	public String getQop4() {
		return qop4;
	}

	public void setQop4(String qop4) {
		this.qop4 = qop4;
	}

	public String getQans() {
		return qans;
	}

	public void setQans(String qans) {
		this.qans = qans;
	}
	
	
	
	
}
public class QuestionBank {
	
	public static void main(String x[]) {
		
		Scanner data = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		do {
			
			System.out.println("Press 1 For Add New Question");
			System.out.println("Press 2 For Show All question");
			System.out.println("Press 3 For Search Question");
			System.out.println("Press 4 For Delete Question By ID");
			
			System.out.println("Enter The Choice");
			int choice = data.nextInt();
			
			Question q = new Question();
			
			switch(choice) {
			
				case 1 : System.out.println("Enter The Question ID");
				         int qid = data.nextInt();
				
				         data.nextLine();
				         
				         System.out.println("Enter The Question");
				         String qname = data.nextLine();
				         
				         System.out.println("Enter First Option");
				         String qop1 = data.nextLine();
				         
				         System.out.println("Enter Second Option");
				         String qop2 = data.nextLine();
				         
				         System.out.println("Enter Third Option");
				         String qop3 = data.nextLine();
				         
				         System.out.println("Enter Fourth Option");
				         String qop4 = data.nextLine();
				         
				         System.out.println("Enter The Answer");
				         String qans = data.nextLine();
				         
				         q = new Question(qid, qname, qop1, qop2, qop3, qop4, qans);
				         al.add(q);
				         break;
				         
				case 2 : Iterator i = al.iterator();
						 while(i.hasNext()) {
							 
							 Object obj = i.next();
							 
							 Question question = (Question)obj;
							 
							 System.out.println("");
							 
							 System.out.println("Question ID : " + question.getQid());
							 System.out.println("Question Name : " + question.getQname());
							 System.out.println("Option 1 : " + question.getQop1());
							 System.out.println("Option 2 : " + question.getQop2());
							 System.out.println("Option 3 : " + question.getQop3());
							 System.out.println("Option 4 : " + question.getQop4());
							 System.out.println("Answer : " + question.getQans());
							 
						 }
						 break;
						 
				 case 3 : System.out.println("Enter The Search Question");
				 		  int search = data.nextInt();
				 		  
				 		  boolean b = false;
				 		  
				 		  i = al.iterator();
				 		  while(i.hasNext()) {
				 			  
				 			  Object obj = i.next();
				 			  
				 			  Question question = (Question)obj;
				 			  if(question.getQid() == search) {
				 				  
									 System.out.println("Question ID : " + question.getQid());
									 System.out.println("Question Name : " + question.getQname());
									 System.out.println("Option 1 : " + question.getQop1());
									 System.out.println("Option 2 : " + question.getQop2());
									 System.out.println("Option 3 : " + question.getQop3());
									 System.out.println("Option 4 : " + question.getQop4());
									 System.out.println("Answer : " + question.getQans());
									 b = true;
									 break;
				 				 
				 				  
				 			  }
				 			  
				 			  
				 		  }
				 		  
				 		  if(b) {
				 			  
				 			  System.out.println("Question Found");
				 			  
				 		  }
				 		  else {
				 			  
				 			  System.out.println("Question Not Found");
				 			  
				 		  }
				 		  
				 		  break;
				 		  
				 case 4 : System.out.println("Enter Question ID For Delete");
				 		  int delete = data.nextInt();
				 		  
				 		  i = al.iterator();
				 		  boolean b1 = false;
				 		  while(i.hasNext()) {
				 			  
				 			  Object obj = i.next();
				 			  
				 			  Question question = (Question)obj;
				 			  
				 			  if(question.getQid() == delete) {
				 				  
				 				  int index = al.indexOf(question);
				 				  
				 				  if(index != -1) {
				 					  
				 					  al.remove(index);
				 					  b1 = true;
				 					  break;
				 					  
				 					  
				 				  }
				 				  
				 			  }
				 			  
				 		  }
				 		  
				 		  if(b1) {
				 			  
				 			  System.out.println("Question Deleted");
				 			  
				 		  }
				 		  else {
				 			  
				 			  System.out.println("Question Not Fouud");
				 			  
				 		  }
				 		 
				         
			}
			
			
		}while(true);
		
	}

}
