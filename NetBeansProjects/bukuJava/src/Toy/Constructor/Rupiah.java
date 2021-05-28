/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toy.Constructor;

/**
 *
 * @author Rizqa Alfiani
 * page 280
 * Latihan OOP Java
 * menampilkan jumlah uang
 */
public class Rupiah {
    long amount = 0;
    
    public Rupiah ( long amount){
        this.amount = amount;
    }
    
    public void setAmount ( long amount){
        this.amount = amount;
    }
    public long getAmount (){
        return amount;
    }
    
    static void test01(){
        System.out.println(new Rupiah(1));
        System.out.println(new Rupiah(30));
        System.out.println(new Rupiah(235));
        System.out.println(new Rupiah(7666));
        System.out.println(new Rupiah(74936));
        System.out.println(new Rupiah(8493002));
        
    }
    
    static void test02(){
        Rupiah t = new Rupiah(848479293482882679L);
        System.out.println("nilai dari 848.479.293.482.882.679 adalah " + t.getText());
        
    }
    
    public static void main(String[] args) {
        test01();
        test02();
        
    }
    
    public String getText(){
        String s = "" + amount;
        String str ="";
        
        //dibawah 1.000
        if (s.length()<4)
            return convert3Dig(Integer.parseInt(s));
        
        //1.000-9.999
        if (s.length()==4)
            return convert4Dig(Integer.parseInt(s));
        
        //10.000-99.999
        if(s.length()>=5 && s.length()<=6)
            return convert5_6Dig(amount);
        
        //1.000.000-999.999.999
        if (s.length()>=7 && s.length()<=9)
            return convert7_9Dig(amount);
        
        //1.000.000.000-999.999.999.999
        if(s.length()>=10 && s.length() <=12)
            return convert10_12Dig (amount);
        
        //1.000.000.000.000-999.999.999.999.9999
        if(s.length()>=13 && s.length()<=15)
            return convert13_15Dig(amount);
        
        //1.000.000.000.000.000-999.999.999.999.999.999
        if(s.length() >= 16 && s.length() <= 18)
            return convert16_18Dig(amount);
        
        return str;
        
    }
    
    public String toString(){
        String str = amount + " adalah " + getText();
        return str;
    }
    
    private String convert1Dig(int n){
        switch(n){
                case 1 : return " satu ";
                case 2 : return " dua ";
                case 3 : return " tiga ";
                case 4 : return " empat ";
                case 5 : return " lima ";
                case 6 : return " enam ";
                case 7 : return " tujuh ";
                case 8 : return " delapan ";
                case 9 : return " sembilan ";
                default : return "";
        }
    }
    
    private String convert10_19( int n){
        switch ( n){
            case 10 : return "sepuluh";
            case 11 : return "sebelas";
            case 12 : return "dua belas";
            case 13 : return "tiga belas";
            case 14 : return "empat belas";
            case 15 : return "lima belas";
            case 16 : return "enam belas";
            case 17 : return "tujuh belas";
            case 18 : return "delapan belas";
            case 19 : return "sembilan belas";
            default : return "";
        }
    }
    
    private String convert2Dig( int n){
        if ( n==0) return "";
        
        if ( n<10) return convert1Dig(n);
        if (n>=10 && n<=19) return convert10_19(n);
        
        int div10 = n/10;
        int mod10 = n%10;
        
        String str= "";
        str += convert1Dig ( div10) + "puluh";
        if (mod10>0) return str + convert1Dig(mod10);
        return str;
    }
    
    private String convert3Dig( int n){
        if ( n==0) return "";
        
        String str = "";
        int div100 = n/100;
        int mod100 = n%100;
        
        switch(div100){
            case 1 : str += " seratus"; break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
                str += convert1Dig(div100) + " ratus "; break;
            default : str +="";
        }
       
        if ( mod100>0) return str + convert2Dig(mod100);
        return str;
    }
    
    private String convert4Dig ( int n){
        if ( n==0) return "";
        
        String str = "";
        int div1000 = n/1000;
        int mod1000 = n%1000;
        
        if ( div1000 == 1) str += "seribu";
        else str += convert1Dig (div1000) + "ribu";
        
        if ( mod1000 > 0) return str += convert3Dig (mod1000);
        return str;
    }
    
    //untuk angka 10k-999k
    private String convert5_6Dig ( long n){
        if ( n==0) return "";
        
        int div1000 = (int) n/1000;
        int mod1000 = ( int) n%1000;
        
        //ex. 00234
        if (div1000==0) return convert3Dig (mod1000);
        //ex. 10.243 sdt
        if ( mod1000 >0) return ( convert3Dig(div1000) + "ribu" + convert3Dig(mod1000));
        //ex. 10.000
        return ( convert3Dig(div1000) + "ribu");
    }
    
    //untuk angka 1jt-999jt
    private String convert7_9Dig ( long n ){
        if ( n==0 ) return "";
        
        int div1jt = (int) (n/1000000L);
        long mod1jt = n%1000000L;
        
        if ( div1jt ==0) return convert5_6Dig ( mod1jt);
        if ( mod1jt >0 ) return convert3Dig(div1jt) + "juta" + convert5_6Dig(mod1jt);
        return (convert3Dig(div1jt) + "juta");
    }
    
    //untuk angka 1M-999M
    private String convert10_12Dig( long n){
        if (n==0) return "";
        
        int div1m =  (int) (n/1000000000L);
        long mod1m = n%1000000000L;
        
        if ( div1m ==0) return convert7_9Dig( mod1m);
        if ( mod1m>0) return convert3Dig(div1m) + "milyar" + convert7_9Dig (mod1m);
        return convert3Dig (div1m) + " milyar ";
    }
    
    //untuk angka 1T-999T
    private String convert13_15Dig( long n){
        if ( n==0) return "";
        
        int div1t = (int) (n/1000000000000L);
        long mod1t = n%1000000000000L;
        
        if (div1t==0) return convert10_12Dig(mod1t);
        if ( mod1t > 0) return convert3Dig(div1t) + "triliun" + convert10_12Dig(mod1t);
        return convert3Dig (div1t) + " triliun";
    
    }
    
    private String convert16_18Dig( long n){
        if(n==0) return "";
        
        int div1qt = (int) (n/1000000000000000L);
        long mod1qt = n%1000000000000000L;
        
        if (div1qt==0) return convert13_15Dig(mod1qt);
        if (mod1qt>0) return convert3Dig(div1qt) + "quadriliun" + convert13_15Dig(mod1qt);
        return convert3Dig(div1qt) + "quadtriliun";
    }
    
    
}
