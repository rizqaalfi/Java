/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MassToy;

/**
 *
 * @author Acer
 */
public class MassToy {
    private String name = "";
    private double density = 0;
    
    //create a new instance of masstoy*/
    public MassToy (){
    }
    public MassToy(String name, double density){
        this.name = name;
        this.density = density;
    }
    public double getMass (double volume){
    return density * volume ;
    }
    
    public double getDesity (){
    return density;
    }
    
    public double getVolume (double mass){
    return mass/density;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString (){
        String str = "benda" +"\n"+
            "Nama benda  = "+name +"\n"+
            "Massa jenis =" + density +"\n";
        return str;
                
    }
    static void test (){
    MassToy m = new MassToy ("Alumunium", 2.7);
    System.out.println (m);
    
    }
    public static void main (String [] args){
    test ();
            }
   
    
}
