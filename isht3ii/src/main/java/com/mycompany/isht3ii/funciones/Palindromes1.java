/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii.funciones;

/**
 *
 * @author aleja
 */
public class Palindromes1 {

    
    public static void main(String[] args) {
        
        Palindromes prueba = new Palindromes();
        
        System.out.println("Oso es un palindromo: " + prueba.evaluate("oso"));
        System.out.println("Alejandro es palindromo: " + prueba.evaluate("Alejandro"));
        System.out.println("66066 es palindromo: " + prueba.evaluate("66066"));
        System.out.println("A mí me mima es palindromo: " + prueba.evaluate("amimemima"));
        System.out.println("@ es palindromo: " + prueba.evaluate("@"));
        System.out.println("& ale &: " + prueba.evaluate("& ale &"));
        System.out.println("Cadena con espacios: " + prueba.evaluate("       "));
        System.out.println("Tabulaciones : " + prueba.evaluate("\t a "));
        System.out.println("12ana21 es palindromo: " + prueba.evaluate("12ana21"));
        System.out.println("11011: es palindromo: " + prueba.evaluate("11011"));
        
    
    }
     /**
   * Iterative solution to this problem. This algorithm has a complexity order in time terms of
   * O(N/2) = O(N) where N is the number of letters in the word. In space terms, this algorithm has
   * a complexity order equals to O(1) because we are not using any other data structure to store
   * temporal information.
   */
  
}
