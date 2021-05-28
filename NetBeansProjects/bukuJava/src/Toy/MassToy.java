/*
 * 2 desember 2019
 */
package Toy;


public class MassToy {
   
    
    private String name = "";
    private double density = 0;
    public MassToy(){
    }
    
    
     public MassToy (String name, double density){
        this.name = name;
        this.density = density;
        
    }
   
    public double getMass (double volume ){
        return density*volume;
    }
    public double getDensity (double density){
        return density;
    }
    public double getVolume (double mass){
        return mass/density;
    }
   
   public String toString(){
        String str = "Benda " + "\n" + 
                "nama benda     = " + name + "\n" +
                "massa jenis     = " + density + "\n";
               
        return str;
    }
   
    static void test(){
        MassToy m = new MassToy ("Alumunium", 2.7);
        System.out.println(m);    
        System.out.println("Massa =" + m.getMass(5.3));
        System.out.println("Density = " + m.getDensity(6));
        System.out.println("Volume =" + m.getVolume(8));
      
    
    
    }
    public static void main(String[] args) {
        test();
      
    }
}
