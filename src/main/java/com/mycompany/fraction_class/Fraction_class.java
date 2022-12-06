package com.mycompany.fraction_class;

import java.util.ArrayList;
        
public class Fraction_class 
{
    public static void deleteEqualFraction(ArrayList<Fraction> listFraction)
    {
        for(int i = 0; i < listFraction.size() - 1; i++)
            for(int j = 0; j < listFraction.size() - 1; j++)
               if(listFraction.get(i).equals(listFraction.get(j)));
               
    }
    
    public static Fraction createRandomFraction(int rangeLo, int rangeHi)
    {
        int ch = (int)(Math.random() * rangeHi);
        int zn = (int)(Math.random() * rangeHi);
        return new Fraction(ch, zn);
    }
    
    public static void main(String[] args) 
    {
        int hi = 10;
        int lo = 5;
        int len = 30;
        ArrayList<Fraction> listFraction = new ArrayList<Fraction>();
        for(int i = 0; i < len; i++)
            listFraction.add(createRandomFraction(lo, hi));
            
        for(Fraction tmp : listFraction)
            System.out.println(tmp.toFormatString());
        
    }
}
