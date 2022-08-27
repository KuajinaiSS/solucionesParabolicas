package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("ingrese el valor de a: ");
        int a = Scan.nextInt();
        System.out.print("ingrese el valor de b: ");
        int b = Scan.nextInt();
        System.out.print("ingrese el valor de c: ");
        int c = Scan.nextInt();

        double determinante = (   Math.pow(b,2) - (4*a*c)  );
        double determinanteRaiz = (Math.sqrt(determinante));

        if(determinante<0){
            System.out.println("no tiene soluciones reales ya que el determinante es negativo: "+determinante);
        }
        else{

            double abajo =(2*a);
            double arribapositivo = (  ( (-b + determinanteRaiz)  ));
            double arribanegativo = (  ( (-b - determinanteRaiz)  ));

            double positivo = (arribapositivo/abajo);
            double negativo = (arribanegativo/abajo);

            if(positivo==negativo){
                System.out.println("la unica solucion es: "+positivo);

            }
            else{
                System.out.println("el determinante es: "+determinante);
                System.out.println("la primera solucion es: "+positivo);
                System.out.println("la segunda solucion es: "+negativo);

            }
        }
    }
}