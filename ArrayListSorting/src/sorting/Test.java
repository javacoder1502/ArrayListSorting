package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	private String mode;
	private int BilledAmount;
	private String circle;
	
	
	
	
	
	 public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public int getBilledAmount() {
		return BilledAmount;
	}


	public void setBilledAmount(int billedAmount) {
		BilledAmount = billedAmount;
	}


	public String getCircle() {
		return circle;
	}


	public void setCircle(String circle) {
		this.circle = circle;
	}


	

	public static Comparator<Test> StuNameComparator = new Comparator<Test>() {

		public int compare(Test s1, Test s2) {
		   String StudentName1 = s1.getCircle().toUpperCase();
		   String StudentName2 = s2.getCircle().toUpperCase();
		   int c;
		   c = StudentName1.compareTo(StudentName2);
		   
		   if(c==0){
			   String mode1 = s1.getMode();
			   String mode2 = s2.getMode();
			   c =mode1.compareTo(mode2);
		   }
		   
		   if(c==0){
			   int rollno1 = s1.getBilledAmount();
			   int rollno2 = s2.getBilledAmount();
			    c = rollno1-rollno2;
		   }
		  
		   
		   return c;
		   //ascending order
		   //return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};
	
	 
	    public Test(String mode,int BilledAmount,String circle){
			this.BilledAmount =BilledAmount;
			this.circle=circle;
			this.mode=mode;
		}
	    
	    @Override
	    public String toString() {
	        return "[ Mode=" + mode + ", Bill =" + BilledAmount + ", circle =" + circle + "]";
	    }
	    
	    
	   public static void main(String[] args) {
		
				   
				   ArrayList<Test> arraylist = new ArrayList<Test>();
		   arraylist.add(new Test("WAP", 10, "AP"));
		   arraylist.add(new Test("WAP", 15, "AP"));
		   arraylist.add(new Test("WAP", 2, "AP"));
		   arraylist.add(new Test("WAP", 2, "AP"));
		
		  
		   
		   arraylist.add(new Test("SMS", 3, "AP"));
		   arraylist.add(new Test("SMS", 7, "AP"));
		   arraylist.add(new Test("SMS", 5, "AP"));
		   arraylist.add(new Test("SMS", 2, "AP"));
		   
		   arraylist.add(new Test("WAP", 2, "CH"));
		   arraylist.add(new Test("WAP", 10, "CH"));
		   arraylist.add(new Test("WAP", 15, "CH"));
		   
		   
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, Test.StuNameComparator);
		  
		  
		   
		   for(Test str: arraylist){
				System.out.println(str);
		   }
		   
		
	}
	 

}
