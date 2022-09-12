/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package churrasco;
/**
 *
 * @author C1280738
 */
public class Calculo {
        
    public double carne(double[] povo){
        return ((povo[0]*500)+(povo[1]*300)+(povo[2]*150))/1000;
    }
    
    public double salada(double[] povo){
        return ((povo[0]*100)+(povo[1]*100)+(povo[2]*50))/1000;
    }
    
    public double farofa(double[] povo){
        return ((povo[0]*100)+(povo[1]*100)+(povo[2]*50))/1000;
    }
    
    public double refrigerante(double[] povo){
        return ((povo[0]*1)+(povo[1]*1)+(povo[2]*1));
    }
    
    public double gelo(double[] povo){
        return ((povo[0]*1)+(povo[1]*1)+(povo[2]*1));
    }
    
    public double cerveja(double[] povo){
        return ((povo[0]*2)+(povo[1]*2));
    }
    
    public double carvao(double[] povo){
        return (((povo[0]*500)+(povo[1]*300)+(povo[2]*150))*1.5)/1000;
    }
}
