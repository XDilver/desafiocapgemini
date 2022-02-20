import java.util.Scanner;  
import java.util.ArrayList;

class Main 
{
  public static void main(String[] args) 
  {
    boolean senhacerta = true;
    System.out.println("Digite sua senha");

    Scanner sc = new Scanner(System.in);
    String senha = sc.nextLine(); 
    sc.close();
 
    boolean lowercase = false;
    boolean uppercase = false;
    boolean digit = false;
    boolean specialchar = false;
    char[] cenha = senha.toCharArray();

    for (char x: cenha)
    {
      if(Character.isUpperCase(x))
      {
        uppercase = true;
      }
      if(Character.isLowerCase(x))
      {
        lowercase = true;
      }  
      if (Character.isDigit(x))
      {
        digit = true;
      }
      if (!Character.isDigit(x) && !Character.isLetter(x) && !Character.isWhitespace(x)) 
      {
        specialchar = true;
      }

     }

     if (uppercase == false)
     {
       System.out.println("Não há letra maiúscula");
       senhacerta = false;
     }
     if (lowercase == false)
     {
       System.out.println("Não há letra minúscula");
       senhacerta = false;
     }
     if (digit == false)
     {
       System.out.println("Não há dígitos");
       senhacerta = false;
     }
     if (specialchar == false)
     {
       System.out.println("Não há caracteres especiais");
       senhacerta = false;
     }
     if (cenha.length < 6)
     {
       System.out.println("Número de caracteres abaixo de 6");
       senhacerta = false;
     }

     if (senhacerta == true) 
     {
       System.out.println("Está tudo certo");
     }

       
  }
}