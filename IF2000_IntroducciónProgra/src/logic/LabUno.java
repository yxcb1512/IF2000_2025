/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author yeire
 */
public class LabUno {
   
    public void ejercicioA(int n){
    //Diseñe un DF que reciba un número entero y determine si es par o impar
    
        if (n%2==0){
            System.out.println("El numero "+n+" es par");
        }else{
            System.out.println("El numero "+n+" es impar");
        }
        
    }
    
    public void ejercicioB(int n){
        //Hacer un DF que calcula e imprime el valor absoluto de un número.
        
        int absoluto=0;
        
            if(n>=0){
                absoluto=n;
                System.out.println("El numero absoluto de |"+n+"| es "+absoluto);
            }else{
                absoluto=-n;
                System.out.println("El numero absoluto de |"+n+"| es "+absoluto);
            }
    }
    
    public void ejercicioC(){
        //Diseñar un DF que imprima y sume la serie de números 3, 6, 9, 12, 15, … ,99
        
        int suma=0;
        System.out.println("La cadena es: ");
        for (int n = 0; n <= 99; n+=3) {
            System.out.print(n+" ");
            suma+=n;
        }
        System.out.println();
        System.out.println("El resultado de la suma en base con la cadena anterior es: "+suma);
    }

    public void ejercicioD(int uno, int dos, int tres){
        //Escriba un algoritmo que lea tres números y los imprima en orden ascendente.
        
        int[] numeros = {uno, dos, tres};
            Arrays.sort(numeros);
            System.out.println("Los numeros ordenados ascendentemente son: "+numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
}
    public void ejercicioE(int uno, int dos){
        //Hace un DF que lea 2 números: si son iguales que los multiplique, si el primero es mayor que el
        //segundo que los reste y si no que los sume. Debe imprimir el resultado final.
        
        if (uno==dos){
            int multi = uno*dos;
            System.out.println("El resultado de la multiplicacion es: "+multi);
        }else if (uno>dos){
        int resta=uno-dos;
            System.out.println("El resultado de la resta es: "+ resta);
    }else{
            int suma= uno+dos;
            System.out.println("El resultado de la suma es "+suma);
        }
        
    }
    
    public void ejercicioF(){
            //Programa que lee un número de notas con valores de 0 a 10, termina cuando se le introduce
            //una nota con el valor -1 y nos dice si hubo o no alguna con el valor 10.
       
            Scanner sc = new Scanner(System.in);
        boolean huboDiez = false;
        int nota;

        System.out.println("Introduce notas (0 a 10). Escribe -1 para terminar:");

        while (true) {
            nota = sc.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota == 10) {
                huboDiez = true; 
            }
        }

        if (huboDiez) {
            System.out.println("Si hubo al menos una nota con valor 10.");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }

        sc.close();
    }

        
    public void ejercicioG(){
        //Calcular el número de pulsaciones que debe tener una persona por cada 10 segundos de
        //ejercicio aeróbico, la formula se aplica de acuerdo al sexo es:
        //a. Femenino: numero_pulsaciones = (220 - edad)/10
        //b. Masculino: numero_pulsaciones = (210 - edad)/10
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su sexo (M para masculino, F para femenino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        int pulsaciones;

        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10;
        } else if (sexo == 'M') {
            pulsaciones = (210 - edad) / 10;
        } else {
            System.out.println("Sexo no valido, use M o F.");
            return;
        }

        System.out.println("El numero de pulsaciones por cada 10 segundos es: " + pulsaciones);

        sc.close();
    }
        
    
    
    
    public void ejercicioH(){
        /*Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna
        como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de
        acuerdo con la siguiente tabla:
                Tiempo:                                             Utilidad:
                Menos de 1 año                                      5% del salario
                1 año o más y menos de 2 años                7% del salario
                2 años o más y menos de 5 años               10% del salario
                5 años o más y menos de 10 años             15% del salario
                10 años o más                                           20% del salario      */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese sus anios de antiguedad en la empresa: ");
        int anios = sc.nextInt();

        double utilidad;

        if (anios < 1) {
            utilidad = salario * 0.05;
        } else if (anios < 2) {
            utilidad = salario * 0.07;
        } else if (anios < 5) {
            utilidad = salario * 0.10;
        } else if (anios < 10) {
            utilidad = salario * 0.15;
        } else {
            utilidad = salario * 0.20;
        }

        System.out.println("La utilidad que recibira es: " + utilidad);

        sc.close();
    }
    
    
    public void ejercicioI(int n){
        // Diseñar un algoritmo para determinar si un número N es primo (un número es primo si
        // únicamente es divisible por el mismo y por la unidad)
        
        if (n%n==0 && n%1==0){
            System.out.print("El numero "+ n +" es un numero primo");
        }else{
            System.out.print("El numero "+n+" no es un numero primo");
        }
        
    }
    
    public void ejercicioJ(){
        /* En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de computadoras que compre. Si las computadoras son menos de cinco se les dará
un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o
igual a cinco, pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da
un 40% de descuento. El precio de cada computador es de 11.000$. Elabore el DF que permite
imprimir la cantidad de computadoras compradas, el precio total sin el descuento, el monto que
le descontaron, así como el monto total a pagar.*/
        
        System.out.println();
         Scanner sc = new Scanner(System.in);
        final double PRECIO = 11000;

        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = sc.nextInt();

        double totalSinDescuento = cantidad * PRECIO;
        double descuento;

        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10;
        } else if (cantidad < 10) {
            descuento = totalSinDescuento * 0.20;
        } else {
            descuento = totalSinDescuento * 0.40;
        }

        double totalPagar = totalSinDescuento - descuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: $" + totalSinDescuento);
        System.out.println("Monto descontado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        sc.close();
    }
    
    public void ejercicioK(){
        // Diseñe un DF que genere la lista de los números primos, que existen entre el número 2 y un
//numero natural N leído del teclado.

        System.out.println();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero N: ");
        int N = sc.nextInt();

        System.out.println("Numeros primos entre 2 y " + N + ":");

        for (int i = 2; i <= N; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }

        sc.close();

    }
    
    public void ejercicioL(int base, int altura){
        //Escribir un algoritmo que calcule el área de un triángulo en función de base y altura.
        
        int area= base*altura;
        System.out.println("El area del triangulo es: "+area);
        
    }
    
}