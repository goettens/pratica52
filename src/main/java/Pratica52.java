
import utfpr.ct.dainf.if62c.pratica.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        
        try{
            Equacao2Grau<Float> a = new Equacao2Grau<>((float)0,(float)6,(float)10);
            System.out.println("a1="+a.getRaiz1());
            System.out.println("a1="+a.getRaiz2());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            Equacao2Grau<Float> b = new Equacao2Grau<>((float)2,(float)3,(float)4);
            System.out.println("b1="+b.getRaiz1());
            System.out.println("b1="+b.getRaiz2());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Equacao2Grau<Float> c = new Equacao2Grau<>((float)9,(float)-12,(float)4);
            System.out.println("c1="+c.getRaiz1());
            System.out.println("c2="+c.getRaiz2());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
         try{
            Equacao2Grau<Float> d = new Equacao2Grau<>((float)1,(float)-3,(float)-10);
            System.out.println("d1="+d.getRaiz1());
            System.out.println("d2="+d.getRaiz2());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
