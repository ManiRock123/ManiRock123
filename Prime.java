package week1.day1;

public class Prime {
	public static void main(String[] args) {
		int i,quotient;
		boolean flag=false;      
		  int input=3; 
		  quotient=input/2;      
		  if(input==0||input==1){  
		   System.out.println(input+" is not prime number");      
		  }
		  else{  
		   for(i=2;i<=quotient;i++){      
		    if(input%i==0){      
		     System.out.println(input+" is not prime number");      
		     flag=true;      
		     break;      
		    }      
		   }      
		   if(flag==false)  { System.out.println(input+" is prime number"); }  
		  }
	}
	}

