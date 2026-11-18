import java.util.Scanner;
public class TaskTen{
  public static void main(String...args){
  
  Scanner input = new Scanner(System.in);
  int total = 0;
  int validCounter =0;
  int count = 1;
  int average = 0;
  while(count<=10){
  System.out.print("Enter number: ");
  int number =input.nextInt();
  
  if(number>0 && number<100){
  validCounter++;
  total+=number;
  }
  average =total/validCounter;
  count++;
  }
   
  
  System.out.println("Average= " + average);
  
  
  
  
  
  
  
  
  
  
  }



}
