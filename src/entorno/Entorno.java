package entorno;

import java.util.Scanner;

//Se trata de una aplicacion en la que introduces 4 numeros y te calcula el producto,la suma y la media de los 4 numeros

public class Entorno {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el primer numero");
    int num1=sc.nextInt();
    System.out.println("Escribe el segundo numero");
    int num2=sc.nextInt();
    System.out.println("Escribe el tercero numero");
    int num3=sc.nextInt();
    System.out.println("Escribe el cuarto numero");
    int num4=sc.nextInt();
    
    int producto=num1*num2*num3*num4;
    int suma=num1+num2+num3+num4;
    int media=suma/4;
    
    System.out.println("El producto es "+producto+" La suma es "+suma+" La media es "+media);
    }
    
}
