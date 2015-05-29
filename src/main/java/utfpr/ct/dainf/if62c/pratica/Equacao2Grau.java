/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Guilherme
 */
public class Equacao2Grau <EQ extends Number>{
    private EQ a;
    private EQ b;
    private EQ c;

    public Equacao2Grau(EQ a, EQ b, EQ c) {
        if(a.doubleValue() == 0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public EQ getA() {
        return a;
    }

    public void setA(EQ a) {
        if(a.doubleValue() == 0){
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public EQ getB() {
        return b;
    }

    public void setB(EQ b) {
        this.b = b;
    }

    public EQ getC() {
        return c;
    }

    public void setC(EQ c) {
        this.c = c;
    }
    
    public double getRaiz1(){
        double delta = b.doubleValue()*b.doubleValue()-4*a.doubleValue()*c.doubleValue();
        
        if(delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        return ((-b.doubleValue() - Math.sqrt(delta))/(2*a.doubleValue()));
    }
    
    public double getRaiz2(){
        double delta = b.doubleValue()*b.doubleValue() - 4*a.doubleValue()*c.doubleValue();
        
        if(delta<0){
            throw new RuntimeException("Equação não tem solução real");
        }
        return ((-b.doubleValue() + Math.sqrt(delta))/(2*a.doubleValue()));
    }
}
