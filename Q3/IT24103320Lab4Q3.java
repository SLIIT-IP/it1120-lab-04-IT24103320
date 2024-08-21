import java.util.Scanner;
  
public class IT24103320Lab4Q3{
  public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
    
   int number;
   
   System.out.print("Enter number: ");
   number = scanner.nextInt();

   String result = (number > 0)? "The number is: Positive" 
   : (number < 0)? "The number is: Negative" 
   : "The number is: Zero =";

   System.out.println(result);

   scanner.close();

  }
}   