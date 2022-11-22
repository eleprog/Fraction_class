package com.mycompany.fraction_class;

public class Fraction 
{
    private int ch;
    private int zn;
    
    static private boolean ReductionFlag = true;
    
    static private int countObj = 0;
    
    Fraction()
    {
        countObj++;
        ch = 0;
        zn = 1;
    }
    
    Fraction(int chA, int znA)
    {
        countObj++;
        if(znA == 0)
        {
            ch = 0;
            zn = 1;
            return;
        }      
        ch = chA;
        zn = znA;
        if(ReductionFlag) this.reduction();
    }
     
    void setZn(int znA){
        zn = znA;
        if(ReductionFlag) this.reduction();
    }
    
    void setCh(int chA){
        ch = chA;
        if(ReductionFlag) this.reduction();
    }
    
    static void setReductionFlag(boolean mode){
        ReductionFlag = mode;
    }
    
    int getZn(){
       return zn;
    }
    
    int getCh(){
        return ch; 
    }
    
    static boolean getReductionFlag(){
        return ReductionFlag;
    }
    
    Fraction addition(Fraction objF) //(+)//
    {
        if(objF == null)
            return this;
        
        Fraction res = new Fraction (ch * objF.zn + objF.ch * zn, zn * objF.zn);
        if(ReductionFlag) res.reduction();
        return res;
    }
    
    Fraction subtraction(Fraction objF) //(-)//
    {
        if(objF == null)
            return this;
           
        Fraction res = new Fraction (ch * objF.zn - objF.ch * zn, zn * objF.zn);
        if(ReductionFlag) res.reduction();
        return res;
    }
    
    Fraction multiplication(Fraction objF) //(*)//
    {
        if(objF == null)
            if(ReductionFlag)
                return new Fraction();
            else
                return new Fraction(this.ch, this.zn);
        
        Fraction res = new Fraction (ch * objF.ch, zn * objF.zn);
        if(ReductionFlag) res.reduction();
        return res;
    }
    
    Fraction division(Fraction objF) throws Exception //(/)//
    { 
        if(objF == null || objF.ch == 0)
            throw new Exception("Error: division by zero");
        
        Fraction res = new Fraction (ch * objF.zn, zn * objF.ch);
        if(ReductionFlag) res.reduction();
        return res;
    }
    
    static int nod(int a, int b)
    {   
        if(a == 0)
            if(b == 0)
                return 1;   // a = 0, b = 0
            else
                return b;   // a = 0, b != 0
        else 
            if(b == 0)
                return a;   // a != 0, b = 0
        
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        
        if(a > b)
        {
            int tmp = a;
            a = b;
            b = tmp;
        }
              
        for(int i = a; i > 1; i--)
            if((a % i == 0) && (b % i == 0))
                return i;
        
        return 1;    
    }
    
    private void reduction()
    {
        int nod = nod(this.ch, this.zn);
        this.ch /= nod;
        this.zn /= nod;
    }
    
    boolean isEqual(Fraction objF)
    {
        if(objF == null)
            return false;
        if(ch == objF.ch && zn == objF.zn)
            return true;
        return false;
    }
    
    String toFormatString(){       
        return ch+"/"+zn;    
    }
    
    public static int getCountObject(){
        return countObj;
    }
    
    void CopyFraction(Fraction obj)
    {
        if(obj == null)
        {
            ch = 0;
            zn = 1;
            return;
        }
        ch = obj.ch;
        zn = obj.zn;
    }
}
