import java.util.Scanner;  
import java.util.ArrayList;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número para n");
    
    int n = sc.nextInt();
    sc.close();

    ArrayList<String> car = new ArrayList<String>();
    for (int x = 0; x < n; x++)
    {
      car.add(" ");
    }
    int y = car.size() - 1;

    do
    {
      car.set(y, "*");
      for (int x = 0; x < car.size(); x++)
      {
        System.out.print(car.get(x));
      }
      System.out.println(" ");
      y--;

    }
    while(car.get(0) == " ");
  }
}