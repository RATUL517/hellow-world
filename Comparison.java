import java.util.Scanner;
public class Comparison{
  public static void main(String[]args){
  Scanner in= new Scanner(System.in);
  int a=in.nextInt();
  int b=in.nextInt();
  int c=in.nextInt();
  int ab=(a + b + Math.abs(a-b))/2;
  int abc=(ab + c + Math.abs(ab-c))/2;
  System.out.println(abc +" eh o maior");
  }
}