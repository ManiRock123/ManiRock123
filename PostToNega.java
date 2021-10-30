package week1.day1;


public class PostToNega {
	public static void main(String[] args) {
			
		int i=20;
		int j=-50;
		int num;
		
		System.out.println("Program to check whether given num is -ve or +ve");
		if(i<0)
			System.out.println("Given number "+i+" is Negative");
		else if(i>0)
			System.out.println("Given number "+i+" is Positive");
		else
			System.out.println("Given number is 0");
		
		System.out.println("*********************************");
		
		System.out.println("Program to convert -ve t +ve");
					
		if(j<0)
		{
			num=-(j);
			System.out.println("Given number "+j+" has been converted to "+num);		
		}
		else if (j>0){
			num=-(j);
			System.out.println("Given number "+j+" has been converted to "+num);	
		}
		else
			System.out.println("Given number is 0");
	}

}
