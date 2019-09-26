/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Operaciones {
    
    static Scanner teclado;
    static int operando1, operando2;
    
    public static void main(String[] arga) {
        //cuerpo de metodo
        //Ámbito método
        //Scanner teclado = new Scanner(System.in);
        teclado = new Scanner (System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = teclado.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = teclado.nextInt();
        sumarNúmeros(operando1, operando2);
        restarNúmeros(operando1, operando2);
        dividirNúmeros(operando1, operando2);
        multiplicarNúmeros(operando1, operando2);
    }
    
    public static void sumarNúmeros(int op1, int op2){
        //teclado = null;
        //operando1 + operando2;
        int resultado = op1 + op2;
        System.out.println("La suma de los dos números es: " +resultado);
        
    }
    
    public static void restarNúmeros(int op1, int op2){
        //teclado = null;
        //operando1 - operando2;
        int resultado = op1 - op2;
        System.out.println("La resta de los dos números es: " +resultado);
    }
    
    public static double dividirNúmeros(int op1, int op2){
        double resultado;
        try{
            resultado = (double)operando1 / (double)operando2;
        } catch (Exception fallo){
            System.out.println("Segundo operando inválido");
            resultado = 0;
        }
            
        System.out.println("La división de los dos números es: " +resultado);
        return resultado;
    }
    
    public static void multiplicarNúmeros(int op1, int op2){
        //teclado = null;
        //operando1 * operando2;
        int resultado = op1 * op2;
        System.out.println("La multiplicación de los dos números es: " +resultado);
    }
    
}
