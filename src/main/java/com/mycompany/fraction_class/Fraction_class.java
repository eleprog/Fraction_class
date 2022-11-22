package com.mycompany.fraction_class;

public class Fraction_class 
{
    public static void main(String[] args) 
    {
        Fraction drobA = new Fraction(10,20);
        Fraction drobB = null;//new Fraction(0,20);
        
        Fraction drobC = drobA.addition(drobB);
        System.out.println(drobC.toFormatString());
    }
}
