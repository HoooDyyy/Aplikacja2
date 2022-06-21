import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Podaj Liczbę");
    Scanner scanner = new Scanner(System.in);
    int liczba=0;
    int srednia=0;
    int suma=0;
    int przez3=0;
    int i=0;
    liczba=scanner.nextInt();
 while(liczba!=150)
   {
   
    suma=liczba+suma;
    if(liczba%3==0)
      
    przez3++;
    i++;
     liczba=scanner.nextInt();
   }
  srednia=suma/i;
  System.out.println("Suma   "+suma);
  System.out.println("srednia   "+srednia);
  System.out.println("Podzielne przez trzy   "+przez3);
  }
}