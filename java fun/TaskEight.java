import java.util.Scanner;
public class TaskEight{
  public static void main(String...args){
  
  Scanner input = new Scanner(System.in);
  int total = 0;

  int count = 1;
  
  while(count<=10){
  System.out.print("Enter number: ");
  int number =input.nextInt();
  
  if(number>0 && number<100){
  
  total+=number;
  }
  else{
  System.out.println("invalid number enter a valid number");
  count--;
  }
  count++;
  }
   
  
  System.out.println("total = " + total);
  
  
  
  
  
  
  
  
  
  
  }



}
