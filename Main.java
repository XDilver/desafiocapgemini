import java.util.Scanner;  
import java.util.ArrayList;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a palavra");
    String palavra = sc.nextLine(); 
    sc.close();

    int z = 1;
    int contador = 0;
    int anagramas = 0;

    for (int x = 0; x < palavra.toCharArray().length; x++)
    {
      for (int y = 0; y + z <= palavra.toCharArray().length; y++)
      {
        for (int w = y + 1; w + z <= palavra.toCharArray().length; w++)
        {
          char[] a = palavra.substring(y, y + z).toCharArray();
          char[] b = palavra.substring(w, w + z).toCharArray();
          //escolhe seções específicas da string digitada e transforma em arraylist para a e b, quantas letras ambas irão ter é definido por z
          for (int v = 0; v < a.length; v++)
          {
            //serve para alternar entre os caracteres do a
            for (int u = 0; u < a.length; u++)
            {
              //serve para alternar entre os caracteres do b
              if (Character.toLowerCase(a[v])==Character.toLowerCase(b[u]))
              {
                //compara o caractere específico do a com o do b, ambos são tranformados em letra minúscula por garantia
                contador++;
                b[u] = " ".charAt(0);
                a[v] = "/".charAt(0);
                //troca os caracteres para garantir que a exata mesma comparação não conte como duas comparações distintas
              }
            }
            if (contador >= a.length)
            {
              anagramas++;
              //se o contador for igual ao tamanho do conjunto de letras significa que os 2 conjuntos possuem as mesmas letras 
            }
          }
          contador = 0; //reseta o contador para ser usado em outras comparações
        }
      }
      z ++;
      //a variável z vai aumentando até ter o número de letras da palavra
    }
    System.out.println("Há um total de " + anagramas + " anagramas");
  }
}