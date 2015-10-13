import java.util.Scanner;
import java.util.stream.IntStream;

public class Handson8 {

	public static void main(String[] args) {
		
	
		
	int Total = 0, Percentage;
	int mark;
	
		
	Scanner in = new Scanner(System.in);  
	   System.out.println("Enter the marks in order: "); 
	   System.out.println("English Marks: "); 
	   System.out.println("Mathematics Marks: ");
	   System.out.println("Science Marks: ");
	   System.out.println("Economics Marks: ");
	   System.out.println("Physics Marks: ");
	   
		
		int array[] = new int[5];
		   for (int i=0;i<5;i++)
		   {
			   
			  try 
			  {mark = in.nextInt();
				  
				  if(mark < 0 || mark > 100){
					  //i=0;
					  
					  throw new IllegalArgumentException();
					  
				  }
				  else{
					  array[i] = mark;
					
			  
				  }
			  }
				  catch (IllegalArgumentException ex){
					  System.out.println("Invalid marks");
					  mark = in.nextInt();
					  
				  }
				  
			  }
	   Total = IntStream.of(array).sum();

	   System.out.println("Total is" + Total);

Percentage = Total / 5;
System.out.println("Your Percentage is :" + Percentage);
if (Percentage > 100){
	System.out.println("Please enter marks again");
}
else if (Percentage < 40){
	System.out.println("Student is poor ");
}
else if (Percentage > 40 && Percentage <60){
	System.out.println("Student is Average ");
}
else if (Percentage > 59 && Percentage < 80){
	System.out.println("Student is Good ");
}
else if (Percentage > 80 && Percentage < 89){
	System.out.println("Student is Very Good ");
}
else if (Percentage >89 && Percentage <= 100){
	System.out.println("Student is Excellent ");
}



		   }		       
}
