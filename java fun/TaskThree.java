import java.util.Scanner;
public class TaskThree{
  public static void main(String...args){
  
  Scanner input = new Scanner(System.in);
  int total = 0;
  int count = 1;
  double average = 0;
  while(count<=10){
  System.out.print("Enter number: ");
  int number =input.nextInt();
  
  total+=number;
  count++;
  }
  average+= total/10;
  System.out.println("total = " + total);
  System.out.println("Average = " + average);
  
  
  
  
  
  
  
  
  
  
  }



}
