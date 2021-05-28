/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import java.awt.*;

public class SortingAnimate extends Panel {
public SortingAnimate(){
    setBackground(Color.black); 
}
    @Override
public void paint(Graphics g) { 
    
    int a[]={2,8,4,6,1,3,5,9};
    int b[]={2,8,4,6,1,3,5,9};
    int c[]={2,8,4,6,1,3,5,9};
    
    int i,j,min=0,ii ;
    int t,temp;
    
    String str = new String();
    Font f1=new Font("Times New Roman",Font.PLAIN,30);
    g.setFont(f1);
    g.setColor(Color.green);
    
    judul(g);
    pembuat(g);
    judulbubble(g);
    
    //menuliskan array pada panel untuk bubble sorting
    for(i=0;i<a.length;i++){
        g.setColor(Color.green);
        str=Integer.toString(a[i]);		
        g.drawString(str,112+i*50,135);
    }	
    try {
        Thread.sleep(1000);
    }
    catch(Exception e){
    }

    //pengurutan dan animasi bubble sorting
    for( i=0;i<a.length;i++){
        for( j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                for ( ii = 0;ii<4;ii++){
                    
                    try {
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                    }

                    str=Integer.toString(a[j]);
                    g.setColor(Color.ORANGE);
                    g.drawString(str,112+j*50,135);

                    str=Integer.toString(a[j+1]);
                    g.drawString(str,112+(j+1)*50,135);

                    try {
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                    }

                    str=Integer.toString(a[j]);
                    g.setColor(Color.WHITE);
                    g.drawString(str,112+j*50,135);

                    str=Integer.toString(a[j+1]);
                    g.drawString(str,112+(j+1)*50,135);

                    try {
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                    }       
                }

                str=Integer.toString(a[j]);
                g.setColor(Color.BLACK);
                g.drawString(str,112+j*50,135);

                str=Integer.toString(a[j+1]);
                g.drawString(str,112+(j+1)*50,135);

                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp; 

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }

                str=Integer.toString(a[j]);
                g.setColor(Color.green);
                g.drawString(str,112+j*50,135);

                str=Integer.toString(a[j+1]);
                g.drawString(str,112+(j+1)*50,135);

                try {
                     Thread.sleep(500);
                }
                catch(Exception e){
                }
            }
        }
    }

    
    //Selection
    judulselection(g);
    
    try {
        Thread.sleep(500);
    }
    catch(Exception e){
    }

    //menuliskan array ke panel untuk selection sorting
    for(i=0;i<b.length;i++){
        str=Integer.toString(b[i]);		
        g.drawString(str,112+i*50,205);
    }

    //pengurutan dan animasi selection sorting
    for ( i = 0; i < b.length; i++) {
        min = i;
        for (j=i+1;j<b.length;j++)
            if (b[j] < b[min])
                min = j;

        if (min != i){
            for (ii = 0;ii<4;ii++){
                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }    

                str=Integer.toString(b[min]);
                g.setColor(Color.ORANGE);
                g.drawString(str,112+(min*50),205);

                str=Integer.toString(b[i]);
                g.drawString(str,112+(i*50),205);

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }

                str=Integer.toString(b[min]);
                g.setColor(Color.WHITE);
                g.drawString(str,112+(min*50),205);

                str=Integer.toString(b[i]);
                g.drawString(str,112+(i*50),205);

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }       
            }   

            str=Integer.toString(b[min]);
            g.setColor(Color.black);
            g.drawString(str,112+(min*50),205);

            str=Integer.toString(b[i]);
            g.drawString(str,112+(i*50),205); 

            t = b[min];
            b[min] = b[i];
            b[i] = t;

            try {
                Thread.sleep(500);
                }
            catch(Exception e){
                }

            str=Integer.toString(b[min]);
            g.setColor(Color.green);
            g.drawString(str,112+(min*50),205);

            str=Integer.toString(b[i]);
            g.drawString(str,112+(i*50),205); 
            
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
        }
    }
       
    
    //Insertion Sorting
    judulinsertion(g);
    
    try {
        Thread.sleep(500);
    }
    catch(Exception e){
    }

    for(i=0;i<c.length;i++){
        str=Integer.toString(c[i]);		
        g.drawString(str,112+i*50,273);
    }

    for (i = 1; i < c.length; i++) {
        j = i;
        while (( j > 0) && (c[j] < c[j - 1])) {  
            for (ii = 0;ii<4;ii++){
                
                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }

                str=Integer.toString(c[j]);
                g.setColor(Color.ORANGE);
                g.drawString(str,112+(j*50),273);

                str=Integer.toString(c[j-1]);
                g.drawString(str,112+((j-1)*50),273);

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }

                str=Integer.toString(c[j]);
                g.setColor(Color.WHITE);
                g.drawString(str,112+(j*50),273);

                str=Integer.toString(c[j-1]);
                g.drawString(str,112+((j-1)*50),273);

                try {
                    Thread.sleep(500);
                }
                catch(Exception e){
                }       
            }

            str=Integer.toString(c[j]);
            g.setColor(Color.black);
            g.drawString(str,112+(j*50),273);

            str=Integer.toString(c[j-1]);
            g.drawString(str,112+((j-1)*50),273);

            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }  

            temp = c[j];
            c[j] = c[j - 1];
            c[j - 1] = temp;

            str=Integer.toString(c[j]);
            g.setColor(Color.green);
            g.drawString(str,112+(j*50),273);

            str=Integer.toString(c[j-1]);
            g.drawString(str,112+((j-1)*50),273);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
            } 

            j--;
        }      
    }
         
    selesai(g);
} 

public void judul(Graphics g){
    String jdl = "Visualisasi 3 Pengurutan ";
    String ijdl = new String();
    char[] cjdl = jdl.toCharArray();
    for (int i =0;i<jdl.length();i++){
        ijdl=Character.toString(cjdl[i]);
        g.setColor(Color.green);
        g.drawString(ijdl,50+i*25,25);
    }
}
    
public void pembuat(Graphics g){
    String syams= "oleh syamsul arifin";
    String isyams = new String();
    char[] csyams = syams.toCharArray();
    for (int i=0 ; i<syams.length();i++){
        isyams = Character.toString(csyams[i]);
        g.setColor(Color.yellow);
        g.drawString(isyams,50+i*25,50);
    }
}

 public void judulbubble(Graphics g){
    String jbubble= "bubble sorting";
    String ijbubble = new String();
    char[] cjbubble = jbubble.toCharArray();
    for (int i=0 ; i<jbubble.length();i++){
        ijbubble = Character.toString(cjbubble[i]);
        g.setColor(Color.green);
        g.drawString(ijbubble,50+i*25,100);
    }
}   

public void judulselection(Graphics g){
    String jselection= "selection sorting";
    String ijselection = new String();
    char[] cjselection = jselection.toCharArray();
    for (int i=0 ; i<jselection.length();i++){
        ijselection = Character.toString(cjselection[i]);
        g.setColor(Color.green);
        g.drawString(ijselection,50+i*25,170);
    }
}  

public void judulinsertion(Graphics g){
    String jinsertion= "insertion sorting";
    String ijinsertion = new String();
    char[] cjinsertion = jinsertion.toCharArray();
    for (int i=0 ; i<jinsertion.length();i++){
        ijinsertion = Character.toString(cjinsertion[i]);
        g.setColor(Color.green);
        g.drawString(ijinsertion,50+i*25,240);
    }
}  

public void selesai(Graphics g){
    String selesai= "Selesai dan Terima Kasih";
    String iselesai = new String();
    char[] cselesai = selesai.toCharArray();
    for (int i=0 ; i<selesai.length();i++){
        iselesai = Character.toString(cselesai[i]);
        g.setColor(Color.yellow);
        g.drawString(iselesai,50+i*25,325);
    }
}  

public static void main(String args[]) { 
    Frame f = new Frame("Tugas Praktikum Pemograman"); 
    SortingAnimate gp = new SortingAnimate(); 
    f.add(gp); 
    f.setSize(800, 375); 
    f.setVisible(true); 
} 

}
