package com.mycompany.fraction_class;

import java.util.ArrayList;
        
public class Fraction_class
{   
    public static <T> void deleteEqualObject(ArrayList<T> listFraction) {
        for(int i = 0; i < listFraction.size(); i++) {
            T tmp = listFraction.get(i);
            int index = listFraction.lastIndexOf(tmp);
            
            if(i != index) {
                i--;
                while((index = listFraction.lastIndexOf(tmp)) != -1)
                    listFraction.remove(index);
            }
        }                   
    }
    
    public static Fraction createRandomFraction(int rangeLo, int rangeHi) {
        int ch = rangeLo + (int)(Math.random() * (rangeHi - rangeLo));
        int zn = rangeLo + (int)(Math.random() * (rangeHi - rangeLo));
        return new Fraction(ch, zn);
    }
    
    public static void main(String[] args)
    {
        ArrayList<Fraction> listFraction = new ArrayList<>();
        int hi = 10;
        int lo = 5;
        int len = 20;
        
        for(int i = 0; i < len; i++)
            listFraction.add(createRandomFraction(lo, hi));
               
        /*listFraction.add(new Fraction(1,1));
        listFraction.add(new Fraction(2,1));
        listFraction.add(new Fraction(3,1));
        listFraction.add(new Fraction(4,1));
        listFraction.add(new Fraction(5,1));
        listFraction.add(new Fraction(6,1));
        listFraction.add(new Fraction(7,1));
        listFraction.add(new Fraction(2,1));
        listFraction.add(new Fraction(1,1));*/
        
        System.out.print(listFraction + "\n");
        
        deleteEqualObject(listFraction);
    
        System.out.print(listFraction);
    }
}
