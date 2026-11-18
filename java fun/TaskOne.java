import java.util.Scanner;
public class TaskOne{
  public static void main(String...args){
  
  Scanner input = new Scanner(System.in);
  int total = 0;
  int count = 1;
  
  while(count<=10){
  System.out.print("Enter number: ");
  int number =input.nextInt();
  
  total+=number;
  count++;
  }
  System.out.println(total);
  
  
  
  
  
  
  
  
  
  
  }



}
