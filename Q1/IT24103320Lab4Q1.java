import java.util.Scanner;
  
public class IT24103320Lab4Q1{
  public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
    
   int number;
   
   System.out.print("Enter integer: ");
   number = scanner.nextInt();

   if(number> 0) {
     System.out.print("The number is: Positive");
   }
   else if (number < 0) {
     System.out.print("The number is: Negative");
   }
   else {
     System.out.print("The number is: Zero");
   }

   scanner.close();
  }
}   
   

   