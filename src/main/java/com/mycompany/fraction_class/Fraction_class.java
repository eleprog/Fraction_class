package com.mycompany.fraction_class;

import java.util.ArrayList;
        
public class Fraction_class 
{
    public static void deleteEqualFraction(ArrayList<Fraction> listFraction)
    {
        int len = listFraction.size();
        for(int i = 0; i < len; i++)
        {
            Fraction tmp = listFraction.get(i);
            if(tmp != null && i != listFraction.lastIndexOf(tmp));
            {
                int index = listFraction.lastIndexOf(tmp);
                while(index != -1)
                {
                    listFraction.remove(index);
                    index = listFraction.lastIndexOf(tmp);
                }
            }
            len = listFraction.size();
        }                   
    }
    
    public static Fraction createRandomFraction(int rangeLo, int rangeHi)
    {
        int ch = rangeLo + (int)(Math.random() * (rangeHi - rangeLo));
        int zn = rangeLo + (int)(Math.random() * (rangeHi - rangeLo));
        return new Fraction(ch, zn);
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Fraction> listFraction = new ArrayList<>();
        int hi = 10;
        int lo = 5;
        int len = 30;
             
        for(int i = 0; i < len; i++)
            listFraction.add(createRandomFraction(lo, hi));
            
        for(Fraction tmp : listFraction)
            System.out.print(tmp.toFormatString() + " ");
        
        deleteEqualFraction(listFraction);
        System.out.println();
        
        for(Fraction tmp : listFraction)
            System.out.print(tmp.toFormatString()+ " ");
        
    }
}
