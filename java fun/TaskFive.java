import java.util.Scanner;
public class TaskFour{
  public static void main(String...args){
  
  Scanner input = new Scanner(System.in);
  int total = 0;
  int count = 1;
  int average = 0;
  while(count<=10){
  System.out.print("Enter number: ");
  int number =input.nextInt();
  
  if(number % 2 == 0){
  total+=number;
  }
  count++;
  }
  
  System.out.println("total = " + total);
  
  
  
  
  
  
  
  
  
  
  
  }



}
