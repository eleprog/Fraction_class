/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Eugene
 */
public class Mavenproject1 
{
    static volatile int b = 1;
    public static void main(String[] args) 
    {
       
        int value = b++ + b++ + b;
        System.out.println(value);
    }
}
