/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;

/**
 *
 * @author yeire
 */
public class LabDos {

    public LabDos() {
    }
    
    
    public void ejercicio1 (){
        //Realizar la suma de todos los números pares entre 2 y 1000
        
        int suma=0;
        
        for (int i = 2; i <= 1000; i++) {
            if (i%2==0){
                suma+=i;
            }
            
        }
        System.out.println("El resultado de la suma de los numeros pares entre el numero 2 y el 1000 es: "+suma);
    }
    
    
    public void ejercicio2(){
        //Realizar un algoritmo que permita convertir temperaturas dadas en grados Celsius a 
        //temperaturas en grados Fahrenheit. F=9/5 (C + 32)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los grados celcius que quiere transformar a fahrenheit: ");
        int c = sc.nextInt();
        
        
        double grados= (c*9.0/5.0)+32;
        
        System.out.println("En total los grados en fahrenheit son: "+grados);
        
        sc.close();
    }
    
    
    public void ejercicio3(){
        /*Programa que lee un numero entero X y otro número entero N y, calcula la enésima
           potencia de X. X^n*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el numero al cual quiere calcular la enesima potencia de este: ");
        int x= sc.nextInt();
        
        System.out.println("Ingrese otro numero para desarrollar la formula: ");
        int n= sc.nextInt();
        
        double result=Math.pow(x, n);
        
        System.out.println("En total la enesima potencia de "+x+" es: "+result);
        
        sc.close();
    }
    
    public void ejercicio4(){
        /*Elabore un DF que reciba del teclado un número e imprima el mes del año al cual
           corresponde ese número.*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para mostrar el mes que respresenta (1 al 12)");
        int mes=sc.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("El mes seleccionado es Enero");
                break;
            case 2:
                System.out.println("El mes seleccionado es Febrero");
                break;
            case 3:
                System.out.println("El mes seleccionado es Marzo");
                break;
            case 4:
                System.out.println("El mes seleccionado es  Abril");
                break;
            case 5 :
                System.out.println("El mes seleccionado es Mayo");
                break;
            case 6:
                System.out.println("El mes seleccionado es Junio");
                break;
            case 7:
                System.out.println("El mes seleccionado es Julio");
                break;
            case 8:
                System.out.println("El mes seleccionado es Agosto");
                break;
            case 9:
                System.out.println("El mes seleccionado es Septiembre");
                break;
            case 10:
                System.out.println("El mes seleccionado es Octubre");
                break;
            case 11:
                System.out.println("El mes seleccionado es Noviembre");
                break;
            case 12:
                System.out.println("El mes seleccionado es Diciembre");
                break;
            default:
                System.out.println("El numero "+mes+" no es equivalente a ningun mes (estos van del numero 1 al 12)");
                break;
            }
        sc.close();
    }
    
    public void ejercicio5(){
        /*Calcular e imprimir el resultado de la evaluación de la siguiente funcion:
                                F(x)= {x+5, ∀ x > 0
                                          {X², ∀ x < 0
                                          {1, x=0*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de X");
        int x = sc.nextInt();
        
        int resultado =0;
        
        if (x>0){
            resultado = x+5;  
        }else if (x < 0){
            resultado = x*x;  
        } else{
            resultado = 1;
        }
        System.out.println("El resultado de la operacion es: "+resultado);
        sc.close();
    }
    
    
    public void ejercicio6(){
        /*Diseñar un algoritmo que calcule el área de un triángulo en funcion de las longitudes de sus lados.
                Área= raíz (p (p-a) (p-b) (p-c), p=(a + b + c)/2 donde p es el perímetro y a, b, c es el
                    valor de lo que mide cada lado.*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la medida de los lados del triangulo: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        int p=(a+b+c)/2;
        double area =Math.sqrt(p*(p-a) * (p-b) * (p-c));
        
        System.out.println("La medida del area del triangulo en funcion de la medida de sus lados es: "+area);
        
        sc.close();
    }
    
    public void ejercicio7(){
        /*Realizar un algoritmo que permita intercambiar entre si los valores de dos variables A y B.
            Ejemplo: Si A vale 5 y B vale 10, al resolver el problema A debe valer 10 y B valer 5.*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese los valores que quiere intercambiar");
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        System.out.println("Antes del intercambio, el valor del primer numero es: "+a+" y el del segundo es: "+b);
        
        int apoyo=a;
        a=b;
        b=apoyo;
        
        System.out.println("Despues del intercambio, el valor del primer numero es: "+a+" y el del segundo es: "+b);
        sc.close();
    }
    
    public void ejercicio8(){
        /*Elabore un diagrama de flujo que permita encontrar la ecuación de la recta
                    y=mx+b donde M= (Y₀-Y₁)/(X₀-X₁) b=y-mx*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los valores de los pares ordenados: ");
        System.out.print("x1: ");
        double x1=sc.nextDouble();
        System.out.print("x2: ");
        double x2=sc.nextDouble();
        System.out.print("y1: ");
        double y1=sc.nextDouble();
        System.out.print("y2: ");
        double y2=sc.nextDouble();
        
        double m= (y1-y2)/(x1-x2);
        double b= y1 - (m*x1);
        
        System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
        
        sc.close();
    }
    
    
    public void ejercicio9(){
        /*. Realizar un algoritmo que lea un numero natural K e imprima la suma de todos los
                            números naturales que sean menores a él. */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del numero: ");
        int n = sc.nextInt();
        int suma=0;
        
        for (int i = 0; i <= n; i++) {
            
            suma +=i;
        }
        System.out.println("El resultado de la suma de todos los numeros naturales antecesores al "+n+" es: "+suma);
    }
    
    
    public void ejercicio10(){
        /*Calcular la media (promedio) de una serie de números positivos. El promedio es la
            suma total de los números leídos entre la cantidad de números. */
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos numeros positivos desea ingresar? ");
        int cantidad = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double num = sc.nextDouble();

            
            if (num < 0) {
                System.out.println("Debe ser un numero positivo. Intente de nuevo.");
                i--; 
            } else {
                suma += num;
            }
        }

        double promedio = suma / cantidad;

        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
    
    
    public void ejercicio11(){
        /*Dados 10 números enteros, visualizar la suma de los números pares de la lista.
            ¿Cuántos números pares e impares existen?, ¿Cuál es la suma total de los números y
                cuanto es la suma de los impares y los pares por separado?*/
        Scanner sc =new Scanner(System.in);
        
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaTotal = 0;

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = sc.nextInt();

            sumaTotal += num;

            if (num % 2 == 0) {
                sumaPares += num;
                contadorPares++;
            } else { 
                sumaImpares += num;
                contadorImpares++;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("Cantidad de pares: " + contadorPares);
        System.out.println("Cantidad de impares: " + contadorImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        System.out.println("Suma total: " + sumaTotal);

        sc.close();
    }
    
    
    public void ejercicio12(){
        /*Se desea calcular independientemente la suma de los números pares e impares
            comprendidos entre 1 y 200. */
        
        int pares=0;
        int impares=0;
        
        for (int i = 1; i <= 200; i++) {
            if(i%2==0){
                pares+=i;
            }else{
                impares+=i;
            }
        }
        
        System.out.println("La suma de los pares es: "+pares+" y el de los impares es: "+impares);
    }
    
    
    public void ejercicio13(){
        /* Calcular la suma de los cuadrados de los 100 primeros números naturales. */
        
        int suma = 0;
        double multiplicacion=0;
        
        for (int i = 1; i <= 100; i++) {
            multiplicacion=Math.pow(i, 2);
            suma+=multiplicacion;
        }
        System.out.println("El resultado de la suma de los cuadrados de los primeros 100 numeros naturales es: "+suma);
    }
    
    
    public void ejercicio14(){
        /*Desarrollar el algoritmo necesario para calcular el factorial de un numero entero
           positivo N que responde a la formula;
           N! = 1 * 2 * 3 * 4 *…………………….. (n-1) * n
           Si n es 0 entonces 0!= 1
           Si n es 1 entonces 1!= 1 */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("El factorial no esta definido para numeros negativos.");
        } else {
            long factorial = 1; 
            
            for (int i = 1; i <= n; i++) {
                factorial *= i; 
            }
            
            System.out.println(n + "! = " + factorial);
        }
        
        sc.close();
    }
    
    
    public void ejercicio15(){
        /* Calcular el valor máximo de una serie de 10 números. */
        
        Scanner sc = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE; 
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = sc.nextInt();
            
            if (numero > maximo) {
                maximo = numero; 
            }
        }
        
        System.out.println("El valor maximo de la serie es: " + maximo);
        sc.close();
    }
}
